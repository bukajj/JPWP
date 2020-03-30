public class Main {

    public static void main(String[] args) {
        Kolo kolo = new Kolo(5,5);

        for(int i = 1; i<10; i++){
            kolo.setP((int)Math.pow(5, i));
            System.out.println(kolo.pole());
            System.out.println(kolo.poleNumerycznie() + "\n");
        }
    }
}
