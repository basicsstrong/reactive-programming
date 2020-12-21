package com.basicsstrong.reactive.section1;

public class CallBackDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread is running");
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				new CallBackDemo().runningAsync(new CallBack() {

					@Override
					public void pushData(String data) {
						System.out.println("CallBack data :" + data);
					}

					@Override
					public void pushComplete() {
						System.out.println("Callback done !");
						
					}

					@Override
					public void pushError(Exception ex) {
						System.out.println("Callback Error called, Got an Exception :" + ex);
					}

					
					
				});
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		
		Thread.sleep(2000);
		
		System.out.println("Main thread Completed!");
		

	}
	
	public void runningAsync(CallBack callback) {
		System.out.println("I am running in saperate thread");
		sleep(1000);
		callback.pushData("Data1");
		callback.pushData("Data2");
		callback.pushData("Data3");
		
		callback.pushError(new RuntimeException("Oops!"));
		callback.pushComplete();
		
	}

	private void sleep(int duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
