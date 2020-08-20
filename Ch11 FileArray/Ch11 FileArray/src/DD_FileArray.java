/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * Assignment: Ch11 FileArray
 * CISS 111-360
 * This class opens a file, writes into file, reads from the file, and closes the file.
 *
 */

import java.io.*;


public class DD_FileArray {

    /**
     *
     * @param filename
     * @param array
     * @throws IOException
     */
    public static void writeArray(String filename, int[] array) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filename));
        System.out.println("Writing data into " + filename + "...");
        for (int i = 0; i < array.length; i++){
            outputStream.writeInt(array[i]);
        }
        System.out.println("Done!");
        outputStream.close();
    }

    /**
     *
     * @param filename
     * @param array
     * @throws IOException
     */
    public static void readArray(String filename, int[] array) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename));
        boolean endOfFile = false;
        System.out.println("Reading data from "+ filename+ ":");
        while (!endOfFile){
            try {
                for (int i = 0; i < array.length;i++) {
                    array[i] = dataInputStream.readInt();
                    System.out.print(array[i] + " ");
                }
            } catch (EOFException e) {
                endOfFile = true;
            }
        }
        dataInputStream.close();
    }

}
