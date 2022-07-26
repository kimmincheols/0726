
public class Studentinfo2 {											//public class는 하나만 사용이 가능하다.
	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.name = "김철수";
		chulsu.hakbun = "2022-001";
		chulsu.kor = 80;
		chulsu.eng = 100;
		chulsu.met = 85;
		
		int total = chulsu.kor + chulsu.eng + chulsu.met;
		double avg = total / 3.;					//소수점이 붙으면 실수로 인식하여 0. < 이하의 값까지 계산가능, int는 정수이기때문에 정수/정수 = 정수

		System.out.printf("총점 : %d\n", total);
		System.out.println("평균 : " + avg);
	}
}

class Student{	// 객체의 설계도
	String name;	//멤버, Field
	String hakbun;
	int kor;
	int eng;
	int met;
}