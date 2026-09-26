class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();   // 새 문자열을 만들 도구

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);

            if (c == 'a' || c == 'A') {
                sb.append('A');
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);                     // 나머지 소문자는 그대로
            }
        }
        return sb.toString();                     // 다시 String으로 변환
    }
}