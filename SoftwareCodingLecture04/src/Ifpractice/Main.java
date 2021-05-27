package Ifpractice;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a score");
		int score = scanner.nextInt();
		pass(score);
		rank(score);

	}//main
	
	public static void pass (int score) {
		
		if (score > 60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다");
		}
		
	}
	
	public static void rank (int score) {
		if (score >= 90) {
			System.out.println("A등급");
		}
		else if (score >= 80) {
			System.out.println("B등급");
		}
		else if (score >= 70) {
			System.out.println("C등급");
		}
		else {
			System.out.println("D등급");
		}
		
	}
}
	

