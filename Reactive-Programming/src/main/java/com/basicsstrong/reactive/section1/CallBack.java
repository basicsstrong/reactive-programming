package com.basicsstrong.reactive.section1;

public interface CallBack {
	
	void pushData(String data);
	
	void pushComplete();

	void pushError(Exception ex);
}
