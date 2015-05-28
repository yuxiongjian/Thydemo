package com.jt.pojo;

import java.util.Date;

import project.pojo.Bpojo;



public class MyReturn extends Bpojo {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = MyReturn.class.hashCode();
	public MyReturn(Date mydate, Integer myInteger, String myString,
			Double myDouble) {
		super();
		this.mydate = mydate;
		this.myInteger = myInteger;
		this.myString = myString;
		this.myDouble = myDouble;
	}
	Date mydate;
	Integer myInteger;
	String myString;
	Double myDouble;

}
