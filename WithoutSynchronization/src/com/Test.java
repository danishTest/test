package com;

public class Test implements Runnable {

	private static int counter = 0;
	
	public void run(){
		synchronized(Test.class){
		while(counter < 10){
			System.out.println("["+Thread.currentThread().getName()+"] before: "+counter);
			counter++;
			System.out.println("["+Thread.currentThread().getName()+"] after: "+counter);
			}		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] threads = new Thread[5];
		for(int i = 0;i < threads.length;i++){
			threads[i] = new Thread(new Test(),"Thread "+i);
			threads[i].start();
		}
		
		System.out.println("This is not good");
	}
	
	public void check(){
		System.out.println("Check");
	}

}
