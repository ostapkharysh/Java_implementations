
package ua.edu.ucu.autocomplete;

import org.junit.Before;
import org.junit.Test;
import ua.edu.ucu.tries.RWayTrie;
import ua.edu.ucu.tries.Tuple;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Andrii_Rodionov
 */
public class PrefixMatchesITTest {

    private PrefixMatches pm;
    private RWayTrie rw;

    @Before
    public void init() {
        pm = new PrefixMatches(new RWayTrie());
        pm.load("abc", "abce", "abcd", "abcde", "abcdef", "d", "you");
        String[] words = {"abc", "abce", "abcd", "abcde", "abcdef", "dodo", "you"};
        rw = new RWayTrie();
        for(String word : words){
            rw.add(new Tuple(word, word.length()));
        }
    }

    @Test
    public void testWordsWithPrefix_String() {
        String pref = "ab";

        Iterable<String> result = pm.wordsWithPrefix(pref);

        String[] expResult = {"abc", "abce", "abcd", "abcde", "abcdef"};

        assertThat(result, containsInAnyOrder(expResult));
    }

    @Test
    public void testWordsWithPrefix_String_and_K() {
        String pref = "abc";
        int k = 3;

        Iterable<String> result = pm.wordsWithPrefix(pref, k);

        String[] expResult = {"abc", "abce", "abcd", "abcde"};
        assertThat(result, containsInAnyOrder(expResult));
    }

    @Test
    public void TestSize() {
        int res = pm.size();
        int expRes = 6;
        assertEquals(expRes, res);
    }

    @Test
    public void testContains() {
        boolean res = pm.contains("abc");
        boolean expRes = true;
        assertEquals(res, expRes);
    }

    @Test
    public void testNotContains() {
        boolean res = pm.contains("kljh");
        boolean expRes = false;
        assertEquals(res, expRes);
    }

    @Test
    public void testDelete() {
        boolean res = pm.delete("abcdef");
        boolean expRes = true;
        assertEquals(res, expRes);
    }

    @Test
    public void testNotDelete() {
        boolean res = pm.delete("jklo");
        boolean expRes = false;
        assertEquals(res, expRes);
    }

    @Test
    public void testWordsWithSmallPrefixString() {
        String pref = "a";
        Iterable<String> result = pm.wordsWithPrefix(pref);
        assertEquals(result, null);
    }
    @Test
    public void testWords() {
        Iterable<String> result = rw.words();
        String[] expResult = {"abc", "abce", "abcd", "abcde", "abcdef", "you", "dodo"};
        assertThat(result, containsInAnyOrder(expResult));
    }





}

