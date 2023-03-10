import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class StudyMemo {
    public static void main(String[] args) {

        // 자주 쓰이는 문법 
        
// int 관련 문법

        System.out.println(Integer.MAX_VALUE); // 정수에서 가장 큰 값 2147483647 만약 + 1 하면 -2147483647 나옴
        System.out.println((long)Integer.MAX_VALUE); // int 보다 큰 long을 붙여주면 2147483648 나옴
        System.out.println(Integer.MIN_VALUE); // 정수에서 가장 작은 값 -2147483647

// String, char 관련 문법

        // 문자열 비교 equals()
        String str1 = "study";
        String str2 = "study";
        if (str1.equals(str2)){
            System.out.println("str1 과 str2는 같습니다.");
        }

        // indexOf() 특정 문자 찾을 때
        System.out.println("indexOf() 특정 문자 찾을 때");
        String str3 = "backendDeveloper!";
        System.out.println(str3.indexOf("e")); // 4번 째 e가 있다
        // 4번 째 자리에 e를 찾았는데 뒤에꺼를 찾고 싶을 때
        System.out.println(str3.indexOf("e", str3.indexOf("e") + 1));
        System.out.println("\n");

        // replace() 특정 문자 대체 할 때
        System.out.println("replace() 특정 문자 대체 할 때");
        String str4 = "I don't want to study";
        System.out.println(str4.replace("don't want", "have"));
        System.out.println("\n");


        // substring() 문자열에서 부분 문자열 뽑을 때
        System.out.println("substring() 문자열에서 부분 문자열 뽑을 때");
        String str5 = "Excusme Sir, How can i find train station";
        System.out.println(str5.substring(0, 3)); // 3전 까지 출력 0 1 2
        System.out.println(str5.substring(0, str5.indexOf("S") + 2)); // S전 까지 출력하다 + 2 글자 만큼 추가 출력
        System.out.println("\n");


        // toUpperCase(), toLowerCase() 대문자는 소문자로, 소문자는 대문자로
        System.out.println("toUpperCase(), toLowerCase() 대문자는 소문자로, 소문자는 대문자로");
        String str6 = "Do you 워너 build a snowman";
        System.out.println(str6.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println("\n");


        // StringBuffer (값을 계속해서 변경 할 때)
        System.out.println("StringBuffer (값을 계속해서 변경 할 때)");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1); // 01234
        sb1.append("56789");
        System.out.println("sb1 = " + sb1); // 0123456789
        System.out.println("\n");



        // char int로 변형
        char ch1 = 'a';
        char ch2 = 'z';
        System.out.println((int)ch1); // a를 정수형으로 변환해 ASCII 97 출력
        System.out.println((int)ch2); // z를 정수형으로 변환해 ASCII 122 출력

        // double, float 문법
        System.out.println(Double.MAX_VALUE); // line 6와 동일
        System.out.println(Float.MAX_VALUE);


// Array 배열
        // array[] 선언
        int[] myArray1 = new int[3];
        char[] myArray2 = new char[1];
        String[] myArray3 = new String[2];
        int[] myArray4 = {1, 2, 3, 4, 5};
        for (int i = 0; i < myArray4.length; i++){
            System.out.println(myArray4[i]);
        }
        for (int i : myArray4){
            System.out.println(i);
        }

        // array[][]
        System.out.println("*****************************************************");
        int[][] myArray5 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("myArray5[1][2] = " + myArray5[1][2]); // 6
        System.out.println(myArray5.length);
        for (int i = 0; i < myArray5.length; i++) {
            for (int j = 0; j < myArray5[i].length; j++) {
                System.out.print(myArray5[i][j]); // 123456
            }
        }

        for (int[] ints : myArray5){
            for (int anInt : ints){
                System.out.println("anInt = " + anInt); // 123456
            }
        }

        // ArrayList
        ArrayList l1 = new ArrayList();
        // add 추가하기
        l1.add(1);
        l1.add(2);
        l1.add("JAVA");
        l1.add(5);
        System.out.println(l1); // [1, 2, JAVA, 5]
        l1.add(1, "PYTHON"); // 2번 째 위치에, & 값을 넣겠다.
        System.out.println(l1); // [1, PYTHON, 2, JAVA, 5]

        // get 원하는 값 가져오기
        System.out.println(l1.get(1)); // PYTHON
        System.out.println(l1.get(4)); // 5
        // size data 길이
        System.out.println(l1.size()); // 5
        // remove 원하는 값 지우기
        System.out.println(l1.remove(0)); // 1번 째 인덱스 remove
        System.out.println(l1); // [PYTHON, 2, JAVA, 5]
        l1.remove(Integer.valueOf(2)); // 2번 째 인덱스가 아닌 2라는 값을 remove
        System.out.println(l1); // [PYTHON, JAVA, 5]
        // clear 비우기
        l1.clear();
        System.out.println(l1); // []
        // sort 정렬
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(1);
        l2.add(7);
        l2.add(3);
        System.out.println(l2); // [5, 1, 7, 3]
        l2.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(l2); // [1, 3, 5, 7]
        l2.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(l2); // [7, 5, 3, 1]

        // contains data를 포함하고 있는지 유무
        System.out.println(l2.contains(1)); // true
        System.out.println(l2.contains(23)); // false


// HashMap
        // put 추가하기
        HashMap map = new HashMap();
        map.put("water",1500); // key, value
        map.put("apple", 3700);
        map.put("lemon", 900);
        System.out.println(map); // {apple=3700, lemon=900, water=1500}

        // get 원하는 값 꺼내기
        System.out.println(map.get(1500)); // null
        System.out.println(map.get("apple")); // 3700
        // size data 길이
        System.out.println(map.size()); // 3
        // remove data 지우기
        System.out.println(map.remove("banana")); // null
        System.out.println(map.remove("apple")); // 3700
        System.out.println(map); // {lemon=900, water=1500}
        // containsKey 해당 키 값이 map에 있는 지 확인
        System.out.println(map.containsKey("apple")); // false
        System.out.println(map.containsKey("kiwi")); // false
        System.out.println(map.containsKey("lemon")); // true
        // < > Generics 자료형을 제한 해주는 기능
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("Hello");
        System.out.println(l3); // [1, Hello]

        ArrayList<String> l4 = new ArrayList<>(); // String 만 넣을 수 있게 제한
        l4.add("hello");
        // l4.add(2); 오류
        l4.add("only String");

        HashMap map1 = new HashMap();
        map1.put(123, "id");
        System.out.println(map1); // {123 = id}
        map1.put("apple", 1234); // {apple = 1234, 123 = id}
        System.out.println(map1);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("id", 1234);
        System.out.println("map2 = " + map2); // {id = 1234}


        // Array 와 ArrayList의 차이점
        //                               [Array]  (초시화시 고정)                                        [ArrayList]  (초기화시 사이즈를 표시하지 않음, 크기가 가변적임)
                                         int[] arr = new int[3];                                       ArrayList<Integer> arrList = new ArrayList<>();
        // fastest                       초기화시 메모리에 할당되어 ArrayList보다 속도가 빠름                  데이터 추가 삭제시 메모리를 재할당하기 때문에 속도가 Array보다 느림
        // sizeChange                    사이즈 변경 불가                                                 추가, 삭제 가능 / .add(), remove()
        // Multidimensional              int[][][] multiArr = new int[3][5][1];                        불가능

        // HashMap 과 HashSet의 차이점
        //                               HashMap                                                       HashSet
                                         HashMap<String,String> map6 = new HashMap<String,String>();   HashSet<Integer> set1 = new HashSet<Integer>();
        //                               HashTable과 유사한 자료구조로 데이터를 저장한다.                     내부적으로 HashMap을 사용하기 때문에 HashTable과 유사한 자료구조로 데이터를 저장한다.
        //                               HashMap은 Key-Value 쌍 형태로 데이터를 저장한다.                    Key 값으로는 삽입되는 객체 그 자체를, Value 값으로는 HashSet 내부 구현 코드에서 미리 선언해둔 dummy 객체를 사용
        //                               HashMap은 중복 Key 값을 허용하지 않지만, 중복 Value 값은 허용한다.     HashSet은 객체 자체를 데이터로 저장하기 때문에 중복을 허용하지 않는다.
        //                               ex. {'a': 1, 'b': 1, 'c': 2}                                   ex. {'a', 'b', 'c'}
        //                               HashMap이 HashSet보다 빠르다. 그래서 데이터의 유일함(Uniqueness)을 유지하기 위해 항상 HashMap이 HashSet보다 선호된다.



// 연산자
        // 산술 연산자, 증가 * 감소 연산자
        int num1 = 10;
        int num2 = 3;
        System.out.println(num1 * num2); // 30
        System.out.println(num1 / num2); // 3
        System.out.println(num1 % num2); // 1
        // 관계 연산자
        int num3 = 10;
        int num4 = 8;
        System.out.println(num3 > num4); // true
        System.out.println(num3 < num4); // false
        System.out.println(num3 == num4); // true
        System.out.println(num3 != num4); // true
        // 논리 연산자
        System.out.println((10 > 9) && (1 == 0)); // 2가지 조건이 만족할 때 실행
        System.out.println((10 > 9) || (1 == 0)); // 한 가지 조건만 만족 할 때 실행
        // 삼항 연산자
        int num5 = 100;
        String aResult = (num5 == 100) ? "yes" : "no"; // 조건이 true면 왼쪽 false면 오른쪽
        System.out.println("aResult = " + aResult); // true
        // 비트 논리 연산자(생략)



// if, switch 조건문
        // if
        String str7 = "Hello";

        if(str7.equals("Hello")){
            System.out.println("1번 째 조건이 참이라면 실행할 문장");
        }else if(str7.contains("!")) {
            System.out.println("2번 째 조건이 참이라면 실행할 문장");
        }else {
            System.out.println("참인 조건이 없다면 실행할 문장");
        }

        // switch
        String fruit = "apple";
        switch (fruit){
            case "apple":
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blackberry":
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }

// for, for each, while 반복문

        // for
        for(int i = 0; i < 5; i++){                      // *
            for(int j = 0; j < i + 1; j++){              // * *
                System.out.print("*");                   // * * *
            }                                            // * * * *
            System.out.println();                        // * * * * *
        }

        for(int i = 0; i < 5; i++){                      // *
            if(i == 2){                                  // * *
                continue; // i 가 2라면 위에서 부터 다시     // * * * *
            }                                            // * * * * *
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++){                      // *
            if(i == 2){                                  // * *
                break;
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for each
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        for (int num : nums){
            System.out.println(num);
        }

        // while
        int i = 0;
        while (i < 5){
            System.out.println(i++);
        }
        System.out.println();

        i = 0;
        while (i < 5){
            if(i == 2){
                i++;
                continue;
            }
            System.out.println(i++);
        }


    }
}
