package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudyingVocabulary {
    /*문제
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.*/

    public static class Node implements Comparable<Node> {
        char data;
        int count;

        Node(char data, int count){
            this.data = data;
            this.count = count;
        }

        public char getData() {
            return data;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(Node o) {
            return this.count <= o.getCount() ? 1 : -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String answer = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Node> nodeList = new PriorityQueue<>();
        String str = br.readLine();
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char cha = str.charAt(i);
            map.put(cha, map.getOrDefault(cha, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            Node node = new Node(entry.getKey(), entry.getValue());
            nodeList.offer(node);
        }

        if(nodeList.size() == 1){
            answer = String.valueOf(nodeList.poll().getData()).toUpperCase();
        }
        else {
            Node firstNode = nodeList.poll();
            Node nextNode = nodeList.peek();
            if(firstNode.getCount() == nextNode.getCount()){
                answer = "?";
            }
            else{
                answer = String.valueOf(firstNode.getData()).toUpperCase();
            }
        }
        System.out.println("answer => " + answer);
    }
}
