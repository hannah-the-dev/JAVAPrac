package sw_06;

public class TvRemote {
	public static void main(String[] args) {
		TvControls k21_remote = new TvControls();	// 클래스를 받아 객체 생성
		
		for (int i = 0; i < 10; i++) {
			k21_remote.chUp();	
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help);
		}
		for (int i = 0; i < 10; i++) {
			k21_remote.chDown();	
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help);
		}
		for (int i = 0; i < 5; i++) {
			k21_remote.volUp();	
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help);
		}
		for (int i = 0; i < 16; i++) {
			k21_remote.volDown();	
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help);
		}
	}
}