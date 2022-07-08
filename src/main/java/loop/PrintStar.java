package loop;

import java.io.*;

public class PrintStar {
    /*문제
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

    입력
    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

    출력
    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i = count; i > 0; i--){
            for(int j = -1; j < count - i; j++){
                bw.write("*");
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
