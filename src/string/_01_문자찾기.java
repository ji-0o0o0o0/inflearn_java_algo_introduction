package string;

import java.util.Scanner;

public class _01_문자찾기 {
    public static void main(String[] args) {
        /*
        * 문제
        * 한 개의 문자열을 입력받고 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지확인
        * 대소문자를 구분하지 않습니다
        * 문자열의 길이는 100을넘지않습니다
        * 풀이
        * 1. 입력 받은 문자열 모두소문자로 변경
        * 2. 입력받은 문자는 replaceAll로 "" 값으로 대치
        * 3. 전체 문자열과 대치한 문자열의 갯수를 빼준다.
        * */
        Scanner sc = new Scanner(System.in);
        String str=sc.next().toLowerCase();
        char c=sc.next().toLowerCase().charAt(0);

        int answer = str.length() - str.replaceAll(c+"","").length();

        System.out.println(answer);
    }

    //강의
    /*
    *
    * */

}
