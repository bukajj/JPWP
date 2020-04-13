package AppOOP;

public class Pisarka extends Artysta{

    public Pisarka(String imie, String nazwisko, String dzielo) {
        super(imie, nazwisko, dzielo);
    }

    @Override
    protected void DziedzinaSztuki() {
        System.out.println("Moja dziedzina sztuki to literatura");
    }

    @Override
    protected void WazneDzielo() {
        System.out.println("Moje ważne dzieło to "+this.getDzielo());
    }
}
