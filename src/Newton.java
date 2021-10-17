
public class Newton {
	
	public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double EPSILON = 1E-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON*t)
            t = (c/t + t) / 2.0;
        return t;
    }
	
	public static double sqrt(double c, double epsilon) {
        if (c < 0) return Double.NaN;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t)
            t = (c/t + t) / 2.0;
        return t;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] a = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Double.parseDouble(args[i]);
        }
        
        for (int i = 0; i < a.length; i++) {
            double x = sqrt(a[i]);
            System.out.println(x);
        }

	}

}
