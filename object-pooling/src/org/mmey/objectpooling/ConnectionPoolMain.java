package org.mmey.objectpooling;

public class ConnectionPoolMain {

	public static void main(String[] args) {
		ConnectionPool pool = ConnectionPool.getInstance();

	/*	for (int count = 0; count < ConnectionPool.DEFAULT_POOL_SIZE + 5; count++) {
			ReusableConnection connection = pool.acquireConnection();
			if (connection == null) {
				System.out.println(count + ". no more connection available");
				break;
			}
			
			// use the connection
			System.out.println(count + ". Using connection: " + connection.hashCode());
			//pool.releaseConnection(connection);
		} 
		*/
		
		for (int i=0; i<8; i++) {
			WorkerThread thread = new WorkerThread(pool);
			thread.start();
		}		
	}
	
}

class WorkerThread extends Thread {
	
	ConnectionPool pool;
	
	public WorkerThread(ConnectionPool pool) {
		this.pool = pool;
	}
	
	public void run() {
		ReusableConnection connection = pool.acquireConnection();
		
		if (connection == null) {
			System.out.println("\n" + Thread.currentThread().getName() + " no more connection, reached max pool size: " + pool.getPoolSize() + 
								"\nWill rety after 5 seconds...");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				connection = pool.acquireConnection();
			}
		}
		// use the connection
		System.out.println(Thread.currentThread().getName() + ". Using connection: " + connection.hashCode());
		// ...
		// ...
		// release the connObject
		pool.releaseConnection(connection);
		System.out.println(Thread.currentThread().getName() + " has released object: " + connection.hashCode());
	}
}
