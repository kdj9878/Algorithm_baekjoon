package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for(int i = 0; i < cases; i++){
            String str = br.readLine();
            String first = String.valueOf(str.charAt(0));
            String last = str.substring(str.length()-1, str.length());
            System.out.println(first+last);
        }
        br.close();

    }
}
