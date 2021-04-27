package sw_06;

public class TvControls2 {
	private int k21_limit_ch_up;	// max 채널
	private int k21_limit_ch_down;	// min 채널
	private int k21_limit_vol_up;	// max 볼륨
	private int k21_limit_vol_down;	// min 볼륨
	private int k21_curCh;			// 현재 채널
	private int	k21_curVol;			// 현재 볼륨
	private String k21_help;		// 문구 저장
	
	TvControls2() {			// 기본 모델 생성자 선언, 입력받은 파라미터 없을 경우
		this.setK21_limit_ch_up(10);	// max 채널 10
		this.setK21_limit_ch_down(0);	// min 채널 0
		this.setK21_limit_vol_up(15);	// max 볼륨 15
		this.setK21_limit_vol_down(0);// min 볼륨 0
		this.setK21_curCh(5);			// 현재 채널(5에서 시작)
		this.setK21_curVol(12);		// 현재 볼륨(12에서 시작)
		setK21_help("기본 모델 설정 완료");			// 문구 저장
		System.out.println(getK21_help());	// 호출시 저장된 문구 출력
	}
	
	TvControls2(int k21_limit_ch_up, int k21_limit_ch_down, 
			int k21_limit_vol_up, int k21_limit_vol_down, 
			int k21_curCh, int k21_curVol) {		// 세부 설정 모델 생성자 선언
		this.setK21_limit_ch_up(k21_limit_ch_up);		// max 채널 설정
		this.setK21_limit_ch_down(k21_limit_ch_down);	// min 채널 설정
		this.setK21_limit_vol_up(k21_limit_vol_up);	// max 볼륨 설정
		this.setK21_limit_vol_down(k21_limit_vol_down);	// min 볼륨 설정
		this.setK21_curCh(k21_curCh);				// 현재 채널 설정
		this.setK21_curVol(k21_curVol);			// 현재 볼륨 설정
		setK21_help("세부 세팅 완료");			// 문구 저장
		System.out.println(getK21_help());		// 호출시 저장된 문구 출력
	}
	
	void chUp() {			// 생성자 없는 매서드 (1번 호출될때 1번 동작)
		if (getK21_curCh() == getK21_limit_ch_up()) {		// 마지막 채널일 경우
			setK21_curCh(getK21_limit_ch_down());		// 첫 채널로 이동
		} else {
			setK21_curCh(getK21_curCh() + 1);						// 아닐 경우 채널 1 up
		}
		setK21_help(String.format("채널: %d", getK21_curCh())); // up된 채널 저장
		msg();  // 메시지 출력 
	}
	
	void chUp(int u) {		// 생성자 있는 매서드 
		for(int i = 0; i < u; i++) this.chUp(); // 입력된 int 값 만큼 반복 chUp 호출 
	}
	
	void chDown() {			// 생성자 없는 매서드
		if (getK21_curCh() == getK21_limit_ch_down()) {		// 첫 채널일 경우
			setK21_curCh(getK21_limit_ch_up());			// 마지막 채널로 이동
		} else {
			setK21_curCh(getK21_curCh() - 1);							// 아닐 경우 채널 1 down
		}
		setK21_help(String.format("채널: %d", getK21_curCh())); // down된 채널 저장
		msg();  // 메시지 출력
	}
	
	void chDown(int d) {		// 생성자 있는 매서드
		for (int i = 0; i < d; i++) this.chDown(); // 입력된 int 값 만큼 반복 chDown 호출
	}
	
	void volUp() {				// 생성자 없는 매서드
		if (getK21_curVol() == getK21_limit_vol_up()) {		// max 볼륨일경우
			setK21_help(String.format("최대 볼륨(%d)", getK21_limit_vol_up()));	// 현재 볼륨 저장
		} else {
			setK21_curVol(getK21_curVol() + 1);						// 아닐 경우 볼륨 1 up
			setK21_help(String.format("볼륨: %d", getK21_curVol())); // up된 볼륨 저장
		}
		msg();  // 메시지 출력
	}
	
	void volUp(int u) {			// 생성자 있는 매서드
		for(int i = 0; i < u; i++) this.volUp(); // 입력된 int 값 만큼 반복 volUp 호출
	}
	
	void volDown() {			// 생성자 없는 매서드
		if (getK21_curVol() == getK21_limit_vol_down()) {		// min 볼륨일 경우
			setK21_help(String.format("최저 볼륨(%d)", getK21_limit_vol_down()));	// 현재 볼륨 저장
		} else {
			setK21_curVol(getK21_curVol() - 1);							// 아닐 경우 볼륨 1 down
			setK21_help(String.format("볼륨: %d", getK21_curVol())); // down된 볼륨 저장
		}
		msg();  // 메시지 출력
	}
	void volDown(int d) {		// 생성자 있는 매서드
		for (int i = 0; i < d; i++) this.volDown(); // 입력된 int 값 만큼 반복 volDown 호출
	}

	void msg() {			// 저장된 메시지 출력 매서드
		System.out.printf("[systmem] %s\n", getK21_help()); 
	}
	
	public String getK21_help() {
		return k21_help;
	}

	public void setK21_help(String k21_help) {
		this.k21_help = k21_help;
	}

	public int getK21_curCh() {
		return k21_curCh;
	}

	public void setK21_curCh(int k21_curCh) {
		this.k21_curCh = k21_curCh;
	}

	public int getK21_limit_ch_up() {
		return k21_limit_ch_up;
	}

	public void setK21_limit_ch_up(int k21_limit_ch_up) {
		this.k21_limit_ch_up = k21_limit_ch_up;
	}

	public int getK21_limit_ch_down() {
		return k21_limit_ch_down;
	}

	public void setK21_limit_ch_down(int k21_limit_ch_down) {
		this.k21_limit_ch_down = k21_limit_ch_down;
	}

	public int getK21_curVol() {
		return k21_curVol;
	}

	public void setK21_curVol(int k21_curVol) {
		this.k21_curVol = k21_curVol;
	}

	public int getK21_limit_vol_up() {
		return k21_limit_vol_up;
	}

	public void setK21_limit_vol_up(int k21_limit_vol_up) {
		this.k21_limit_vol_up = k21_limit_vol_up;
	}

	public int getK21_limit_vol_down() {
		return k21_limit_vol_down;
	}

	public void setK21_limit_vol_down(int k21_limit_vol_down) {
		this.k21_limit_vol_down = k21_limit_vol_down;
	}
}
