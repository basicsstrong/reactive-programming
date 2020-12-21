package com.basicsstrong.reactive.section7;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class NewThreadScheduler {

	public static void main(String[] args) throws InterruptedException {
		
		Observable<String> src = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
								.subscribeOn(Schedulers.newThread());
		
		src.subscribe(e -> task());
		
		Thread.sleep(6000);
		src.subscribe(e -> task());
		src.subscribe(e -> task());
		src.subscribe(e -> task());
		src.subscribe(e -> task());
		
		Thread.sleep(500000);
	}
	
	
	public static void task() throws InterruptedException {
		
			Thread.sleep(1000);
			System.out.println("Computation Done By : "+ Thread.currentThread().getName());
	}

}

