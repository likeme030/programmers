import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> a = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                Collections.addAll(a, Arrays.copyOfRange(str_list, 0, i));
                break;
            }else if(str_list[i].equals("r")){
                Collections.addAll(a, Arrays.copyOfRange(str_list, i + 1, str_list.length));
                break;
            }
        }
        
        return a.toArray(new String[0]);
    }
}