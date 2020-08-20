/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * Assignment: Ch11 FileArray
 * CISS 111-360
 * This is a Demo class to check if DD_FileArray.java works
 *
 */
import java.io.IOException;
import java.util.Scanner;

public class DD_FileArrayDemo {


    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String filename;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}; //These will be the data entered to the file
        Scanner scanner = new Scanner(System.in);
        DD_FileArray dd_fileArray = new DD_FileArray();

        System.out.println("Enter file's name: ");
        filename = scanner.next();

        dd_fileArray.writeArray(filename, numbers);
        dd_fileArray.readArray(filename, numbers);

    }
}
