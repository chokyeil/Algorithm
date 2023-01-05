public class Programmers_11 {

    // 프로그래머스 알고리즘 문제
    // 정수 내림차순으로 배치하기

    // 함수 solution은 정수 n을 매개변수로 입력받습니다.
    // n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    // 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    public long solution(long n) {
        long answer = 0;

        String s = "" + n;
        String str = "";

        int[] arrNum = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            arrNum[i] = s.charAt(i) - '0';
        }

        int temp = 0;

        for(int i = 0; i < arrNum.length; i++){
            for(int j = i+1; j < arrNum.length; j++){
                if(arrNum[i] < arrNum[j]){
                    temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
        }

        for(int i = 0; i < arrNum.length; i++){
            str += arrNum[i];;
        }
        answer = Long.parseLong(str);
        return answer;
    }

    public static void main(String[] args){
        Programmers_11 pr = new Programmers_11();
        int n = 118372;
        System.out.println(pr.solution(n));
    }
}
