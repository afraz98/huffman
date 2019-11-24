import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HuffmanTrie {
    private String key;
    private Node root;

    private HashMap<Character, Integer> chars;
    private ArrayList<Node> ks;

    public HuffmanTrie(String key){
        this.key = key;
        chars = new HashMap<Character, Integer>();
        ks = new ArrayList<Node>();

        traverseString();
    }

    //Traverse provided string, breaking characters into occurrences.
    private void traverseString(){
        for(int i = 0; i < key.length(); i++){
            if(!chars.containsKey(key.charAt(i))){
                chars.put(key.charAt(i), 1);
            } else chars.put(key.charAt(i), chars.get(key.charAt(i))+1);
        }

        for(char c : chars.keySet()){
            ks.add(new Node(c, chars.get(c)));
        }
        Collections.sort(ks);
    }

    public ArrayList<Node> getChars (){
        return ks;
    }

    public void buildTrie(){
        while(!ks.isEmpty()){
            Node left = ks.remove(0);
            Node right = ks.remove(0);
            Node parent = new Node();

            parent.left = left;
            parent.right = right;

            parent.count = left.getCount() + right.getCount();
        }
    }
}
