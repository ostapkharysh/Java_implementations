package ua.edu.ucu.autocomplete;

import ua.edu.ucu.tries.Trie;
import ua.edu.ucu.tries.Tuple;

import java.util.ArrayList;

/**
 * @author andrii
 */
class PrefixMatches {

    private Trie trie;

    PrefixMatches(Trie trie) {
        this.trie = trie;
    }

    int load(String... strings) {
        int count = 0;
        for (String word : strings) {
            String[] str = word.split(" ");
            for (String wrd : str) {
                if (wrd.length() > 2) {
                    Tuple d = new Tuple(wrd, wrd.length());
                    trie.add(d);
                    count++;
                }
            }
        }
        return count;
    }

    public boolean contains(String word) {
        return trie.contains(word);
    }


    Iterable<String> wordsWithPrefix(String pref) {
        if (pref.length() >= 2) {
            return trie.wordsWithPrefix(pref);
        } else {
            return null;
        }
    }

    Iterable<String> wordsWithPrefix(String pref, int k) {
        Iterable<String> withSuchPrefix = trie.wordsWithPrefix(pref);
        ArrayList<String> checked;
        checked = new ArrayList<String>();
        for (String word : withSuchPrefix) {
            if (k + pref.length() > word.length()) {
                checked.add(word);
            }
        }
        return checked;
    }


    public boolean delete(String word) {
        return trie.delete(word);
    }

    public int size() {
        return trie.size();
    }
}
