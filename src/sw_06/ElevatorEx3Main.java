package sw_06;

public class ElevatorEx3Main {
	static ElevatorEx3 k21_elev;
	
	public static void main(String[] args) {
		
	k21_elev = new ElevatorEx3();
	System.out.println(k21_elev.getK21_help());
	for (int i = 0; i < 10; i++) {
		k21_elev.up();
		System.out.printf("MSG elev3[%s]\n", k21_elev.getK21_help());
	}
	for (int i = 0; i < 10; i++) {
		k21_elev.down();
		System.out.printf("MSG elev3[%s]\n", k21_elev.getK21_help());
	}
	k21_elev.Repair();
	System.out.printf("MSG elev3[%s]\n", k21_elev.getK21_help());
	}
}