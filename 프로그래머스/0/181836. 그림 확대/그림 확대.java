class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for (String row : picture) {
            // 1. 가로로 k배
            StringBuilder sb = new StringBuilder();
            for (char c : row.toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            String line = sb.toString();

            // 2. 세로로 k배
            for (int i = 0; i < k; i++) {
                answer[idx++] = line;
            }
        }
        return answer;
    }
}