package com.basicsstrong.reactive.section2;

import io.reactivex.rxjava3.core.Observable;

public class HelloRxJava {

	public static void main(String[] args) {

		Observable<String> source = Observable.create(
				
				e -> {
					e.onNext("Hello");
					e.onNext("RxJava");
				}
				);
		
		
		source.subscribe(e -> System.out.println("Observer 1 :"+e + " Thread Name : "+ Thread.currentThread().getName()));
		
		source.subscribe(e -> System.out.println("Observer 2 :"+e + " Thread Name : "+ Thread.currentThread().getName()));
				
	}

}
