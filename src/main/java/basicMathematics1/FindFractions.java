package basicMathematics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFractions {
    /*문제
    무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

        1/1	1/2	1/3	1/4	1/5	…
        2/1	2/2	2/3	2/4	…	…
        3/1	3/2	3/3	…	…	…
        4/1	4/2	…	…	…	…
        5/1	…	…	…	…	…
        …	…	…	…	…	…
    이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

    출력
    첫째 줄에 분수를 출력한다.*/
    static Map<Integer, int[]> map = new HashMap<>();
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        int i = 1;
        while(sum < num){
            sum += i;
            i++;
        }

        int diagonalSum = i; // 대각선 분모, 분자 합
        int diagonalCount = i-1;  // 대각선 숫자의 개수
        int diagonal = (sum - diagonalCount) + 1; // 대각선 처음 숫자
        int diagonalDesc = sum;// 대각선 마지막 숫자
        int order = 0;
        // 대각선 분모, 분자의 합이 홀수일 경우
        if(diagonalSum % 2 != 0){
            order = diagonalDesc - num;
        }else{
            order = Math.abs(diagonal - num);
        }
        System.out.println("순서 : "+  order);
        for(int j = 0 ; j <= order; j++){
            recursion(diagonalSum, 1);
        }
        System.out.println(Arrays.toString(map.get(order)));
    }

    public static int recursion(int n, int depth){
        if(depth == n){
            return 0;
        }
        map.put(count, new int[]{depth, n - depth});
        count++;
        return recursion(n, depth + 1);
    }
}
