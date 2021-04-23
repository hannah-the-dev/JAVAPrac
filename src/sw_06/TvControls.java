package sw_06;

public class TvControls {

	int k21_limit_ch_up = 10;	// max 채널
	int k21_limit_ch_down = 0;	// min 채널
	int k21_limit_vol_up = 15;	// max 볼륨
	int k21_limit_vol_down = 0;	// min 볼륨
	int k21_curCh = 5;			// 현재 채널
	int	k21_curVol = 12;			// 현재 볼륨
	String k21_help;				
	
	void chUp() {
		if (k21_curCh == k21_limit_ch_up) {		// 마지막 채널일 경우
			k21_curCh = k21_limit_ch_down;		// 첫 채널로 이동
		} else {
			k21_curCh++;						// 아닐 경우 채널 1 up
		}
		k21_help = String.format("채널: %d", k21_curCh);
	}
	
	void chDown() {
		if (k21_curCh == k21_limit_ch_down) {		// 첫 채널일 경우
			k21_curCh = k21_limit_ch_up;			// 마지막 채널로 이동
		} else {
			k21_curCh--;							// 아닐 경우 채널 1 down
		}
		k21_help = String.format("채널: %d", k21_curCh);
	}
	
	void volUp() {
		if (k21_curVol == k21_limit_vol_up) {		// max 볼륨일경우
			k21_help = String.format("최대 볼륨(%d)", k21_limit_vol_up);	// 현재 볼륨 출력
		} else {
			k21_curVol++;						// 아닐 경우 볼륨 1 up
			k21_help = String.format("볼륨: %d", k21_curVol);
		}
	}
	
	void volDown() {
		if (k21_curVol == k21_limit_vol_down) {		// min 볼륨일 경우
			k21_help = String.format("최저 볼륨(%d)", k21_limit_vol_down);	// 현재 볼륨 출력
		} else {
			k21_curVol--;							// 아닐 경우 볼륨 1 down
			k21_help = String.format("볼륨: %d", k21_curVol);
		}
	}
}
