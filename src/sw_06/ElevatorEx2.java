package sw_06;

public class ElevatorEx2 {
	private int k21_limit_up_floor;	// 최상위 층 변수 선언
	private int k21_limit_down_floor;	// 최하위 층 변수 선언
	private int k21_floor;				// 현재 층 변수 선언
	private String k21_help;				// 출력 문구 저장용 변수 선언
	
	ElevatorEx2() {			// 생성자선언
		setK21_limit_up_floor(10);	// 기본 모델 최상위 층 초기화
		k21_limit_down_floor = 0;	// 기본 모델 최하위 층 초기화
		setK21_floor(1);				// 기본 모델 현재 층 초기화
		setK21_help("엘리베이터 기본 준공 완료");				// 출력 문구 저장용 변수
	}
	
	ElevatorEx2(int k21_up_floor, int k21_down_floor, int k21_in_floor) {
		setK21_limit_up_floor(k21_up_floor);	// 최상위 층
		k21_limit_down_floor = k21_down_floor;	// 최하위 층
		setK21_floor(k21_in_floor);				// 현재 층
		setK21_help("엘리베이터 맞춤 준공 완료");				// 출력 문구 저장용 변수
	}
	
	void up() { // 오버로딩 up
		if (getK21_floor() == getK21_limit_up_floor()) {	// 이미 최고층일 때
			setK21_help("최고층입니다.");			// 문구=최고층입니다.
		} else {								// 최고층이 아닐 때
			setK21_floor(getK21_floor() + 1);						// 층수+1
			setK21_help(String.format("%02d 층입니다.", getK21_floor())); // n층입니다.
		}
	}
	void down() {
		if (getK21_floor() == k21_limit_down_floor) {	// 이미 최저층일때
			setK21_help("최저층입니다.");			// 문구=최저층입니다.
		} else {							// 최저층이 아닐 때
			setK21_floor(getK21_floor() - 1);					// 층수 -1
			setK21_help(String.format("%02d 층입니다.", getK21_floor())); // n층입니다.
		}
	}
	void up(int k21_u) {
		for (int k21_i = 0; k21_i < k21_u; k21_i++) this.up();	// 더 명시적인 방법(클래스 내 up 호출)
	}
	void down(int k21_d) {
		// 동일하게 동작하지만 덜 명시적인 방법(클래스 내 down 호출)
		for (int k21_i = 0; k21_i < k21_d; k21_i++) down();  
	}
	void msg(String k21_id) {
		System.out.printf("%s=> [%s]	최대층 [%02d] 최소층[%02d] 현재층[%02d]\n",
				k21_id, getK21_help(), getK21_limit_up_floor(), k21_limit_down_floor, getK21_floor());
	}

	public void setK21_floor(int k21_floor) {
		this.k21_floor = k21_floor;
	}

	public String getK21_help() {
		return k21_help;
	}

	public void setK21_help(String k21_help) {
		this.k21_help = k21_help;
	}

	public int getK21_floor() {
		return k21_floor;
	}

	public int getK21_limit_up_floor() {
		return k21_limit_up_floor;
	}

	public void setK21_limit_up_floor(int k21_limit_up_floor) {
		this.k21_limit_up_floor = k21_limit_up_floor;
	}
}
