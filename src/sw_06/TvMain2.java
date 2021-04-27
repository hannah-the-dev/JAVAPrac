package sw_06;

public class TvMain2 {
	public static void main(String[] args) {
		// 기본 모드 선언
		TvControls2 k21_remoteG = new TvControls2();
		System.out.println("일반모드 시작");
		k21_remoteG.chUp();		// 채널 1번 올리기
		k21_remoteG.chDown();	// 채널 1번 내리기
		k21_remoteG.volUp();	// 음량 1번 올리기
		k21_remoteG.volDown();	// 음량 1번 내리기
		
		// 기본 세팅 모드 선언 (채널 1~10, 음량 20~0, 현재 채널 10, 음량 16
		TvControls2 k21_remote = new TvControls2(15, 1, 20, 0, 10, 16);	
		System.out.println("오버라이딩모드 시작");
		k21_remote.chUp(10);	// 채널 10번 올리기
		k21_remote.chDown(10);	// 채널 10번 내리기
		k21_remote.volUp(5);	// 음량 5번 올리기
		k21_remote.volDown(5);	// 음량 5번 내리기
	}
}