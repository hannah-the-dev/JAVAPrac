package sw_06;

public class MethodEx02 {
	static int k21_iStatic;
	
	public static void add(int k21_i) {
		k21_iStatic ++;
		k21_i++;
		System.out.printf("add 메서드에서 -> k21_iStatic = [%d]\n", k21_iStatic);
		System.out.printf("add 메서드에서 -> i = [%d]\n", k21_i);
	}
	
	public static int add2(int k21_i) {
		k21_iStatic ++;
		k21_i++;
		System.out.printf("add 메서드에서 -> k21_iStatic = [%d]\n", k21_iStatic);
		System.out.printf("add 메서드에서 -> i = [%d]\n", k21_i);
		return k21_i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k21_iMain;
		
		k21_iMain = 1;
		k21_iStatic = 1;
		
		System.out.printf("*********************************************\n");
		System.out.printf("메서드 호출 전 메인에서 -> iStaitc = [%d]\n", k21_iStatic);
		System.out.printf("메서드 호출 전 메인에서 -> iMain = [%d]\n", k21_iMain);
		System.out.printf("*********************************************\n");
		
		add(k21_iMain);
		
		System.out.printf("*********************************************\n");
		System.out.printf("메서드 호출 후 메인에서 -> iStaitc = [%d]\n", k21_iStatic);
		System.out.printf("메서드 호출 후 메인에서 -> iMain = [%d]\n", k21_iMain);
		System.out.printf("*********************************************\n");
	
		k21_iMain = add2(k21_iMain);
		
		System.out.printf("*********************************************\n");
		System.out.printf("메서드 add2 호출 후 메인에서 -> iStaitc = [%d]\n", k21_iStatic);
		System.out.printf("메서드 add2 호출 후 메인에서 -> iMain = [%d]\n", k21_iMain);
		System.out.printf("*********************************************\n");
	}
}
