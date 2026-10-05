
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        
        
         String a = myStr.replace("b", "a");
         String b = a.replace("c", "a");
        
        String[] result = b.split("a");
        
        List<String> li = new ArrayList<>();
        
        for(int i = 0; i < result.length; i++){
            if(!result[i].isEmpty()){
                li.add(result[i]);
            }
        }
        
        if(li.isEmpty()){
            li.add("EMPTY");
        }
        
        return li.toArray(new String[0]);
        

    }
}