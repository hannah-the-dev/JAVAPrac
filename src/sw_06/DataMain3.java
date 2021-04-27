package sw_06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k21_iPerson = 200;			// 인원수 30명
		
		InputData3 k21_inData = new InputData3(k21_iPerson);	// 10명에 대한 배열 생성
		
		for (int k21_i = 0; k21_i < k21_iPerson; k21_i++) {		// 인원수만큼 반복하면서
			String k21_name = String.format("홍길%02d", k21_i);	// 이름 생성
			int k21_kor = (int)(Math.random()*100);		// 랜덤으로 국어 점수(0~100점) 생성
			int k21_eng = (int)(Math.random()*100);		// 랜덤으로 영어 점수(0~100점) 생성
			int k21_mat = (int)(Math.random()*100);		// 랜덤으로 수학 점수(0~100점) 생성
			k21_inData.setData(k21_i, k21_name, k21_kor, k21_eng, k21_mat);		// 생성한 이름, 점수 setData 매서드 이용해서 저장 
		}

		SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");		// 날짜 포맷 생성
		Calendar k21_cal = Calendar.getInstance();									// 현재 시스템 시간 저장
		k21_inData.printSheets(30, k21_sdf.format(k21_cal.getTime()));
	}
}
