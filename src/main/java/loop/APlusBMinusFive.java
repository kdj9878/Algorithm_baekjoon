package loop;

import java.io.*;
import java.util.StringTokenizer;

public class APlusBMinusFive {

    /*문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    입력은 여러 개의 테스트 케이스로 이루어져 있다.

    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    입력의 마지막에는 0 두 개가 들어온다.

    출력
    각 테스트 케이스마다 A+B를 출력한다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        String temp;
        while ((temp = br.readLine()) != null){
            st = new StringTokenizer(temp, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            if(a == 0 && b == 0){
                break;
            }

            bw.write(String.valueOf(sum) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
