package sw_06;

public class DataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k21_iPerson = 10;			// 인원수 10명
		
		InputData k21_inData = new InputData(k21_iPerson);	// 10명에 대한 배열 생성
		
		for (int k21_i = 0; k21_i < k21_iPerson; k21_i++) {		// 인원수만큼 반복하면서
			String k21_name = String.format("홍길%02d", k21_i);	// 이름 생성
			int k21_kor = (int)(Math.random()*100);		// 랜덤으로 국어 점수(0~100점) 생성
			int k21_eng = (int)(Math.random()*100);		// 랜덤으로 영어 점수(0~100점) 생성
			int k21_mat = (int)(Math.random()*100);		// 랜덤으로 수학 점수(0~100점) 생성
			k21_inData.setData(k21_i, k21_name, k21_kor, k21_eng, k21_mat);		// 생성한 이름, 점수 setData 매서드 이용해서 저장 
			
		}
		for (int i = 0; i < k21_iPerson; i++) {		// 인원수만큼 반복하면서 각 배열의 i 번째 값 출력
			System.out.printf("번호: %02d, 이름: %s, 국어: %3s, 영어:%3d, 수학: %3d, 총점: %3d, 평균: %f\n", 
					i, k21_inData.k21_name[i], k21_inData.k21_kor[i], k21_inData.k21_eng[i], k21_inData.k21_mat[i], k21_inData.k21_sum[i], k21_inData.k21_ave[i]);
		}
	}

}
