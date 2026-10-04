import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        List<String> li = new ArrayList<>();
        
        for(String x : myString.split("x")){
            if(!x.isEmpty()){
                li.add(x);
            }
        }
        
        Collections.sort(li);
        return li.toArray(new String[0]);
        
    }
}