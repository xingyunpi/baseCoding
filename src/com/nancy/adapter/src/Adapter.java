package com.nancy.adapter.src;

public class Adapter extends Adaptee implements Target{
	@Override
	public void request(){
		System.out.println("request method");
	}
	

}
