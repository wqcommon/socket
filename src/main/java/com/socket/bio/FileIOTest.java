package com.socket.bio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileIOTest {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("xxx");
        fis.read();
        FileOutputStream fos = new FileOutputStream("xxx");
        fos.write(new byte[1024]);
    }
}
