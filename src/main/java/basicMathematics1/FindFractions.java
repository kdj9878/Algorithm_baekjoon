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
    static int count = 1;
    static int goal;
    static boolean flag = true;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        goal = num;
        boolean descFlag = true;
        int i = 2;
        while(flag){
            if(descFlag){
                recursionDesc(i, i-1);
                descFlag = false;
            }
            else{
                recursionAsc(i, 1);
                descFlag = true;
            }
            i++;
        }

        int[] answer = map.get(num);
        System.out.println(answer[0] + "/" + answer[1]);
    }

    public static int recursionDesc(int n, int depth){
        if(depth == 0){
            return 0;
        }
        map.put(count, new int[]{depth, n - depth});
        if(count == goal){
            flag = false;
            return 0;
        }
        count++;
        return recursionDesc(n, depth - 1);
    }

    public static int recursionAsc(int n, int depth){
        if(depth == n){
            return 0;
        }
        map.put(count, new int[]{depth, n - depth});
        if(count == goal){
            flag = false;
            return 0;
        }
        count++;
        return recursionAsc(n, depth + 1);
    }
}
