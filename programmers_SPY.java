import java.util.HashMap;
import java.util.Set;

public class programmers_SPY {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat","headgear"}, {"blue_sunglasses", "eyewear"} , {"green_turban" , "headgear"},
                {"crow_mask", "face"}, {"[blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer = 1; //곱셈을 위해 1로 선언
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        //map 구하기
        for(int i =0; i<clothes.length; i++){
            //의상종류, 갯수
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        //조합
        Set<String> keySet = clothesMap.keySet(); //의상종류.

        for(String key : keySet) {
            answer *= clothesMap.get(key)+1;
        }
        System.out.println(answer -1); //아무것도 안입는 경우의 수 제거
    }
}
