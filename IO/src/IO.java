import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.regex.Pattern;

public class IO {

    public static void main(String[] args) {

        String input = "";

        try {
            input = Files.readString(Paths.get("data.txt"));
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

        Pattern NEWLINE = Pattern.compile("\\R");
        String lines[] = NEWLINE.split(input);

        double[] x = new double[lines.length];
        double[] y = new double[lines.length];

        for (int i=0; i<lines.length; i++){
            System.out.println(lines[i]);
            String[] tab = lines[i].split(",");
            x[i] = Double.parseDouble(tab[0]);
            y[i] = Double.parseDouble(tab[1]);
        }

        double xav = averageValue(x);
        double yav = averageValue(y);

        String output = "Liczba wierszy = " + lines.length + "\n";
        output += "Wartość średnia kolumny x = " + xav + "\n";
        output += "Wartość średnia kolumny y = " + yav + "\n";
        output += "x | y" + "\n";

        for(int i=0; i<lines.length; i++){
            output += lines[i] + "\n";
        }

        try {
            Files.writeString(Paths.get("newData.txt"),
                    output, StandardOpenOption.CREATE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static double averageValue(double[] tab){
        double sum = 0;

        for(int i=0; i<tab.length; i++){
            sum += tab[i];
        }

        return sum/tab.length;
    }
}
