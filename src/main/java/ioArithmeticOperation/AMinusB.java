package ioArithmeticOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AMinusB {

    /*문제
    두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    첫째 줄에 A-B를 출력한다.*/

    public static void main(String[] args) {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] arr = br.readLine().split(" ");
            answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(answer);
    }
}
