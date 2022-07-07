package conditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class OvenClock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] timeArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int time = Integer.parseInt(br.readLine());

        int div = time/60; // 60 이하일 경우 0, 이상일 경우 몫이 나옴
        double mod = ((double)time)%60; // 60 이하일 경우 그 숫자가 나오고 60 이상일 경우 나머지가 나옴

        boolean flag  = false;
        if((int)(timeArr[1] + mod) > 59){
            div++;
            flag = true;
        }

        int hour = (timeArr[0] + div) > 23 ? (timeArr[0] + div) - 24 : (timeArr[0] + div);
        int minute = flag ? Math.abs(60 - (int)(timeArr[1] + mod)) : (int)(timeArr[1] + mod);
        System.out.println(hour+ " " + minute);
    }
}
