package weekTwo;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.print(isAnagram("",""));

    }

    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> frequency = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        Integer newValue=0;
        for (int i = 0; i <s.length() ; i++) {
            if(frequency.containsKey(s.charAt(i))){
                newValue =frequency.get(s.charAt(i))+1;
                frequency.replace(s.charAt(i),newValue);
            }
            else{
                frequency.put(s.charAt(i), 1);
            }

            if(frequency.containsKey(t.charAt(i))){
                newValue =frequency.get(t.charAt(i))-1;
                frequency.replace(t.charAt(i),newValue);
            }
            else{
                frequency.put(t.charAt(i), -1);
            }

        }
        for (Map.Entry entry:frequency.entrySet()) {
            if(!entry.getValue().equals(0)){
                return false;
            }
        }
        return true;




    }


//    public static boolean isAnagram(String s, String t) {
//        Map<Character,Integer> frequencyS = new HashMap<>();
//        Map<Character,Integer> frequencyT = new HashMap<>();
//        boolean containsAll=false;
//
//        if(s.length()!=t.length()){
//            return false;
//        }
//        if(s.length()==0 && t.length()==0){
//            return true;
//        }
//
//        for (int i = 0; i <s.length() ; i++) {
//            if(frequencyS.containsKey(s.charAt(i))){
//                Integer newValue =frequencyS.get(s.charAt(i))+1;
//                frequencyS.replace(s.charAt(i),newValue);
//            }
//            else{
//                frequencyS.put(s.charAt(i), 1);
//            }
//
//            if(frequencyT.containsKey(t.charAt(i))){
//                Integer newValue =frequencyT.get(t.charAt(i))+1;
//                frequencyT.replace(t.charAt(i),newValue);
//            }
//            else{
//                frequencyT.put(t.charAt(i),1);
//            }
//        }
//        for (Map.Entry element: frequencyS.entrySet()) {
//            char c = (char)element.getKey();
//            if(frequencyT.containsKey(c)){
//                if((int)frequencyS.get(c)==(int)frequencyT.get(c)){
//                    containsAll=true;
//                }
//                else{
//                    containsAll=false;
//                    break;
//                }
//            }
//            else{
//                containsAll=false;
//                break;
//            }
//        }
//        return containsAll;
//
//
//
//    }
}
