package AppOOP;

public abstract class Sportowiec implements IPoliglota,IInstagramer{

    private String imie;
    private String nazwisko;
    private String sukces;
    private int obserwujacy;
    private String[] jezyki;

    public Sportowiec(String imie, String nazwisko, String sukces, String[] jezyki, int obserwujacy) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.sukces=sukces;
        this.obserwujacy = obserwujacy;
        this.jezyki = jezyki;
    }

    public Sportowiec(String imie, String nazwisko, String sukces){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.sukces=sukces;
    }

    public Sportowiec(String imie, String nazwisko, String sukces, int obserwujacy){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.sukces=sukces;
        this.obserwujacy = obserwujacy;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getSukces() {
        return sukces;
    }
    public String[] getJezyki() {return jezyki;}
    public int getObserwujacy() {return obserwujacy;}
    public void ImieNazwisko() {
        System.out.println("Nazywam się "+this.getImie()+" "+this.getNazwisko());
    }
    protected abstract void Dyscyplina();
    protected abstract void WaznySukces();
}
