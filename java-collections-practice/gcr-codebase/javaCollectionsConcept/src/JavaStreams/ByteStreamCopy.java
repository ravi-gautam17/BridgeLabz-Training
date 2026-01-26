package JavaStreams;

import java.io.*;

public class ByteStreamCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String sourceFile = "C:/Users/Ravi/Downloads/test.txt";
        String bufferedCopy = "buffered_copy.txt";
        String unbufferedCopy = "unbuffered_copy.txt";

        try {
            long bufferedTime = copyWithBufferedStreams(sourceFile, bufferedCopy);
            long unbufferedTime = copyWithUnbufferedStreams(sourceFile, unbufferedCopy);

            System.out.println("\n===== PERFORMANCE COMPARISON =====");
            System.out.println("Buffered Streams Time   : " + bufferedTime + " ms");
            System.out.println("Unbuffered Streams Time : " + unbufferedTime + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* ========== BUFFERED STREAM COPY ========== */

    public static long copyWithBufferedStreams(String sourceFile, String destinationFile)
            throws IOException {

        byte[] buffer = new byte[BUFFER_SIZE];
        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // milliseconds
    }

    /* ========== UNBUFFERED STREAM COPY ========== */

    private static long copyWithUnbufferedStreams(String sourceFile, String destinationFile)
            throws IOException {

        byte[] buffer = new byte[BUFFER_SIZE];
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000;
    }
}
