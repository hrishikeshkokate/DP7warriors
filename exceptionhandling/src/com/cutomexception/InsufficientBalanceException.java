package com.cutomexception;

public class InsufficientBalanceException extends RuntimeException{
	
	public InsufficientBalanceException()
	{
		super();
	}
	public InsufficientBalanceException(String message)
	{
		super(message);
	}

}
