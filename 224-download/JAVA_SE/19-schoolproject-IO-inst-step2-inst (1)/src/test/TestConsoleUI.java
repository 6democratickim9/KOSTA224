package test;

import java.io.IOException;

import view.ConsoleInstUI6;

public class TestConsoleUI {
	public static void main(String[] args) {
		//내꺼 테스트 
		//ConsoleUI ui=new ConsoleUI();
		//풀이본 테스트 
		ConsoleInstUI6 ui=new ConsoleInstUI6();
		try {
			ui.execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
