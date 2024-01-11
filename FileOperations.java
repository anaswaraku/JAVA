import java.io.*;
import java.util.Scanner;

class FileOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        
        // creating file
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File Created Successfully ");
            } else {
                System.out.println("File already exists in this directory");
                System.exit(0);
            }
        } catch (IOException e) {
            System.out.println("Error create the file " + e.getMessage());
        }
        // Writing into a file

        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("\nEnter text to write into the file (press Enter to finish):");
            String input;
            while (!(input = sc.nextLine()).isEmpty()) {
                writer.write(input + "\n");
            }
            writer.close();
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error writing into file: " + e.getMessage());
        }

        // Reading from a file
        System.out.println("\nReading from file:");
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        // Rename file
        System.out.println("\nRename File");
        System.out.println("Enter new file name:");
        String newFileName = sc.nextLine();
        File oldFile = new File(fileName);
        File newFile = new File(newFileName);
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Error renaming file.");
        }

        // Delete file
        System.out.println("\nDo you want to delete the file? (y/n)");
        String deleteChoice = sc.nextLine();
        if (deleteChoice.equalsIgnoreCase("y")) {
            File fileToDelete = new File(newFileName);
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Error deleting file.");
            }
        }
        sc.close();
    }
}