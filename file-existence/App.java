import java.io.File;

/**
 * Tests whether just instantiating a File class is enough for the file to be
 * generated in memory.
 */
public class App {
    public static void main(String[] args) {

        File arquivo = new File("file.txt");

        if (arquivo.exists()) {
            System.out.println("It does exists.");
        } else {
            System.out.println("It doesn't exists.");
        }
    }
}