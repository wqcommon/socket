package com.socket.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TServer {

    public static void main(String[] args) {
        ServerSocket server = null;
        try{
            server = new ServerSocket(9090);
            Socket socket = null;
            while (true){
                socket = server.accept();
            }
        }catch (Exception e){

        }finally {
            if(server != null){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
