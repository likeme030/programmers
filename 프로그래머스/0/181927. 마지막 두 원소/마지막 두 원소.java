class Solution {
    public int[] solution(int[] num_list) {
        
     int[] e = new int[num_list.length + 1];
    for(int i = 0 ; i < num_list.length; i++){
        e[i] = num_list[i];
    }
     int a = e.length-1;
     int b = num_list.length-1;
     int c = num_list.length-2;
        
        if(num_list[c] < num_list[b]){
            e[a] = num_list[b] - num_list[c];
        }else {
            e[a] = num_list[b]*2;
        }
         return e;
    }
}