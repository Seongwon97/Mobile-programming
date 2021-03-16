package gachon.example.practice_network;

import android.util.Log;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ConnectThread extends Thread {
    String hostname;

    public ConnectThread(String address){
        hostname=address;
    }

    public void run(){
        try{
            int port=7777;

            Socket socket = new Socket(hostname, port);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            Log.d("MainActivity","서버에서 받은 메시지 : "+dis.readUTF());
            dis.close();
            socket.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}