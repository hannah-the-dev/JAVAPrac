package sw_06;

public class ElevatorEx1 {
	int k21_limit_up_floor = 10;	//최상위 층
	int k21_limit_down_floor = 0;	//최하위 층
	int k21_floor = 1;				//현재 층
	String k21_help;				
	
	void up() {
		if (k21_floor == k21_limit_up_floor) {
			k21_help = "최고층입니다.";
		} else {
			k21_floor++;
			k21_help = String.format("%d 층입니다.", k21_floor);
		}
	}
	void down() {
		if (k21_floor == k21_limit_down_floor) {
			k21_help = "최저층입니다.";
		} else {
			k21_floor--;
			k21_help = String.format("%d 층입니다.", k21_floor);
		}
	}
}
