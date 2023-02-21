import java.util. *;
public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();  //nadmorska visina
		
		
		
    }
	public static int izracunaj(int v) {
		int C = 6.674 * Math.pow(10, -11); //gravitacijska konstanta
		int M = 5.972 * Math.pow(10, 24); // masa Zemlje
		int R = 6.371 * Math.pow(10, 6); //polmer Zemlje
	    	int a = (C * M) / Math.pow(R + v, 2);  //pospesek
		return a;
	}
}
