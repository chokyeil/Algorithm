public class Programmers_4 {

// 프로그래머스 알고리즘 문제
// 자릿수 더하기

// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    public int solution(int n) {
            int answer = 0;

            String strNum = Integer.toString(n);
            int[] arrNum = new int[strNum.length()];

            for(int i = 0; i < strNum.length(); i++){
                arrNum[i] = strNum.charAt(i) - '0';
            }

            for(int i = 0; i < arrNum.length; i++){
                answer += arrNum[i];
            }


            return answer;
    }
        
    public static void main(String[] args){
        Programmers_4 s = new Programmers_4();
        int n = 123;
        //int n = 987
        System.out.println(s.solution(n));
    }
}
