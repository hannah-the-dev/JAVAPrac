package sw_06;

public class overLoadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overLoadEx1 ol = new overLoadEx1();
		
		System.out.printf("2개 덧셈이 호출됨[%d]\n", ol.sum(1, 2));
		System.out.printf("3개 덧셈이 호출됨[%d]\n", ol.sum(1, 2, 3));
		System.out.printf("4개 덧셈이 호출됨[%d]\n", ol.sum(1, 2, 3, 4));
		System.out.printf("더블형 덧셈이 호출됨[%f]\n", ol.sum(1.3, 2.4));
	}
}
