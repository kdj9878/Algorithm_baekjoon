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


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(mine(N));
        System.out.println("---------------");
        System.out.println(other(N));

    }

    /**
     * 내 풀이
     * @param N
     */
    private static String mine(int N) {
        StringBuffer sb = new StringBuffer();

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
        return sb.toString();
    }

    /**
     * 다른 사람의 신기한 풀이
     * @throws IOException
     */
    private static String other(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 2 * n +1; i++) { //몇줄 쓸꺼야?
            for(int j = 0; j<(n-i)+((i)/n)*(-(n-i)+((i)%n)); j++) {//빈칸 몇개? 4321 0(n) 1234 //n까지 0 n위 부터1 (j/n) //
                sb.append(" ");
            }
            for(int j = 0; j<(2*i-1)+((i)/n)*(-(2*i-1)+2*(n-i%n)-1); j++) {//별 몇개? 1357 9(n) 7531
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
