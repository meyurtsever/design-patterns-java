package org.mmey.objectpooling;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mutex {
	
	static private Lock reentrantLock = new ReentrantLock();

	public void acquire()	{
		reentrantLock.lock();
	}

	public void release()	{
		reentrantLock.unlock();
	}
}
