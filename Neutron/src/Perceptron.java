public class Perceptron {

    private double[][] in; //wzorcowa tablica wejsciowa
    private double[] out; //wzorcowa tablica wyjsciowa
    private double lr = 10; //predkosc uczenia perceptronu
    private double maxError = 0.001;; //maksymalny bład
    private int maxEpochs = 10000; //maksymalna liczba epok
    private double[] wagi; //tablica z wagami
    private double error; //błąd uczenia
    private int epochs; //liczba epok

    public Perceptron(double[][] in, double[] out) {
        this.in=in;
        this.out=out;
    }

    public Perceptron(double[][] in, double[] out, double lr) {
        this.in=in;
        this.out=out;
        this.lr=lr;
    }

    public Perceptron(double[][] in, double[] out, double lr, double maxError) {
        this.in=in;
        this.out=out;
        this.lr=lr;
        this.maxError=maxError;
    }
    public Perceptron(double[][] in, double[] out, double lr, double maxError, int
            maxEpochs) {
        this.in=in;
        this.out=out;
        this.lr=lr;
        this.maxError=maxError;
        this.maxEpochs=maxEpochs;
    }


}
