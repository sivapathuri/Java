package com.test;

import java.util.concurrent.Semaphore;

public class DeadLockTest {

	public static void main(String[] args) {
		final Object obj1 = new Object();
		final Object obj2 = new Object();
		
		final Semaphore sem1 = new Semaphore(1);
		final Semaphore sem2 = new Semaphore(1);
		
		// Thread-1
        Runnable block1 = new Runnable() {
            public void run() {
            	System.out.println("Block 1");
                synchronized (obj1) {
                    try {
                        // Adding delay so that both threads can start trying to
                        // lock resources
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Thread-1 have A but need B also
                    synchronized (obj2) {
                        System.out.println("In block 1");
                    }
                }
            }
        };
 
        // Thread-2
        Runnable block2 = new Runnable() {
            public void run() {
            	System.out.println("Block 2");
                synchronized (obj2) {
                    // Thread-2 have B but need A also
                	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    synchronized (obj1) {
                        System.out.println("In block 2");
                    }
                }
            }
        };
 
        new Thread(block1).start();
        new Thread(block2).start();
	}
}
