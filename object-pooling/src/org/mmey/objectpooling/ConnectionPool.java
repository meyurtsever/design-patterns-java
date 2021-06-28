package org.mmey.objectpooling;

import java.util.ArrayList;

public class ConnectionPool {
	
	public static final int DEFAULT_POOL_SIZE = 4;	
	private int poolSize = DEFAULT_POOL_SIZE;

	private ArrayList<ReusableConnection> connectionPool;
	
	private static ConnectionPool instance = null;
	
	private ConnectionPool() {
        connectionPool = new ArrayList<ReusableConnection>();
    }
	
	// SINGLETON
    public static ConnectionPool getInstance() {
    	
    	// critical section
    	Lock lock = new Lock();
          
        if (instance == null) {
            instance = new ConnectionPool();
        }
        
        lock.release();
        // critical section
        
        return instance;
    }
    
    public ReusableConnection acquireConnection() {
        
    	Lock lock = new Lock();  
    	
        // Bosta bir object ara, kullanimda degilse return et.
        for ( ReusableConnection connection : connectionPool) {
            if ( !connection.isInUse() ) {
            	connection.setInUse(true);
                lock.release();
                return connection;
            }
        }
        // Tum nesneler kullanimda, nesne uretebilmek icin pool size kontrol et.
        if (connectionPool.size() >= getPoolSize()) {
            //System.out.println("All connections in pool are in use!!!");
            lock.release();
            return null;
        }
        
        // pool size dolmamis, yeni nesne uretebiliriz.
        ReusableConnection connection = new ReusableConnection();
        connection.setInUse(true);
        connectionPool.add(connection);
        
        lock.release();
        return connection;
    }
    
    public void releaseConnection(ReusableConnection object) {
        Lock lock = new Lock();
        
        int idx  = connectionPool.indexOf(object);
        ReusableConnection connection = connectionPool.get(idx);
        
        // kullanim durumunu kaldiriyoruz. nesne bosa duser.
        connection.setInUse(false);
        
        lock.release();
    }
    
    public int getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(int poolSize) {
		this.poolSize = poolSize;
	}
}
