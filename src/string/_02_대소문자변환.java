package string;

import java.util.Scanner;

public class _02_대소문자변환 {
    public static void main(String[] args) {
        /*
         * 문제
         * 대문자와 소문자가 같이 존재하는 문자열 입력받아 대문자-> 소문자, 소문자-> 대문자로 변형
         * 풀이
         * char 대문자와 소문자 차이 이용하면 될듯(32)
         * */

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder answer = new StringBuilder();
        for(char c : str.toCharArray()){
            //97보다 작으면 대문자 크면 소문자
            if(c<97){
                answer.append((char) (c+32));
            }else {
                answer.append((char) (c-32));
            }
        }
        System.out.println(answer.toString());

    }

}
