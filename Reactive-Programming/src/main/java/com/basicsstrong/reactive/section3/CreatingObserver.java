package com.basicsstrong.reactive.section3;

import io.reactivex.rxjava3.core.Observable;

public class CreatingObserver {

	public static void main(String[] args) {
		
		
		Observable<String> source = Observable.just("Orange", "Black", "Red");
		
		source.subscribe(i -> System.out.println(i), Throwable :: printStackTrace, () -> System.out.println("Completed!"));
		
		System.out.println();
		
		source.subscribe(i -> System.out.println(i), Throwable :: printStackTrace);
		
		System.out.println();
		
		source.subscribe(i -> System.out.println(i));
		

	}

}
