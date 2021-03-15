package weekSeven;

import java.util.HashMap;

class MyNode{
    HashMap<Character,MyNode> children;
    boolean end;
    public MyNode(){
        this.children = new HashMap<>();
        this.end = false;
    }

}

public class Trie {
    MyNode node;
    /** Initialize your data structure here. */
    public Trie() {
        node = new MyNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        MyNode curr = node;
        for(int i = 0; i<word.length();i++){
            if(curr.children.containsKey(word.charAt(i))){
                curr = curr.children.get((word.charAt(i)));

            }
            else{
                curr.children.put(word.charAt(i),new MyNode());
                curr = curr.children.get(word.charAt(i));
            }

            if(i == word.length()-1){
                curr.end = true;
            }

        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        MyNode curr = node;

        for(int i = 0; i<word.length();i++){
            if(curr.children.containsKey(word.charAt(i))){
                curr = curr.children.get((word.charAt(i)));
                if(i == word.length()-1&&curr.end){
                    return true;
                }
            }else{
                return false;
            }


        }
        return false;


    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        MyNode curr = node;
        for(int i = 0; i<prefix.length();i++){
            if(curr.children.containsKey(prefix.charAt(i))){
                curr = curr.children.get((prefix.charAt(i)));
            }
            else{
                return false;
            }
        }
        return true;

    }
}
