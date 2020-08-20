package com.wipro.nashorn;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Assignment3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		FileReader fr = new FileReader("C:/Users/sai phani/eclipse-workspace/Java 8 Assignments/src/com/wipro/nashorn/assignment3.js");
		engine.eval(fr);
	}
}
