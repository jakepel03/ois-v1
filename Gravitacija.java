import java.util. *;
import java.lang.Math;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();  //nadmorska visina
        izpisi(v);
        
        System.out.println("OIS je zakon!");
    }
    public static void izpisi(int v) {
        System.out.println(izracunaj(v));
    }
	public static double izracunaj(int v) {
		double C = 6.674 * Math.pow(10, -11); //gravitacijska konstanta
		double M = 5.972 * Math.pow(10, 24); // masa Zemlje
		double R = 6.371 * Math.pow(10, 6); //polmer Zemlje
	    double a = (C * M) / Math.pow(R + v, 2);  //pospesek
		return a;
	}
}
