/*
  Author : 
   When : 
  Objectives : 
  Environment : OS(Window 10), JDK Version(OpenJDK 11.0.16), Editor(Eclipse 2022-6)
*/


import java.util.Scanner;

public class studentinfo {
	public static void main(String[] args) { // 프로그램 시작과 끝		
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 이름 ? : ");
		String name = sc.nextLine();
				
		System.out.print("학생 학번 ? : ");
		String hacbun = sc.nextLine();
		
		System.out.print("주소 ? : ");
		String address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + hacbun);
		System.out.println("주소 : " + address);
	}
}
