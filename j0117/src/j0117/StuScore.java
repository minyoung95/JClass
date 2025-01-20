package j0117;

public class StuScore {
	
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	void cal_total() {
		total = kor+eng+math;
	}
	void cal_avg() {
		avg = (kor+eng+math)/3.0;
	}
	
}
