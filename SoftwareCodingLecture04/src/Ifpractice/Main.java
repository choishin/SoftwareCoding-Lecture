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
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�");
		}
		
	}
	
	public static void rank (int score) {
		if (score >= 90) {
			System.out.println("A���");
		}
		else if (score >= 80) {
			System.out.println("B���");
		}
		else if (score >= 70) {
			System.out.println("C���");
		}
		else {
			System.out.println("D���");
		}
		
	}
}
	

