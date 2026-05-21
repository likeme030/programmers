class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean y = x1 || x2;
        boolean z = x3 || x4;
        return y && z; 
    }
}