package basicMathematics2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BertrandsPostulate {
    static boolean[] prime = new boolean[246913];
    static List<Integer> numList = new ArrayList<>();

    private static void getWholeDecimal(){
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j+=i){
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";
        while((line = br.readLine()) != null){
            if(line.equals("0")){
                break;
            }
            numList.add(Integer.parseInt(line));
        }
        getWholeDecimal();

        for(int start : numList){
            int end = start*2;
            int cnt = 0;
            for(int i = start+1; i <= end; i++){
                if(!prime[i]){
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
