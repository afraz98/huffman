import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class test {

    @Test
    public void nodeString(){
        Node n = new Node('p', 2);
        assertEquals("(p,2)", n.toString());
        assertFalse("(p,3)".equals(n.toString()));
        System.out.println(n.toString());
    }

    @Test
    public void traversal(){
        String key = "good morning captain";
        HuffmanTrie t = new HuffmanTrie(key);
        ArrayList<Node> ns = t.getChar();

        for(Node n : ns){
            System.out.println(n.toString());
        }
    }

    @Test
    public void buildTrie(){
        String key = "good morning captain";
        HuffmanTrie t = new HuffmanTrie(key);

        t.buildTrie();
        t.breadthFirst();
    }
}
