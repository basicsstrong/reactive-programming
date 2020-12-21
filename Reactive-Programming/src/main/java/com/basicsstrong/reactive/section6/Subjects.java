package com.basicsstrong.reactive.section6;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class Subjects {

	public static void main(String[] args) throws InterruptedException {
		
		@NonNull
		Observable<Integer> src1 = Observable.just(5,10,15,20)
			.subscribeOn(Schedulers.computation());
		
		Observable<Integer> src2 = Observable.just(50,100,150,200)
		.subscribeOn(Schedulers.computation());
		
//		src1.subscribe(e -> System.out.println(e));		
//		src2.subscribe(e -> System.out.println(e));	
		
		@NonNull
		Subject<Object> subject = PublishSubject.create();
		
		subject.subscribe(e -> System.out.println(e));  //Observer 1
		
		subject.onNext("Hello");
		subject.onComplete();
		subject.onNext("BasicsStrong");
		
		//subject.subscribe(e -> System.out.println("The element is "+ e)); //Observer 2
		
		src1.subscribe(subject);   //source 1
		src2.subscribe(subject);	//source 2
		
		Thread.sleep(9000);
		
	}

}
