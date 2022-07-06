package ioArithmeticOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AGobB {

    public static void main(String[] args) {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] arr = br.readLine().split(" ");
            answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(answer);
    }
}
