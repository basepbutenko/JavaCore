package io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleURL {
    public static void main(String[] args) throws IOException {
        URL nbuAPI=new URL("https://bank.gov.ua/ua/markets/exchangerates");
        BufferedReader br=new BufferedReader(new InputStreamReader(nbuAPI.openStream()));
        String str;
        while ((str= br.readLine())!=null){
            System.out.println(str);
        }
    }
}
