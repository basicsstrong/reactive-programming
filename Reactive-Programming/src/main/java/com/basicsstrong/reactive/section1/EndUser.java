package com.basicsstrong.reactive.section1;

public class EndUser implements Observer {
	
	String name;
	
	EndUser(String name, SubjectLibrary subject) {
		this.name = name;
		subject.subscribeObserver(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void update(String avail) {
		System.out.println("Hello "+ name + "! we are glad to notify you that your book is now "+ avail);
		
	}

}
