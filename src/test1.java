import java.util.*;
public class test1 {										
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("학번 : ");
			String hakbun = sc.nextLine();

			System.out.println("이름 : ");
			String name = sc.nextLine();

			System.out.println("국어 : ");
			int kor = sc.nextInt();
			
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			
			System.out.println("수학 : ");
			int met = sc.nextInt();
			

		int total = kor + eng + met;
		double avg = total / 3.;
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f", avg);
	}
}
