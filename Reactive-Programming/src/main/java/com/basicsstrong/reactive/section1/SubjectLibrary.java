package com.basicsstrong.reactive.section1;

public interface SubjectLibrary {
	
	public void subscribeObserver(Observer ob);
	
	public void unsubscribeObserver(Observer ob);
	
	public void notifyObserver();

}
