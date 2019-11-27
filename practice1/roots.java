package practice1;

public class roots {
	public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        double r1 = 0;
        double r2 = 0;
        double n=Math.sqrt(b*b-4*a*c);
        r2=(int)(-b-n)/2*a;
        r1=(int)(-b+n)/2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "≤‚ ‘Õ®π˝" : "≤‚ ‘ ß∞‹");
    }
}
