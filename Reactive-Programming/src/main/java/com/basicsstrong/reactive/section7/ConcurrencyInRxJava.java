package com.basicsstrong.reactive.section7;

import io.reactivex.rxjava3.core.Observable;

public class ConcurrencyInRxJava {

	public static void main(String[] args) {
		
		Observable<String> source = Observable.create(
				
				e -> {
					new Thread( () ->
					{
						e.onNext("Hello");
						e.onNext("RxJava");
					}
						).start();
				}
				);
		
		source
		.subscribe(e -> System.out.println("Observer 1 :"+e + " Thread is :" +Thread.currentThread().getName()));
		
		source
		.subscribe(e -> System.out.println("Observer 2 :"+e+ " Thread is :" +Thread.currentThread().getName()));
		
	}

}
