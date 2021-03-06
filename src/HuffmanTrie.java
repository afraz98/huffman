import java.util.*;

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
        buildTrie();
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

    public ArrayList<Node> getChar(){
        return ks;
    }

    private void buildTrie(){
        while(ks.size() >= 2){
            Node left = ks.remove(0);
            Node right = ks.remove(0);

            Node parent = new Node();
            parent.left = left;
            parent.right = right;
            parent.count = left.getCount() + right.getCount();
            ks.add(parent);
            Collections.sort(ks);
        }

        root = ks.remove(0);
    }

    public void breadthFirst(){
        Queue<Node> traverse = new LinkedList<Node>();
        traverse.add(root);
        int count = 1, power = 0;
        while(!traverse.isEmpty()){
            Node n = traverse.poll();
            System.out.print(n.toString());

            if(n.left != null){traverse.add(n.left);}
            if(n.right != null){traverse.add(n.right);}
            count++;
        }
    }

    public void encode(){
        encode(root, "");
    }

    private void encode(Node n, String s){
        if(n != null && n.left == null && n.right == null){
            System.out.println(n.character + ": " + s);
            return;
        }

        encode(n.left, s + "0");
        encode(n.right, s+"1");
    }
}
