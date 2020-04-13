package AppOOP;

public class Elektrotechnik extends Naukowiec{

    public Elektrotechnik(String imie, String nazwisko, String osiagniecie, String[] jezyki){
        super(imie, nazwisko, osiagniecie, jezyki);
    }

    @Override
    public void znaneJezyki() {
        int i=0;
        System.out.print("Znam takie języki jak: ");
        while (i<this.getJezyki().length){
            System.out.print(this.getJezyki()[i]);
            i++;
            String next = i<this.getJezyki().length ? "," : "\n";
            System.out.print(next);
        }
    }

    @Override
    protected void Dyscyplina() {
        System.out.println("Moja dyscyplina naukowa to elektrotechnika");
    }

    @Override
    protected void WaznySukces() {
        System.out.println("Moje największe osiągnięcie to: " + this.getOsiagniecie());
    }
}
