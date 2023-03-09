import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        ArrayList<int[]> listNumber = new ArrayList<>(); // 로또 구매 수량에 대한 숫자들을 담을 배열 생성
        int buy;    // 로또 구매 수량
        char orderNumber = 'A'; // 맨 앞의 기호 초기값
        int[] outputNumber; // 출력 번호
        int[] winningNumber; // 당첨 번호

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        buy = sc.nextInt();

        while (!(buy > 0 && buy < 11)) {   // 로또 10장 초과로 구매 시 재입력 도르마무
            System.out.println("1~10 사이의 숫자만 입력해주세요.");
            buy = sc.nextInt();
        }

        int[] inputNumber = new int[6]; // inputNumber 6칸 배열
        for (int i = 0; i < inputNumber.length; i++) { // size = 6
            inputNumber[i] = (int) (Math.random() * 45) + 1; // inputNumber[0], [1], [2],.. [6]까지 46이하의 난수 생성
            // 증복 제거
            for (int j = 0; j < i; j++) {
                if (inputNumber[i] == inputNumber[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(inputNumber);
    int[] lottoNumberCreate = inputNumber;

    // 입력한 만큼 로또 번호 랜덤 생성
    for (int i = 0; i < buy; i++){
        listNumber.add(i, lottoNumberCreate);
    }

        // 생성된 로또 번호 출력
        for (int i = 0; i < listNumber.size(); i++) {
            outputNumber = new int[6];
            for (int j = 0; j < outputNumber.length; j++) {
                outputNumber = listNumber.get(i);
                if (j == 0) {
                    System.out.printf("%s\t%02d", orderNumber, outputNumber[j]);
                } else if (j < outputNumber.length - 1) {
                    System.out.printf(",%02d", outputNumber[j]);
                } else {
                    System.out.printf(",%02d\n", outputNumber[j]);
                }
            }
            if (i < listNumber.size() - 1) {
                orderNumber++;
            } else {
                orderNumber = 'A';
                System.out.println();
            }
        }














    }



    }

