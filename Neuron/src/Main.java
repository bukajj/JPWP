public class Main {

    public static void main(String[] args) {

        double[][] in = {{0,0,1},{0,1,1},{1,0,1},{1,1,1}};
        double[] outAND = {0,0,0,1};
        double[] outOR = {0,1,1,1};
        double[] outNAND = {1,1,1,0};
        double[] outNOR = {1,0,0,0};
        double[] outXOR = {0,1,1,0};

        Perceptron neuronAND=new Perceptron(in,outAND);
        Perceptron neuronOR=new Perceptron(in,outOR,5,0.000001);
        Perceptron neuronNAND=new Perceptron(in,outNAND,10,0.0001,10000);
        Perceptron neuronNOR=new Perceptron(in,outNOR,25);
        Perceptron neuronXOR=new Perceptron(in,outXOR,15,0.03,1000);

        //wywołanie metody uczenia neuronu
        neuronAND.uczenieNeuronu();
//wywołanie metody wyświetlającej wyniki uczenia
        neuronAND.printWynik();
//wywołanie metody wyświetlającej wagi neuronu
        neuronAND.printWagi();
//wywołanie metody wyświetlającej błąd uczenia
        neuronAND.printError();
//wywołanie metody wyświetlającej liczbę epok uczenia
        neuronAND.printEpochs();


        neuronOR.uczenieNeuronu();
        neuronOR.printWynik();
        neuronOR.printWagi();
        neuronOR.printError();
        neuronOR.printEpochs();

        neuronNAND.uczenieNeuronu();
        neuronNAND.printWynik();
        neuronNAND.printWagi();
        neuronNAND.printError();
        neuronNAND.printEpochs();

        neuronNOR.uczenieNeuronu();
        neuronNOR.printWynik();
        neuronNOR.printWagi();
        neuronNOR.printError();
        neuronNOR.printEpochs();

        neuronXOR.uczenieNeuronu();
        neuronXOR.printWynik();
        neuronXOR.printWagi();
        neuronXOR.printError();
        neuronXOR.printEpochs();
    }
}
