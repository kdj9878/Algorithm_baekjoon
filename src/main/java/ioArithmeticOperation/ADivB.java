package ioArithmeticOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADivB {
    public static void main(String[] args) {
        double answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] arr = br.readLine().split(" ");
            answer = Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]);
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(answer);
    }
}
