import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 파일 개수 입력
        int n = Integer.parseInt(sc.nextLine());

        // 2. 파일명 배열 선언 및 입력 받기
        String[] files = new String[n];
        for (int i = 0; i < n; i++) {
            files[i] = sc.nextLine();
        }

        // 3. 문자열 길이 고정
        int length = files[0].length();
        StringBuilder result = new StringBuilder();

        // 4. 각 인덱스 별로 문자 비교
        for (int i = 0; i < length; i++) {
            char current = files[0].charAt(i);  // 첫 문자열의 해당 문자
            boolean isSame = true;

            for (int j = 1; j < n; j++) {
                char compare = files[j].charAt(i);

                // 아스키 코드 비교도 가능하지만, 문자 직접 비교로 충분함
                if (compare != current) {
                    isSame = false;
                    break;  // 하나라도 다르면 탈출
                }
            }

            // 5. 결과 패턴에 추가
            if (isSame) {
                result.append(current);  // 그대로 추가
            } else {
                result.append('?');  // 다르면 ? 처리
            }
        }

        // 6. 결과 출력
        System.out.println(result.toString());
    }
}
