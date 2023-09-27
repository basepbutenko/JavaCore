package Courses;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SimpleURL {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://bank.gov.ua/ua/markets/exchangerates");
        URLConnection nbuApi = url.openConnection();


        BufferedReader br = new BufferedReader(new InputStreamReader(nbuApi.getInputStream()));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
    }
}
