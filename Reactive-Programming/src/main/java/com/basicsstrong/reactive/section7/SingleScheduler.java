package com.basicsstrong.reactive.section7;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SingleScheduler {

	public static void main(String[] args) throws InterruptedException {
		
		Observable<String> src = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
								.subscribeOn(Schedulers.single());
		
		src.subscribe(e -> sensitiveTask());
		src.subscribe(e -> sensitiveTask());
		src.subscribe(e -> sensitiveTask());
		src.subscribe(e -> sensitiveTask());
		src.subscribe(e -> sensitiveTask());
		src.subscribe(e -> sensitiveTask());
		
		Thread.sleep(500000);
	}
	
	
	public static void sensitiveTask() throws InterruptedException {
		
			Thread.sleep(1000);
			System.out.println("Computation Done By : "+ Thread.currentThread().getName());
	}

}

