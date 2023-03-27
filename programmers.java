import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        Deque <Integer>dq = new LinkedList<>();
        for(int i : numbers){
            dq.add(i);
        }
        if(direction.contains("right")){
            dq.addFirst(dq.removeLast());
        }else {
            dq.addLast(dq.removeFirst());
        }
        for (int i = 0; i < numbers.length; i++) {
            answer[i] += dq.pop();
        }
        return answer;
    }
}