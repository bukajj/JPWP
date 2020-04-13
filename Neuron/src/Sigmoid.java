public class Sigmoid {

    public static double f(double x){

        return 1/(1+Math.pow(Math.E, (-1)*x));
    }

    public static double der(double x){

        return x*(1-x);
    }
}
