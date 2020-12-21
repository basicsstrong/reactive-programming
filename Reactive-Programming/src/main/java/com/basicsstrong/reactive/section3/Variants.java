package com.basicsstrong.reactive.section3;

import java.util.LinkedList;
import java.util.Queue;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class Variants {

	public static void main(String[] args) {
		
		Observable<String> source = Observable.just("Alex", "Justin", "Jack");
		Observable<String> source1 = Observable.empty();
		
		
		
		
		source1
		.first("Name")
		.subscribe(System.out::println);
		
		Single.just("Alex")
		.subscribe(System.out::println);
		
		
		source1
		.firstElement()
		.subscribe(System.out::println, e-> e.printStackTrace(), () -> System.out.println("Completed"));
		
		Completable completable = Completable.complete();
		
		System.out.println();
		
		completable.subscribe(() -> System.out.println("Completed"));
		
		Completable
		.fromRunnable(() -> System.out.println("Some process executing"))
		.subscribe(()-> System.out.println("The process executed succesfully"));
		
	}

}
