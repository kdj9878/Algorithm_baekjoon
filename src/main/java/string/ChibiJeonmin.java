package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChibiJeonmin {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        long answer = 0;
        while(st.hasMoreTokens()){
            answer += Long.parseLong(st.nextToken());
        }
        System.out.println(answer);
    }
}
