package ua.edu.ucu.tries;

import java.util.ArrayList;

public class RWayTrie implements Trie {
    private StringND root = new StringND(null);
    private int size = 0;

    @Override
    public void add(Tuple t) {
        size++;
        StringND currNd = root;
        root.setWeigth(0);
        for (int i = 0; i < t.getWeight(); i++) {
            if (i == t.getWeight() - 1) {
                currNd = currNd.addChar(t.getTerm().charAt(i), t.getWeight());
            } else {
                currNd = currNd.addChar(t.getTerm().charAt(i), 0);
            }
        }
    }

    @Override
    public boolean contains(String word) {
        int count = 0;
        StringND currNd = root;
        for (int i = 0; i < word.length(); i++) {
            for (int nd = 0; nd < currNd.getArrOfChildren().size(); nd++) {
                if (word.charAt(count)
                        == currNd.getArrOfChildren().get(nd).getData()) {
                    count++;
                    currNd = currNd.getArrOfChildren().get(nd);
                    break;
                }
            }
        }
        return count == word.length();
    }

    @Override
    public boolean delete(String word) {
        int count = 0;
        if (contains(word)) {
            StringND currNd = root;
            while (count != word.length()) {
                for (int nd = 0; nd < currNd.getArrOfChildren().size(); nd++) {
                    if (word.charAt(count)
                            == currNd.getArrOfChildren().get(nd).getData()) {
                        if (count == word.length() - 1) {
                            currNd.setWeigth(0);
                            return true;
                        }
                        count++;
                        currNd = currNd.getArrOfChildren().get(nd);
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Iterable<String> words() {
        ArrayList<String> wordsList = new ArrayList<>();
        root.dfs(root, "", wordsList);
        return wordsList;
    }

    @Override
    public Iterable<String> wordsWithPrefix(String s) {
        ArrayList<String> wordsList = new ArrayList<>();
        root.dfsPrefix(root, "", wordsList, s);
        return wordsList;

    }

    @Override
    public int size() {
        return this.size;
    }


}
