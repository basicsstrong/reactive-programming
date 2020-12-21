package com.basicsstrong.reactive.section6;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.UnicastSubject;

public class SubjectTypes {

	public static void main(String[] args) throws InterruptedException {
		
		Subject<Long> subject = UnicastSubject.create();
		
		Observable.interval(500, TimeUnit.MILLISECONDS)
		.subscribe(subject);
		
		Thread.sleep(2000);
			
		
		subject.subscribe(e -> System.out.println("Subscriber 1: "+ e));
		
		Thread.sleep(2000);
		
//		subject.onNext("a");
//		subject.onNext("b");
//		subject.onNext("c");
//		
//		//subject.subscribe(e -> System.out.println("Subscriber 2: "+ e));
//		
//		subject.onNext("d");
//		subject.onNext("e");
//		subject.onComplete();


	}

}
