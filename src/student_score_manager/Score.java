package student_score_manager;

public class Score {
	int math;
	int eng;
	int kor;
	float avg;
	int total;
	String name;

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Score setMath(int math) {
		this.math = math;
		return this;

	}

	public int getMath() {
		return this.math;

	}

	public Score setKor(int kor) {
		this.kor = kor;
		return this;

	}

	public int getKor() {
		return this.kor;

	}

	public Score setEng(int eng) {
		this.eng = eng;
		return this;

	}

	public int getEng() {
		return this.eng;

	}

	public Score setName(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return this.name;
	}
}
