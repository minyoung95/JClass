package j0120;

public class StuScore {
	
	{
		++count;
		this.no = count;
	} // 초기화 블럭
	
	StuScore(){} // 기본생성자
	
	StuScore(String name, int kor, int eng, int math){

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		
	} // 매개변수생성자
		
	// 학생성적
	static int count; // 공용
	int no; // 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	// 출력
	void print() {
		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f\n",no,name,kor,eng,math,total,avg);
	}
	
}
