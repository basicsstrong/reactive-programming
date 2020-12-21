package com.basicsstrong.reactive.section3;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

public class Disposing {
	
	private static final CompositeDisposable disp = new CompositeDisposable();

	public static void main(String[] args) throws InterruptedException {
		
		
		@NonNull
		Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS);
		
		@NonNull
		Disposable d1 = src.subscribe(e -> System.out.println("Observer 1 : "+ e));
		Disposable d2 = src.subscribe(e -> System.out.println("Observer 2 : "+ e));
		
		Thread.sleep(5000);
		
		disp.addAll(d1, d2);
		
		disp.dispose();
		
		Thread.sleep(10000);

	}

}
