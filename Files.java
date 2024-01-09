import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String args[]) {
        try {
            // Creating a file and writing content
            File file = new File("Sample.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World");
            writer.close();

            // Reading and printing content from the file
            FileReader fr = new FileReader(file);
            int i;
            System.out.println("Content from the file:");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();

            // Renaming the file
            String newFileName = "Example.txt";
            File renamedFile = new File(newFileName);
            if (file.renameTo(renamedFile)) {
                System.out.println("\nFile renamed to: " + newFileName);
            } else {
                System.out.println("\nError renaming the file.");
            }

        } catch (IOException e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}
