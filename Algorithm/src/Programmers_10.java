public class Programmers_10 {

// 프로그래머스 알고리즘 문제
// 하샤드 수

// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    public boolean solution(int x) {
        String s = Integer.toString(x);
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            result += s.charAt(i) - '0';
        }

        if(x % result == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Programmers_10 ps = new Programmers_10();
        int x = 10;
//        int x = 12;
//        int x = 11;
//        int x = 13;
        System.out.println(ps.solution(x));
    }
}
