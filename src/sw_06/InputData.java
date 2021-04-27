package sw_06;

public class InputData {
	int k21_iPerson;		// 인원수 변수 선언
	String[] k21_name;		// 이름 배열 선언
	int[] k21_kor;			// 국어 점수 변수 선언
	int[] k21_eng;			// 영어 점수 변수 선언
	int[] k21_mat;			// 수학 점수 변수 선언
	int[] k21_sum;			// 총 점수 변수 선언
	double[] k21_ave;		// 평균 점수 변수 선언
	
	InputData(int k21_iPerson) {	// 생성자 있는 클래스로 선언
		this.k21_iPerson = k21_iPerson;	// 받은 파라미터로 인원수 설정
		this.k21_name = new String[k21_iPerson];	// 인원수 만큼 이름 배열 생성
		this.k21_kor = new int[k21_iPerson];	// 인원수 만큼 국어 배열 생성
		this.k21_eng = new int[k21_iPerson];	// 인원수 만큼 영어 배열 생성
		this.k21_mat = new int[k21_iPerson];	// 인원수 만큼 수학 배열 생성
		this.k21_sum = new int[k21_iPerson];	// 인원수 만큼 총점 배열 생성
		this.k21_ave = new double[k21_iPerson];	// 인원수 만큼 평균 배열 생성
	}
	// 받은 파라미터 값으로 각 배열을 채우는 매서드 생성
	void setData(int i, String k21_name, int k21_kor, int k21_eng, int k21_mat) { // 생성자 선언
		this.k21_name[i] = k21_name;			// i 번째에 이름 저장
		this.k21_kor[i] = k21_kor;			// i 번째에 국어 저장
		this.k21_eng[i] = k21_eng;			// i 번째에 영어 저장
		this.k21_mat[i] = k21_mat;			// i 번째에 수학 저장
		this.k21_sum[i] = k21_kor+k21_eng+k21_mat;			// i 번째에 총점 계산값 저장
		this.k21_ave[i] = (k21_kor+k21_eng+k21_mat)/3;	// i 번째에 평균 계산값 저장
	}
	
}
