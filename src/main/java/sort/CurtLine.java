package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CurtLine {
    /*문제
    2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 $N$명의 학생들이 응시했다.

    이들 중 점수가 가장 높은 $k$명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.

    커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.

    입력
    첫째 줄에는 응시자의 수 $N$과 상을 받는 사람의 수 $k$가 공백을 사이에 두고 주어진다.

    둘째 줄에는 각 학생의 점수 $x$가 공백을 사이에 두고 주어진다.

    출력
    상을 받는 커트라인을 출력하라.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int k = Integer.parseInt(arr[1]);
        ArrayList<Integer> testGrade = (ArrayList<Integer>) Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        br.close();
        Collections.sort(testGrade, Collections.reverseOrder());
        System.out.println(testGrade.get(k-1));
    }
}
