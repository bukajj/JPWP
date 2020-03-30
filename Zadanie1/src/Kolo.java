import java.util.Random;

public class Kolo {

    private int r,p;

    public Kolo(int radius, int p){
        this.r = radius;
        this.p = p;
    }

    public void setP(int p){
        this.p = p;
    }

    public double pole(){
        return Math.PI * r * r;
    }

    public double poleNumerycznie(){
        int k = 0;
        Random generator = new Random();

        for (int i=0; i<p; i++){
            double x = generator.nextDouble()*2*r-r;
            double y = generator.nextDouble()*2*r-r;
            if(x*x +y*y <= r*r) {
                k++;
            }
        }

        return 4*r*r*k/p;
    }
}
