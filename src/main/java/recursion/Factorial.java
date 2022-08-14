package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    /*
    문제
    0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

    출력
    첫째 줄에 N!을 출력한다.*/

    static int gob = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 0){
            System.out.println(1);
            return;
        }
        factorial(n);
        System.out.println(gob);
    }

    public static int factorial(int n){
        if(n == 1){
            return 0;
        }
        gob *= n;
        return factorial(n - 1);
    }
}
