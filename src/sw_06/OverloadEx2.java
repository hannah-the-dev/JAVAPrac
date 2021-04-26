package sw_06;

public class OverloadEx2 {
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public int sum(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	public double ave(int a, int b, int c) {
		return (sum(a,b,c))/3;
	}
	public double ave(int a, int b, int c, int d) {
		return (sum(a,b,c,d))/4;
	}
	public double ave(int a, int b, int c, int d, int e) {
		return (sum(a,b,c,d,e))/5;
	}
}