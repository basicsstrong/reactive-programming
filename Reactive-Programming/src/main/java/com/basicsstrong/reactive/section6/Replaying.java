package com.basicsstrong.reactive.section6;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class Replaying {

	public static void main(String[] args) throws InterruptedException {
		
		
		@NonNull
		Observable<@NonNull Long> src = Observable.interval(1, TimeUnit.SECONDS)
		.replay(2,4,TimeUnit.SECONDS)
		.autoConnect();
		
		src.subscribe(e -> System.out.println("Observer 1 : "+e));
		
		Thread.sleep(5000);
		
		src.subscribe(e -> System.out.println("Observer 2 : "+e));
		
		Thread.sleep(3000);
	}

}
