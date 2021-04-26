package sw_06;

public class Overload2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadEx2 ol = new OverloadEx2();
		String[] subjects = {"국어", "영어", "수학", "과학", "사회" };
		int[] scores = {100, 100, 100, 100, 100 };
		int scoreSum = 0;
		double scoreAve = 0;
		
		for (int i = 3; i < 6; i++) {
			System.out.printf("%d월 성적표\n", i);
			System.out.printf("================================================================\n이름\t");
			for (int j = 0; j < i; j++) {
				System.out.printf(subjects[j]+"\t");
			}
			System.out.printf("sum\tave\t\n"); 
			System.out.printf("================================================================\n폴리융\t");
			for (int j = 0; j < i; j++) {
				System.out.printf(scores[j]+"\t");
			}
			// 변수 파라미터 수 유동적으로 결정: arrayList 로 입력받는 매서드를 만들거나, 가변인자형 사용 가능
			switch (i) {
			case 3:
				scoreSum = ol.sum(scores[0], scores[1], scores[2]);
				scoreAve = ol.ave(scores[0], scores[1], scores[2]);
				break;
			case 4:
				scoreSum = ol.sum(scores[0], scores[1], scores[2], scores[3]);
				scoreAve = ol.ave(scores[0], scores[1], scores[2], scores[3]);
				break;
			case 5:
				scoreSum = ol.sum(scores[0], scores[1], scores[2], scores[3], scores[4]);
				scoreAve = ol.ave(scores[0], scores[1], scores[2], scores[3], scores[4]);
				break;
			default:
				break;
			}
			System.out.printf("%d\t%.1f", scoreSum, scoreAve);
			System.out.printf("\n");
			System.out.printf("\n");
		}
	}

}
