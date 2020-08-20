package com.wipro.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		FileReader fr = new FileReader("C:/Users/sai phani/eclipse-workspace/Java 8 Assignments/src/com/wipro/nashorn/VerifyPrimeNumber.js");
		engine.eval(fr);
		Invocable invocable = (Invocable)engine;
		System.out.println("Enter a Number : ");
		int number = new Scanner(System.in).nextInt();
		if((boolean) invocable.invokeFunction("verifyPrime", number))
		{
			System.out.println("The entered number is Prime");
		}
		else
		{
			System.out.println("The entered number is not Prime");
		}
	}

}
