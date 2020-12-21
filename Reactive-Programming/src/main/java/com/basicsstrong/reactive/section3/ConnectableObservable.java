package com.basicsstrong.reactive.section3;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class ConnectableObservable {

	public static void main(String[] args) throws InterruptedException {
		
		io.reactivex.rxjava3.observables.@NonNull ConnectableObservable<@NonNull Long> source = Observable.interval(1,TimeUnit.SECONDS).publish();
		
		source.connect();
		
		source.subscribe(System.out::println);
		
		Thread.sleep(10000);
		
		source.subscribe(System.out::println);
		
		Thread.sleep(10000);
		
	}
}




