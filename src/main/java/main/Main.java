package main.java.main;
import java.io.*;
import java.net.*;
public class Main {
    public static class URLConnectionReader {
        public static void main(String[] args) throws Exception {
            URL oracle;
            oracle = new URL("https://www.w3schools.com/js/json_demo_array.txt");
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
    }
}