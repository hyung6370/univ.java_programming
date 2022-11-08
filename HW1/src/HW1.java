import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글단어? ");
            String inputWord = br.readLine();
            if (inputWord.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            String engWord = Dictionary.kor2Eng(inputWord);
            if (engWord.equals("false")) {
                System.out.println(inputWord + "는 저의 사전에 없습니다.");
            }
            else System.out.println(engWord);
        }
    }
}

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String korWord) {
        for (int i = 0; i < kor.length; i++) {
            if (korWord.equals(kor[i])) {
                if (i % 2 == 1) {
                    System.out.print(korWord + "는 ");
                } else {
                    System.out.print(korWord + "은 ");
                }
                return eng[i];
            }
        }
        return "false";
    }
}




