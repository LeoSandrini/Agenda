package com.studies.sandrini.agenda;

import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Sandrini on 09/10/2017.
 */

public class WebClient {
    public String post(String json) {
        try {
            URL url = new URL("https://www.caelum.com.br/mobile");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("content-type", "application/json");
            conn.setRequestProperty("Accept", "application/json");

            conn.setDoOutput(true);
            PrintStream output = new PrintStream(conn.getOutputStream());
            output.println(json);

            Scanner scanner = new Scanner(conn.getInputStream());
            String answer = scanner.next();
            return answer;

        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

