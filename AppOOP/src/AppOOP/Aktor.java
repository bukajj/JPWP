package AppOOP;

public class Aktor extends Artysta {

    public Aktor(String imie, String nazwisko, String dzielo) {
        super(imie, nazwisko, dzielo);
    }
    @Override
    protected void DziedzinaSztuki() {
        System.out.println("Moja dziedzina sztuki to film");
    }
    @Override
    protected void WazneDzielo() {
        System.out.println("Moje ważne dzieło to "+this.getDzielo());
    }

}
