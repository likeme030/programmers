import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {    // × 2
                    li.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {        // arr[i]번 반복
                    li.remove(li.size() - 1);             // 맨 뒤 하나 삭제
                }
            }
        }

        int[] result = new int[li.size()];
        int idx = 0;
        for (int x : li) {
            result[idx++] = x;
        }
        return result;
    }
}