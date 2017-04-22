package slavik.sendbox.pr_algorithms_SSU.prefix_tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Слава on 22.04.2017.
 */

import java.util.*;

public class Trie {
    static class TrieNode {
        TrieNode parent;
        Map<Character, TrieNode> children = new TreeMap<Character, TrieNode>();
        boolean leaf;
    }

    TrieNode root = new TrieNode();

    public void put(String s) {
        TrieNode v = root;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (!v.children.containsKey(ch)) {
                v.children.put(ch, new TrieNode());
            }
            TrieNode parent = v;
            v = v.children.get(ch);
            v.parent = parent;

        }
        v.leaf = true;
    }

    public boolean find(String s) {
        TrieNode v = root;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (!v.children.containsKey(ch)) {
                return false;
            } else {
                v = v.children.get(ch);
            }
        }
        if(v.leaf) {
            return true;
        }else {
            return  false;
        }

    }

    public boolean delete(String s){
        TrieNode v = root;
        char[] massChars= s.toLowerCase().toCharArray();
        for (char ch : massChars) {
            if (!v.children.containsKey(ch)) {
                return false;
            } else {
                v = v.children.get(ch);
            }
        }
        if(!v.leaf) {
            return false;
        }
        if (!v.children.isEmpty()){
            v.leaf = false;
            return true;
        }else {
            v.leaf = false;
            for (int i = massChars.length - 1; i >= 0; i--) {
                if (!v.leaf && v.children.isEmpty()) {
                    TrieNode parent = v.parent;
                    parent.children.remove(massChars[i]);
                    v = parent;
                }else{
                    break;
                }
            }
        }
        return true;
    }

    static Map<Integer,String> levelSpacesMap = new HashMap<Integer,String>();

    static String getSpace(int level) {
        String result = levelSpacesMap.get(level);
        if (result == null) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<level; i++) {
                sb.append(" ");
            }
            result = sb.toString();
            levelSpacesMap.put(level,result);
        }
        return result;
    }

    public static void printSorted(TrieNode node) {
        printSorted2(node,0);
    }

    private static void printSorted2(TrieNode node, int level) {
        for (Character ch : node.children.keySet()) {
            System.out.println(getSpace(level)+ch);
            printSorted2(node.children.get(ch), level+1);
        }
        if (node.leaf) {
            System.out.println();
        }
    }

    // Usage example
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.put("hello");
        trie.put("house");
        trie.put("hell");
        trie.put("world");
        trie.delete("hello");

        System.out.println(trie.find("hello"));
        System.out.println(trie.find("hell"));
        printSorted(trie.root);
    }
}
