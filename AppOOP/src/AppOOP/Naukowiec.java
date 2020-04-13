package AppOOP;

public abstract class Naukowiec implements IPoliglota {
    private String imie;
    private String nazwisko;
    private String osiagniecie;
    private String[] jezyki;
    public Naukowiec(String imie, String nazwisko, String osiagniecie, String[] jezyki) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.osiagniecie=osiagniecie;
        this.jezyki = jezyki;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getOsiagniecie() {
        return osiagniecie;
    }
    public String[] getJezyki() {return jezyki;}
    public void ImieNazwisko() {
        System.out.println("Nazywam się "+this.getImie()+" "+this.getNazwisko());
    }
    protected abstract void Dyscyplina();
    protected abstract void WaznySukces();
}
