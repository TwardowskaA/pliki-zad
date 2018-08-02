import java.io.*;
import java.util.Scanner;

public class Projekt {

    public static void main(String[] args) throws IOException {
//            File file = new File("plik.txt");
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//            try (Scanner scan = new Scanner(file)) {
//                while (scan.hasNextLine()) {
//                    System.out.println(scan.nextLine());
//                }
//            }

        FileWriter fw = new FileWriter("abc.txt", true);
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write("Ala");
        bfw.newLine();
        bfw.write("ma");
        bfw.newLine();
        bfw.write("kota");
        bfw.close(); // bfw.flush
    }

}
