import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class test {

    @Test
    public void buildTrieAndEncode1(){
        String key = "good morning captain";
        HuffmanTrie t = new HuffmanTrie(key);

        System.out.println(key + ":");
        t.breadthFirst();
        System.out.println();
        t.encode();
    }

    @Test
    public void buildTrieAndEncode2() {
        String key = "bookkeeper";
        HuffmanTrie t = new HuffmanTrie(key);
        System.out.println(key + ":");
        t.breadthFirst();
        System.out.println();
        t.encode();
    }


    @Test
    public void buildTrieAndEncode3() {
        String key = "Data structures";
        HuffmanTrie t = new HuffmanTrie(key);
        System.out.println(key + ":");
        t.breadthFirst();
        System.out.println();
        t.encode();
    }
}