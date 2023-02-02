package basicMathematics2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Factorization {

    /*문제
    정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

    입력
    첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

    출력
    N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1){
            return;
        }

        int i = 2;
        while(N != 1){
            if(N % i != 0){
                i += 1;
            }
            else{
                N /= i;
                System.out.println(i);
            }
        }
    }
}
