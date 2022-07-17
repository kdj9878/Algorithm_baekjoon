package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class ArithmeticSequence {
    /*문제
    어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
    등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

    출력
    첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.*/

    static int count = 0;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        for(int i = 1; i <= length; i++){
            if(i < 100){
                count++;
            }
            else if(isHansu(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isHansu(int num){
        boolean value = true;
        int[] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        queue = new LinkedList<>();
        for(int val : arr) queue.add(val);
        int cha = 0;
        int count = 0;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(queue.isEmpty()){
                break;
            }
            int next = queue.peek();
            if(count == 0){
                cha = cur - next;
                count++;
                continue;
            }

            if(cha != (cur - next)){
                value = false;
                break;
            }
        }
        return value;
    }
}
