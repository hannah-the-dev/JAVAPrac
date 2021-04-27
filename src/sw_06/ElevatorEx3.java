package sw_06;

public class ElevatorEx3 extends ElevatorEx2 {
	void Repair() {
		setK21_help("수리중입니다.");
	}
	
	void up() {
		if (getK21_floor() >= getK21_limit_up_floor()) {
			setK21_help("최고층입니다."); 
		} else {
			setK21_floor(getK21_floor() + 2);
			setK21_help(String.format("%02d 층입니다.", getK21_floor()));
		}
		this.down();
	}
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍는 msg [%s]\n", this.getK21_help());
	}
}
