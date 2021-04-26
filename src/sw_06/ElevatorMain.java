package sw_06;

public class ElevatorMain {
	private static int k21_inVal;		// 카운터 변수 선언
	public static void up() {			// 메인 클래스 내 up 함수
		k21_inVal++;					// 카운터 변수 +1
		System.out.printf("그냥 매서드[%d]\n", k21_inVal); //그냥 매서드[카운터]
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k21_inVal = 0;	// 내부 클래스 변수 사용
		ElevatorEx1 k21_elev;	// 클래스를 받아 객체 생성
		
		k21_elev = new ElevatorEx1();		// 인스턴스 생성해서 객체에 연결
		
		up();		// 그냥 매서드(메인)
		for (int i = 0; i < 10; i++) {
			k21_elev.up();	//ElevatorEx1 클래스 내 매서드
			
			System.out.printf("MSG[%s]\n", k21_elev.k21_help);
		}
		for (int i = 0; i < 10; i++) {
			k21_elev.down();	//ElevatorEx1 클래스 내 매서드
			
			System.out.printf("MSG[%s]\n", k21_elev.k21_help);
		}
	}
}
