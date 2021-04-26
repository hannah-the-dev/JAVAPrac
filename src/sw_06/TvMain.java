package sw_06;

public class TvMain {
	public static void main(String[] args) {
		TvControls k21_remote = new TvControls();	// 클래스를 받아 객체 생성 및 연결
		
		for (int i = 0; i < 10; i++) {	// 10번 반복
			k21_remote.chUp();	// chUp 매서드 호출
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help); // 문구 출력
		}
		for (int i = 0; i < 10; i++) {	// 10번 반복
			k21_remote.chDown();	// chDown 매서드 호출
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help); // 문구 출력
		}
		for (int i = 0; i < 5; i++) {	// 5번 반복
			k21_remote.volUp();		// volUP 매서드호출
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help); // 문구 출력
		}
		for (int i = 0; i < 16; i++) {	// 16번 반복
			k21_remote.volDown();	// volDown 매서드 호출
			System.out.printf("[SYSTEM] %S\n", k21_remote.k21_help); // 문구 출력
		}
	}
}