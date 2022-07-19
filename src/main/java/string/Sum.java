package string;

import java.io.*;
import java.util.stream.Stream;

public class Sum {
    /*문제
    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

    출력
    입력으로 주어진 숫자 N개의 합을 출력한다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int length = Integer.parseInt(br.readLine());

        // Stream 이용
        sum = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).sum();

        // for문 이용
//        String str = br.readLine();
//        for(int i = 0; i < length; i++){
//            sum += Character.getNumericValue(str.charAt(i));
//        }

        br.close();
        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}
