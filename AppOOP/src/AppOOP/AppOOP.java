package AppOOP;

import java.util.ArrayList;
import java.util.List;

public class AppOOP {

    public static void main(String[] args) {

        List<Artysta> artysci=new ArrayList<Artysta>();
        artysci.add(new Piosenkarz("Phil","Collins","In the air tonight", 398000));
        artysci.add(new Aktor("Al","Pacino","Ojciec chrzestny"));
        artysci.add(new Piosenkarz("Freddy","Mercury","The Show Must Go On"));
        artysci.add(new Pisarka("J.K.","Rowling","Harry Potter"));

        for (Artysta element : artysci) {
            printInformacjeArtysta(element);
        }

        List<Sportowiec> sportowcy = new ArrayList<Sportowiec>();
        sportowcy.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec", new String[]{"polski", "niemiecki"}, 16800000));
        sportowcy.add(new Skoczek("Kamil", "Stoch", "Mistrzostwo Olimpijskie", 320000));
        sportowcy.add(new Lekkoatletka("Anita", "Włodarczyk", "Mistrzostwo Olimpijskie", 30100));

        for(Sportowiec element : sportowcy)
            printInformacjeSportowiec(element);

        List<Naukowiec> naukowcy = new ArrayList<Naukowiec>();
        naukowcy.add(new Matematyk("Stanisław", "Ulam", "Metody numeryczne", new String[] {"polski","angielski","niemiecki"}));
        naukowcy.add(new Elektrotechnik("Nikola", "Tesla", "Silnik indukcyjny", new String[]{"serbski","chorwacki","niemiecki","angielski"}));

        for(Naukowiec element : naukowcy)
            printInformacjeNaukowiec(element);


        List<IInstagramer> instagramerzy = new ArrayList<IInstagramer>();
        instagramerzy.add((IInstagramer) artysci.get(0));
        instagramerzy.add(sportowcy.get(0));
        instagramerzy.add(sportowcy.get(1));
        instagramerzy.add(sportowcy.get(2));

        for(IInstagramer element : instagramerzy)
            printInformacjeInstagramer(element);

        List<IPoliglota> poligloci = new ArrayList<IPoliglota>();
        poligloci.add(sportowcy.get(0));
        poligloci.add(naukowcy.get(0));
        poligloci.add(naukowcy.get(1));

        for(IPoliglota element : poligloci)
            printInformacjePoliglota(element);


    }

    static void printInformacjeArtysta(Artysta element) {
        element.ImieNazwisko();
        element.DziedzinaSztuki();
        element.WazneDzielo();
    }

    static void printInformacjeNaukowiec(Naukowiec element) {
        element.ImieNazwisko();
        element.Dyscyplina();
        element.WaznySukces();
    }

    static void printInformacjeSportowiec(Sportowiec element){
        element.ImieNazwisko();
        element.Dyscyplina();
        element.WaznySukces();
    }

    static void printInformacjeInstagramer(IInstagramer element){
        element.LiczbaObserwujacych();
    }

    static void printInformacjePoliglota(IPoliglota element){
        element.znaneJezyki();
    }
}
