package Lv1_2;// 기능개발

import java.util.*;

public class StackQueue {

    public static void main(String[] args) {

    }
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> a = new ArrayList<>();

        // ArrayList
        ArrayList<Integer> p = new ArrayList<>(progresses.length);
        ArrayList<Integer> s = new ArrayList<>(speeds.length);
        for (int e : progresses)
            p.add(e);
        for (int e : speeds)
            s.add(e);

        // 반복문
        while (p.size() != 0) {
            int cnt = 0; // 배포 수

            // 하나씩 더하기
            for (int i = 0; i < p.size(); i += 1)
                p.set(i, p.get(i) + s.get(i));

            // 100 넘는 것 처리
            while (p.size() != 0) {
                if (p.get(0) >= 100) {
                    cnt += 1;
                    p.remove(0);
                    s.remove(0);
                } else
                    break;
            }

            // 0이 아니면 정답 추가
            if (cnt != 0)
                a.add(cnt);
        }

        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++)
            answer[i] = a.get(i);
        return answer;
    }
}
