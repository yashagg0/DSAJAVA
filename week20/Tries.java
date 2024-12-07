package week20;

import java.util.HashMap;

public class Tries {
    class Node{
        char value;
        boolean isTerminal;
        HashMap<Character, Node> child = new HashMap<>();
    }

    private Node root;
    
    public Tries(){
        Node nn = new Node();
        nn.value = '*';
        root = nn;
    }

    //to insert words in the trie
    public void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch)){
                //move to this child node
                curr = curr.child.get(ch);
            }
            else{
                // create a new node and add it to the map
                Node nn = new Node();
                nn.value = ch;
                curr.child.put(ch, nn);
                curr = nn;
            }
        }
        curr.isTerminal = true;
    }

    //to search word in a trie
    public boolean search(String word){
        Node curr = root;
        for (int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch))
                curr = curr.child.get(ch);
            else
                return false;
        }
        return curr.isTerminal;
    }
}
