package com.example.delivered;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class Post {

    public void run(int param){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    request(param);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

    }


    public void request(int param){
        try {
            URL url = new URL("https://api.particle.io/v1/devices/2b003e000447393035313138/LED");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            http.setRequestProperty("Authorization", "Bearer d23ad1dabfb92b5fba806dbba8da49c8719977f6");
            http.setRequestProperty("Content-Type", "application/json");

            String on = "{\"arg\":\"on\"}";
            String off = "{\"arg\":\"off\"}";

            byte[] out;
            if(param == 1) {
                out = on.getBytes(StandardCharsets.UTF_8);
            }else{
                out = off.getBytes(StandardCharsets.UTF_8);

            }
            OutputStream stream = null;
            stream = http.getOutputStream();
            stream.write(out);

            System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();

        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
