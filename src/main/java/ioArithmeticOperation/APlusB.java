package ioArithmeticOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] arr = br.readLine().split(" ");
            for(String str : arr){
                answer += Integer.parseInt(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(answer);
    }
}
