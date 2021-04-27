package sw_06;

public class TvControlsX extends TvControls2 {
	int k21_battery = 25;
	
	TvControlsX() {			// 기본 모델 생성자 상속(생성자 있는 형태로도 사용하려면 둘다 선언 필요)
	}

	TvControlsX(int k21_limit_ch_up, int k21_limit_ch_down, 
			int k21_limit_vol_up, int k21_limit_vol_down, 
			int k21_curCh, int k21_curVol) {		// 세부 설정 모델 생성자 선언(할당은 오버라이드)
	}
	
	void batteryChecks() {	// 배터리 잔량 체크 매서드 
		setK21_help(String.format("배터리 잔량: %d%%", k21_battery));	// 배터리 잔량 메시지 저장
		if(k21_battery == 0) {									// 배터리가 없을 경우 
			setK21_help(getK21_help() + "\n~ 배터리 잔량이 없어 동작하지 않습니다. "	// 메시지 추가
					+ "배터리를 교체해주세요.");
		} else if(k21_battery <= 15) {							// 배터리가 15% 이하일 경우
			setK21_help(getK21_help() + "\n~ 배터리 잔량이 15% 이하입니다. "	// 메시지 추가
					+ "배터리를 교체해주세요.");
		}
		msg(); // 메시지 출력
	}

	@Override
	void chUp() {			// 생성자 없는 매서드 (1번 호출될때 1번 동작)
		if (k21_battery > 0) {	// 배터리 조건 추가
//			if (super.getK21_curCh() == getK21_limit_ch_up()) {		// 마지막 채널일 경우
//				setK21_curCh(getK21_limit_ch_down());		// 첫 채널로 이동
//			} else {
//				setK21_curCh(getK21_curCh() + 1);						// 아닐 경우 채널 1 up
//			}
//			setK21_help(String.format("채널: %d", getK21_curCh())); // up된 채널 저장
//			msg();  // 메시지 출력 
			super.chUp(); 		// 패런트 클래스 매서드 사용
			k21_battery --;			// 1회 실행시 배터리 -1% 
		} else batteryChecks();	// 배터리가 없을 경우 배터리 검사 매서드 실행
	}
	
	@Override
	void chDown() {			// 생성자 없는 매서드
		if (k21_battery > 0) {	// 배터리 조건 추가
			super.chDown();	// 패런트 클래스 매서드 사용
			k21_battery --;			// 1회 실행시 배터리 -1%   
		} else batteryChecks();	// 배터리가 없을 경우 배터리 검사 매서드 실행
	}
	
	@Override
	void volUp() {				// 생성자 없는 매서드
		if (k21_battery > 0) {	// 배터리 조건 추가
			super.volUp();	// 패런트 클래스 매서드 사용
			k21_battery --;			// 1회 실행시 배터리 -1% 
		} else batteryChecks();	// 배터리가 없을 경우 배터리 검사 매서드 실행
	}
	
	@Override
	void volDown() {			// 생성자 없는 매서드
		if (k21_battery > 0) {	// 배터리 조건 추가
			super.volDown();	// 패런트 클래스 매서드 사용
			k21_battery --;			// 1회 실행시 배터리 -1% 
		} else batteryChecks();	// 배터리가 없을 경우 배터리 검사 매서드 실행
	}
}