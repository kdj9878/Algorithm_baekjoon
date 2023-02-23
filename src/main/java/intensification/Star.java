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
}
