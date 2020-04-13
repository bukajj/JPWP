package AppOOP;

public abstract class Artysta {

    private String imie;
    private String nazwisko;
    private String dzielo;
    public Artysta(String imie, String nazwisko, String dzielo) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.dzielo=dzielo;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getDzielo() {
        return dzielo;
    }
    public void ImieNazwisko() {
        System.out.println("Nazywam się "+this.getImie()+" "+this.getNazwisko());
    }
    protected abstract void DziedzinaSztuki();
    protected abstract void WazneDzielo();

}
