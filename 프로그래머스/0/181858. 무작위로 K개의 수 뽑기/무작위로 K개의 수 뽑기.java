import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){          // 1. arr 전체 순회
            if(stack.size() == k) break;              //    k개 모이면 종료
            if(!stack.contains(arr[i])){              // 2. 전체와 중복 비교
                stack.push(arr[i]);
            }
        }

        while(stack.size() < k){                      // 3, 4. k개 될 때까지 -1
            stack.push(-1);
        }

        int idx = 0;
        int[] result = new int[k];                    // 4. 길이 k
        for(int x : stack){
            result[idx++] = x;
        }

        return result;
    }
}