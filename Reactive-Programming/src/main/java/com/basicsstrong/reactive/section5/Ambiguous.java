package com.basicsstrong.reactive.section5;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Ambiguous{

	public static void main(String[] args) throws InterruptedException {
		
		Observable<String> ob1 = Observable.interval(1, TimeUnit.SECONDS).take(10)
								.map(e -> "Ob 1 :"+e);
		Observable<String> ob2 = Observable.interval(10, TimeUnit.MILLISECONDS).take(10)
								.map(e -> "Ob 2 :"+e);
		
		Observable.amb(Arrays.asList(ob1,ob2))
		.subscribe(System.out::println);
		
		Thread.sleep(11000);
	
	}

}
