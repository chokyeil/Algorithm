public class Programmers_7 {

 // 프로그래머스 알고리즘 문제
 // 문자열 내 p와 y의 개수

// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
// 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

    boolean solution(String s) {
        boolean answer = true;

        char[] arrCH = new char[s.length()];
        int countP = 0;
        int countY = 0;

        for(int i = 0; i < s.length(); i++){
            arrCH[i] = s.charAt(i);
        }

        for(int i = 0; i < s.length(); i++){
            if(arrCH[i] == 'p' || arrCH[i] =='P'){
                countP++;
            } else if (arrCH[i] == 'y' || arrCH[i] == 'Y'){
                countY++;
            }
        }

        if(countP != countY) answer = false;

        return answer;
    }

    public static void main(String[] args){
        Programmers_7 p7 = new Programmers_7();
        String str = "pPoooyY";
//        String str = "Pyy";

        System.out.println(p7.solution(str));
    }
}
