package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sangsu {
    /*문제
    상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
    이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
    상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

    상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
    예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

    두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

    출력
    첫째 줄에 상수의 대답을 출력한다.*/


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr1 = toIntArray(str[0].toCharArray());
        int[] arr2 = toIntArray(str[1].toCharArray());

        if(justice(arr1, arr2)){
            swapAndPrint(arr1);
        }
        else{
            swapAndPrint(arr2);
        }

    }

    public static int[] toIntArray(char[] chaArr){
        int[] intArr = new int[chaArr.length];
        for(int i = 0; i < chaArr.length; i++){
            intArr[i] = (int)chaArr[i] - 48;
        }
        return intArr;
    }

    /*
    * true일 경우 첫 번째 숫자가 더 큼
    * false일 경우 뒤에 숫자가 더 큼
    * */
    public static boolean justice(int[] arr1, int[] arr2){
        for(int i = arr1.length-1; i >= 0; i--){
            for(int j = arr2.length-1; j >= 0; j--){
                int compareResult = Integer.compare(arr1[i], arr2[i]);
                if(compareResult > 0){
                    return true;
                }
                else if(compareResult < 0){
                    return false;
                }
                else{
                    continue;
                }
            }
        }
        return false;
    }

    public static void swapAndPrint(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for(int val : arr) stack.add(val);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + "");
        }
    }
}
