package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CroatiaAlphabet {
    /*예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
    단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

    dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

            입력
    첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

    단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

    출력
    입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.*/
    static final String PATTERN = "(c=)|(c-)|(dz=)|(d-)|(lj)|(nj)|(s=)|(z=)";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String croatia = br.readLine();
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(croatia);

        int count = 0;
        while(matcher.find()){
            String replaceStr = matcher.group(0);
            croatia = croatia.replaceFirst(replaceStr, "");
            count++;
        }
        count += croatia.length();
        System.out.println(count);
    }
}
