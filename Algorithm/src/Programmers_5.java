public class Programmers_5 {

    // 프로그래머스 알고리즘 문제
    // 자연수 뒤집어 배열로 만들기

    // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    public int[] solution(long n) {
        String str = ""+n;
        int[] answer = new int[str.length()];
        int count = 0;

        while(n > 0){
            answer[count] = (int)(n % 10);
            n /= 10;
            count++;
        }
        return answer;
    }

    public static void main(String[] args){
        Programmers_5 pr = new Programmers_5();
        int n = 12345;

        int[] arr;
        arr = pr.solution(n);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
