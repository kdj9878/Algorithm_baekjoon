package TwoDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MatrixAddition {
    /*문제
    N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

    입력
    첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
    이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

    출력
    첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.*/

    private static int[] partition(String line){
        int[] arr = new int[2];
        String[] lineSplit = line.split(" ");
        arr[0] = Integer.valueOf(lineSplit[0]);
        arr[1] = Integer.valueOf(lineSplit[1]);
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] NM = partition(br.readLine());
        int[][] resultArr = new int[NM[0]][NM[1]];

        int W = 0;
        int wholeLine = NM[0]*2;
        for(int L = 1; L <= wholeLine; L++){
            String[] strArr = br.readLine().split(" ");
            if(W == wholeLine/2){
               W = 0;
            }
            for(int N = 0; N < NM[1]; N++) {
                resultArr[W][N] += Integer.parseInt(strArr[N]);
            }
            W++;
        }

        for(int i = 0; i < resultArr.length; i++){
            for(int j = 0; j < resultArr[0].length; j++){
                if(j == resultArr[0].length -1){
                    bw.write(String.valueOf(resultArr[i][j]) + "\n");
                }else{

                    bw.write(resultArr[i][j] + " ");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
