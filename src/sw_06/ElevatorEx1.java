package sw_06;

public class ElevatorEx1 {
	int k21_limit_up_floor = 10;	// 최상위 층
	int k21_limit_down_floor = 0;	// 최하위 층
	int k21_floor = 1;				// 현재 층
	String k21_help;				// 출력 문구 저장용 변수
	
	void up() {
		if (k21_floor == k21_limit_up_floor) {	// 이미 최고층일 때
			k21_help = "최고층입니다.";			// 문구=최고층입니다.
		} else {								// 최고층이 아닐 때
			k21_floor++;						// 층수+1
			k21_help = String.format("%d 층입니다.", k21_floor); // n층입니다.
		}
	}
	void down() {
		if (k21_floor == k21_limit_down_floor) {	// 이미 최저층일때
			k21_help = "최저층입니다.";			// 문구=최저층입니다.
		} else {							// 최저층이 아닐 때
			k21_floor--;					// 층수 -1
			k21_help = String.format("%d 층입니다.", k21_floor); // n층입니다.
		}
	}
}
