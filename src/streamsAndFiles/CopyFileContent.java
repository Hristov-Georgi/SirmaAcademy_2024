package streamsAndFiles;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/resources/input.txt");
        File outputFile = new File("src/resources/output.txt");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {

            while (bufferedInputStream.available() > 0) {

                bufferedOutputStream.write(bufferedInputStream.read());
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
