package com.naresh.exception;

public class BookNotFoundException  extends RuntimeException{
	
	public BookNotFoundException(int id) {
	    super("Could not find Book " + id);
	  }

}
