package com.throww;
import java.io.IOException;
public class CheckedException {
	
	public static void main(String[] args) throws IOException, ArithmeticException{
		
		throw new ArithmeticException("Divide by zero");
		
		//throw new IOException("Input Error");
		
	}

}