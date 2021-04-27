package sw_06;

public class InputData3 {
	int k21_iPerson;		// 인원수 변수 선언
	String[] k21_name;		// 이름 배열 선언
	int[] k21_kor;			// 국어 점수 변수 선언
	int[] k21_eng;			// 영어 점수 변수 선언
	int[] k21_mat;			// 수학 점수 변수 선언
	int[] k21_sum;			// 총 점수 변수 선언
	double[] k21_ave;		// 평균 점수 변수 선언
	int k21_korSum = 0;		// 국어 점수 페이지 별 합계 
	int k21_engSum = 0;		// 영어 점수 페이지 별 합계 
	int k21_matSum = 0;		// 수학 점수 페이지 별 합계 
	int k21_sumSum = 0;		// 총점 페이지 별 합계 
	int k21_korAllSum = 0;	// 국어 점수 총 합계 
	int k21_engAllSum = 0;	// 영어 점수 총 합계
	int k21_matAllSum = 0;	// 수학 점수 총 합계 
	int k21_sumAllSum = 0;	// 총점 총 합계 
	double k21_aveSum = 0;	// 평균 점수 페이지 별 합계 
	double k21_aveAllSum = 0;// 평균 점수 총 합계
	
	
	InputData3(int k21_iPerson) {	// 생성자 있는 클래스로 선언
		this.k21_iPerson = k21_iPerson;	// 받은 파라미터로 인원수 설정
		this.k21_name = new String[k21_iPerson];	// 인원수 만큼 이름 배열 생성
		this.k21_kor = new int[k21_iPerson];	// 인원수 만큼 국어 배열 생성
		this.k21_eng = new int[k21_iPerson];	// 인원수 만큼 영어 배열 생성
		this.k21_mat = new int[k21_iPerson];	// 인원수 만큼 수학 배열 생성
		this.k21_sum = new int[k21_iPerson];	// 인원수 만큼 총점 배열 생성
		this.k21_ave = new double[k21_iPerson];	// 인원수 만큼 평균 배열 생성
	}
	// 받은 파라미터 값으로 각 배열을 채우는 매서드 생성
	void setData(int k21_i, String k21_name, int k21_kor, int k21_eng, int k21_mat) { // 생성자 선언
		this.k21_name[k21_i] = k21_name;			// i 번째에 이름 저장
		this.k21_kor[k21_i] = k21_kor;			// i 번째에 국어 저장
		this.k21_eng[k21_i] = k21_eng;			// i 번째에 영어 저장
		this.k21_mat[k21_i] = k21_mat;			// i 번째에 수학 저장
		this.k21_sum[k21_i] = k21_kor+k21_eng+k21_mat;			// i 번째에 총점 계산값 저장
		this.k21_ave[k21_i] = (k21_kor+k21_eng+k21_mat)/3;	// i 번째에 평균 계산값 저장
	}
	void printSheets(int k21_pages, String k21_date) {
		for (int k21_i = 0; k21_i < k21_iPerson; k21_i++) {		// 인원수만큼 반복하면서 각 배열의 i 번째 값 출력
			int pageNo = (k21_i/k21_pages) + 1;			// 페이지 번호는 1부터 시작
			
			if (k21_i % (k21_pages) == 0) {			// 페이지 첫순번: 0, 30, ...
				System.out.printf("\n			성적 집계표\n");							
				System.out.printf("PAGE: %d                          출력일자: %s\n", 
						(k21_i/k21_pages) + 1, k21_date); // 입력받은시간 출력
				System.out.printf("==================================================================\n");
				System.out.printf("번호	이름      국어  영어  수학  총점    평균\n"); 
				System.out.printf("==================================================================\n");
			}
			System.out.printf("%03d	%-5s %6d %5d %5d %5d   %5.0f\n", 				// 각 값 출력
					k21_i+1, k21_name[k21_i], k21_kor[k21_i], k21_eng[k21_i], k21_mat[k21_i], 
					k21_sum[k21_i], k21_ave[k21_i]);
			k21_korSum += k21_kor[k21_i];				// 국어점수 합계
			k21_engSum += k21_eng[k21_i];				// 영어점수 합계
			k21_matSum += k21_mat[k21_i];				// 수학점수 합계
			k21_sumSum += k21_kor[k21_i]+k21_eng[k21_i]+k21_mat[k21_i];  // 총점 합계
			k21_aveSum += (k21_kor[k21_i]+k21_eng[k21_i]+k21_mat[k21_i])/3; // 평균 합계
			k21_korAllSum += k21_kor[k21_i];			// 국어 점수 합계
			k21_engAllSum += k21_eng[k21_i];			// 영어 점수 합계
			k21_matAllSum += k21_mat[k21_i];			// 수학 점수 합계
			k21_sumAllSum += k21_kor[k21_i]+k21_eng[k21_i]+k21_mat[k21_i];			// 총점 합계
			k21_aveAllSum += (k21_kor[k21_i]+k21_eng[k21_i]+k21_mat[k21_i])/3;		// 평균 합계
			
			if (k21_i % (k21_pages) == k21_pages-1) {				// 페이지 마지막 i = 29, 59, ...
				System.out.printf("==================================================================\n");
				System.out.printf("현재 페이지\n");							
				System.out.printf("합계 %17d %5d %5d %5d   %5.0f\n", k21_korSum, k21_engSum, k21_matSum, 
						k21_sumSum, k21_aveSum); // 페이지 데이터 출력
				// 페이지 데이터를 페이지 당 행 수로 나눠서 출력
				System.out.printf("평균 %17d %5d %5d %5d   %5.0f\n", k21_korSum/k21_pages, k21_engSum/k21_pages, 
						k21_matSum/k21_pages, k21_sumSum/k21_pages, k21_aveSum/k21_pages); 
				System.out.printf("누적 페이지\n");							
				System.out.printf("합계 %17d %5d %5d %5d   %5.0f\n", k21_korAllSum, k21_engAllSum, k21_matAllSum, 
						k21_sumAllSum, k21_aveAllSum); // 전체 데이터 출력
				System.out.printf("평균 %17d %5d %5d %5d   %5.0f\n", k21_korAllSum/(k21_i+1), 
						k21_engAllSum/(k21_i+1), k21_matAllSum/(k21_i+1), 
						k21_sumAllSum/(k21_i+1), k21_aveAllSum/(k21_i+1)); // 전체 데이터를 순번+1(번호)로 나눠서 출력
				System.out.printf("==================================================================\n");
//				페이지 별 점수 초기화
				k21_korSum = 0;
				k21_engSum = 0;
				k21_matSum = 0;
				k21_sumSum = 0;
				k21_aveSum = 0;
			} else if (k21_i == k21_iPerson-1) {  // 페이지 마지막이지만 i가 30으로 나눠떨어지지 않으면
				System.out.printf("==================================================================\n");
				System.out.printf("현재 페이지\n");							
				System.out.printf("합계 %17d %5d %5d %5d   %5.0f\n", k21_korSum, k21_engSum, k21_matSum, 
						k21_sumSum, k21_aveSum); //페이지 데이터 출력
				System.out.printf("평균 %17d %5d %5d %5d   %5.0f\n", k21_korSum/((k21_i+1) % k21_pages), 
						k21_engSum/((k21_i+1) % k21_pages), 
						k21_matSum/((k21_i+1) % k21_pages), 
						k21_sumSum/((k21_i+1) % k21_pages), 
						k21_aveSum/((k21_i+1) % k21_pages)); // 페이지 데이터를 남은 행수로 나눠 출력
				System.out.printf("누적 페이지\n");							
				System.out.printf("합계 %17d %5d %5d %5d   %5.0f\n", k21_korAllSum, k21_engAllSum, k21_matAllSum, 
						k21_sumAllSum, k21_aveAllSum); // 전체 데이터 출력
				// 전체 데이터를 순번+1로 나눠서 출력
				System.out.printf("평균 %17d %5d %5d %5d   %5.0f\n", k21_korAllSum/(k21_i+1), k21_engAllSum/(k21_i+1), 
						k21_matAllSum/(k21_i+1), k21_sumAllSum/(k21_i+1), k21_aveAllSum/(k21_i+1)); 
			}
		}
		System.out.printf("===============================<끝>===============================\n");
	}
}
