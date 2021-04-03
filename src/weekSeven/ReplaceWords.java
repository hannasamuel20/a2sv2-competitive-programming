package weekSeven;

import java.util.HashMap;
import java.util.List;

public class ReplaceWords {
    class MyNode{
        HashMap<Character,MyNode> children;
        boolean isEnd;
        public MyNode(){
            this.children = new HashMap<>();
            this.isEnd = false;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        MyNode node = new MyNode();
        String[] sentenceArray = sentence.split(" ");
        String result = "";

        add(dictionary,node);
        change(sentenceArray,node);

        for(String word:sentenceArray) result+=word+" ";

        return result.trim();

    }

    public void add(List<String> dictionary, MyNode node){
        for(String word:dictionary){
            MyNode temp = node;
            for(int i = 0; i<word.length(); i++){
                if(!temp.children.containsKey(word.charAt(i))){
                    temp.children.put(word.charAt(i),new MyNode());
                }
                temp= temp.children.get(word.charAt(i));
                if(i==word.length()-1){
                    temp.isEnd=true;
                }
            }
        }
    }

    public void change(String[] sentence, MyNode node){
        for(int j = 0; j<sentence.length; j++){
            MyNode temp = node;
            String word = sentence[j];
            String newWord = "";
            for(int i = 0; i<word.length(); i++){
                if(temp.children.containsKey(word.charAt(i))){
                    newWord+=word.charAt(i);
                    if(temp.children.get(word.charAt(i)).isEnd){
                        sentence[j] = newWord;
                        break;
                    }
                    temp = temp.children.get(word.charAt(i));
                }
                else{
                    break;
                }
            }
        }
    }
}
