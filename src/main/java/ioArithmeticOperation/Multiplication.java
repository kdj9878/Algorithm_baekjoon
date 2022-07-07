package ioArithmeticOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Multiplication {

    /*문제
            (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
               472
               385
               ---
              2360
             3776
            1416
            ------
            181720

    (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

    출력
    첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        int[] tmpArr = new int[3];

        for (int i = arr2.length-1; i > -1; i--){
            int first = 0;
            int second = 0;
            int third = 0;
            for(int j = arr1.length-1; j > -1; j--){
              switch (j){
                  case 2: first = arr2[i] * arr1[j];// 1의 자리
                    break;
                  case 1: second = (arr2[i] * arr1[j])*10; // 10의 자리
                    break;
                  case 0: third = (arr2[i] * arr1[j])*100; // 100의 자리
                    break;
              }
            }
            tmpArr[i] = first + second + third;
        }

        for(int z = tmpArr.length-1; z > -1; z--){
            System.out.println(tmpArr[z]);
        }

        int answer = 0;
        for(int p = 0; p < tmpArr.length; p++){
            if(p == 1){
                tmpArr[p] *= 10;
            }
            else if(p == 0){
                tmpArr[p] *= 100;
            }

            answer += tmpArr[p];
        }
        System.out.println(answer);
    }

    // 다른 사람 풀이
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input[] = new String[2];
//        input[0] = br.readLine();
//        input[1] = br.readLine();
//
//        int result = 0;
//        int count = 1;
//        int print = 0;
//        for(int j=2; j>=0; j--) {
//            print = Integer.parseInt(input[0]) * Character.getNumericValue(input[1].charAt(j));
//            result += count * Integer.parseInt(input[0]) * Character.getNumericValue(input[1].charAt(j));
//            count *= 10;
//            System.out.println(print);
//        }
//        System.out.println(result);
//    }
}
