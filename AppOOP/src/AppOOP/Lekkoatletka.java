package AppOOP;

public class Lekkoatletka extends Sportowiec{


    public Lekkoatletka(String imie, String nazwisko, String sukces,String[] jezyki, int obserwujacy){
        super(imie, nazwisko, sukces, jezyki, obserwujacy);
    }

    public Lekkoatletka(String imie, String nazwisko, String sukces, int obserwujacy){
        super(imie, nazwisko, sukces, obserwujacy);
    }
    
        @Override
        public void LiczbaObserwujacych() {
            System.out.println("Liczba obserwujących na Instagramie to " + this.getObserwujacy());
        }

        @Override
        protected void Dyscyplina() {
            System.out.println("Moja dyscyplina sportu to lekkoatletyka");
        }

        @Override
        protected void WaznySukces() {
            System.out.println("Mój największy sukces to " + this.getSukces());
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
}
