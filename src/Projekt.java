import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Projekt {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
    }
}
