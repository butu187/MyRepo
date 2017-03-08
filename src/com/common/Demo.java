package com.common;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void main() {
		Reporter.log("Maa",true);

	}
	public static void login(){
		System.out.println("login block");
	}
	
}
