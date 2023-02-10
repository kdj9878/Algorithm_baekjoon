package basicMathematics2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FindDecimal2 {

    /*문제
    M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

    출력
    한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.*/
    static Map<Integer, Boolean> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int M = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);

        init(M, N);
        findDecimal(M, N);

        for(Map.Entry<Integer, Boolean> entry : map.entrySet()){
            if(entry.getValue() == false){
                bw.write(entry.getKey() + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static void init(int m, int n){
        for(int i = m; i <= n; i++) {
            map.put(i, false);
        }
    }

    public static void findDecimal(int m, int n){
        for(int i = m; i <= n; i++){
            if(i == 1){
                map.put(1, true);
                continue;
            }

            if(map.get(i) == true){
                continue;
            }

            for(int p = 2*i; p <= n; p += i){
                map.put(p, true);
            }
        }
    }

}
