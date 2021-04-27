package sw_06;

public class ElevatorEx2Main {
	static ElevatorEx2 k21_elev1; 
	static ElevatorEx2 k21_elev2; 
	static ElevatorEx2 k21_elev3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k21_elev1 = new ElevatorEx2();
		k21_elev2 = new ElevatorEx2(20, 1, 8);
		k21_elev3 = new ElevatorEx2(50, -3, 5);
		
		for (int k21_i = 0; k21_i < 20; k21_i++) {
			k21_elev1.up(); k21_elev1.msg("1번 엘리베이터 1층 오르기");
//			k21_elev2.up(); k21_elev2.msg("2번 엘리베이터 1층 오르기");
//			k21_elev3.up(); k21_elev3.msg("3번 엘리베이터 1층 오르기");
		}
		System.out.println("----------------------------------------------------------------------------------");
		k21_elev1.setK21_floor(1);	// 이미 최상위층: 2층씩 오르기 결과 보려고 set
		k21_elev2.setK21_floor(1);	// 이미 최상위층: 2층씩 오르기 결과 보려고 set
		k21_elev3.setK21_floor(1);	// 이미 최상위층: 2층씩 오르기 결과 보려고 set
		for (int k21_i = 0; k21_i < 20; k21_i++) {
			k21_elev1.up(2); k21_elev1.msg("1번 엘리베이터 2층씩 오르기");
//			k21_elev2.up(2); k21_elev2.msg("2번 엘리베이터 2층씩 오르기");
//			k21_elev3.up(2); k21_elev3.msg("3번 엘리베이터 2층씩 오르기");
		}
		System.out.println("----------------------------------------------------------------------------------");
		for (int k21_i = 0; k21_i < 20; k21_i++) {
			k21_elev1.down(3); k21_elev1.msg("1번 엘리베이터 3층씩 내리기");
//			k21_elev2.down(3); k21_elev2.msg("2번 엘리베이터 3층씩 내리기");
//			k21_elev3.down(3); k21_elev3.msg("3번 엘리베이터 3층씩 내리기");
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}