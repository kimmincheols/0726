import java.util.*;

public class test1R {
	public static void main(String[] args) {
		Student jimin = new Student();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("학번 : ");
		jimin.hakbun = sc.nextLine();
		
		System.out.println("이름 : ");
		jimin.name = sc.nextLine();
		
		System.out.println("국어 : ");
		jimin.kor= sc.nextInt();
		
		System.out.println("영어 : ");
		jimin.eng = sc.nextInt();
		
		System.out.println("수학 : ");
		jimin.met = sc.nextInt();
		
		int total = jimin.kor + jimin.eng + jimin.met;
		double avr = total/3.;
		
		System.out.printf("학번 : %s\n", jimin.hakbun);
		System.out.printf("이름 : %s\n", jimin.name);
		System.out.printf("국어 : %d\n", jimin.kor);
		System.out.printf("영어 : %d\n", jimin.eng);
		System.out.printf("수학 : %d\n", jimin.met);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f", avr);
		
	}
}
