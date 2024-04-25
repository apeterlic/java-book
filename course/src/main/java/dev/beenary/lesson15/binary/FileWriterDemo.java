package dev.beenary.lesson15.binary;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

/**
 * @author Ana Peterlić
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String filePath = "java-core/files/dat/item.dat";
        Item item = new Item("123456", "Apple", BigDecimal.valueOf(15.8));
        writeToFile(item, filePath);
    }

    public static void writeToFile(Item item, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(item);
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }
}
