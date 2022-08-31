package basicMathematics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class BIgNumberAPlusB {
    /*문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

    출력
    첫째 줄에 A+B를 출력한다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sum = br.readLine().split(" ");
        System.out.println(Arrays.toString(sum));

    }
}
