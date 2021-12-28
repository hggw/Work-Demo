package VerifyTest;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteLongOfDOS {
    public static void main(String[] args) throws Exception {
        byte[] data = new byte[]{0,0,0,0,0,0,0,0};
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(new String(data, StandardCharsets.ISO_8859_1).
                getBytes(StandardCharsets.ISO_8859_1)));
        while(dataInputStream.available() == 0) {
            long len = dataInputStream.readLong();
            System.out.println(len);
        }
    }
}


