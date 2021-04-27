package sw_06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k21_iPerson = 30;			// 인원수 30명
		int k21_korSum = 0;				// 국어 sum 값 저장
		int k21_engSum = 0;				// 영어 sum 값 저장
		int k21_matSum = 0;				// 수학 sum 값 저장
		int k21_sumSum = 0;				// 총점 sum 값 저장
		
		InputData k21_inData = new InputData(k21_iPerson);	// 10명에 대한 배열 생성
		
		for (int k21_i = 0; k21_i < k21_iPerson; k21_i++) {		// 인원수만큼 반복하면서
			String k21_name = String.format("홍길%02d", k21_i);	// 이름 생성
			int k21_kor = (int)(Math.random()*100);		// 랜덤으로 국어 점수(0~100점) 생성
			int k21_eng = (int)(Math.random()*100);		// 랜덤으로 영어 점수(0~100점) 생성
			int k21_mat = (int)(Math.random()*100);		// 랜덤으로 수학 점수(0~100점) 생성
			k21_inData.setData(k21_i, k21_name, k21_kor, k21_eng, k21_mat);		// 생성한 이름, 점수 setData 매서드 이용해서 저장 
			k21_korSum += k21_kor; 							// 국어 sum 업데이트
			k21_engSum += k21_eng; 							// 영어 sum 업데이트 
			k21_matSum += k21_mat;  						// 수학 sum 업데이트
			k21_sumSum += k21_kor+k21_eng+k21_mat;					// 총점 sum 업데이트
		}

		SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");		// 날짜 포맷 생성
		Calendar k21_cal = Calendar.getInstance();									// 현재 시스템 시간 저장
		System.out.printf("			성적 집계표\n");							
		System.out.printf("                                  출력일자: %s\n", k21_sdf.format(k21_cal.getTime())); // 현재시간 출력
		System.out.printf("==================================================================\n");
		System.out.printf("번호	이름      국어  영어  수학  총점    평균\n"); 
		System.out.printf("==================================================================\n");
		for (int k21_i = 0; k21_i < k21_iPerson; k21_i++) {		// 인원수만큼 반복하면서 각 배열의 i 번째 값 출력
			System.out.printf("%03d	%-5s %6d %5d %5d %5d   %5.0f\n", 				// 각 값 출력
					k21_i+1, k21_inData.k21_name[k21_i],
					k21_inData.k21_kor[k21_i], k21_inData.k21_eng[k21_i], k21_inData.k21_mat[k21_i], 
					k21_inData.k21_sum[k21_i], k21_inData.k21_ave[k21_i]);
		}
		System.out.printf("==================================================================\n");
		System.out.printf("합계 %17d %5d %5d %5d   %5.0f", k21_korSum, k21_engSum, k21_matSum, k21_sumSum, k21_sumSum/k21_iPerson*1.0); // 각 값 출력
	}
}
