package intensification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {

    /**
     *     *            4/1 5
     *    ***           3/3 6
     *   *****          2/5 7
     *  *******         1/7 8
     * *********        0/9 9
     *
     */

    /**
     * 내 풀이
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        int len = N;
        int star = 1;
        int space = len-star;
        for(int i = 1; i <= N; i++){
            //공백
            for(int j = 0; j < space; j++){
                sb.append(" ");
            }
            //별
            for(int z = 0; z < star; z++){
                sb.append("*");
            }
            sb.append("\n");

            len++;
            star += 2;
            space = len - star;
        }
        String[] strArr = sb.toString().split("\n");
        for(int i = strArr.length-2; i >= 0; i--){
            sb.append(strArr[i] + "\n");
        }

        System.out.println(sb.toString());
    }

    /**
     * 다른 사람의 신기한 풀이
     * @throws IOException
     */
    public void main2() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i <= 2 * n +1; i++) { //몇줄 쓸꺼야?


            for(int j = 0; j<(n-i)+((i)/n)*(-(n-i)+((i)%n)); j++) {//빈칸 몇개? 4321 0(n) 1234 //n까지 0 n위 부터1 (j/n) //

                System.out.print(" ");

            }

            for(int j = 0; j<(2*i-1)+((i)/n)*(-(2*i-1)+2*(n-i%n)-1); j++) {//별 몇개? 1357 9(n) 7531

                System.out.print("*");

            }

            System.out.println();

        }

        in.close();
    }
}
