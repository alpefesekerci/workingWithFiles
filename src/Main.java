import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\ASUS\\OneDrive\\Masaüstü\\files\\test.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created successfully");
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\ASUS\\OneDrive\\Masaüstü\\files\\test.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length());
            System.out.println("File last modified: " + file.lastModified());
            System.out.println("File is directory: " + file.isDirectory());
            System.out.println("File is hidden: " + file.isHidden());
            System.out.println("File can read: " + file.canRead());
            System.out.println("File can write: " + file.canWrite());
            System.out.println("File can execute: " + file.canExecute());
            System.out.println("File is absolute: " + file.isAbsolute());

        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\ASUS\\OneDrive\\Masaüstü\\files\\test.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\OneDrive\\Masaüstü\\files\\test.txt", true));
            writer.newLine();
            writer.write("Dünya");
            System.out.println("Write successful");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
