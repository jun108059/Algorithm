package Lv1_2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 * 두개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return
**/

public class P68644 {
    public static void main(String[] args) {

    }
    // 1. 더해서 만든 숫자 배열
    // 2. 중복 제거
    // 3. 오름차순
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int tempVal = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            for(int k = i; k < numbers.length-1; k++) {
                tempVal = numbers[i] + numbers[k+1];
                if(!arrayList.contains(tempVal))
                    arrayList.add(tempVal);    
            }
        }
        Collections.sort(arrayList);
        
        int[] answer = new int[arrayList.size()];
        
        int size = 0;
        for(int item : arrayList) {
            answer[size++] = item;
        }
        return answer;
    }
}