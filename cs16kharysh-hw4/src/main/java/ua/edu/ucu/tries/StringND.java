package ua.edu.ucu.tries;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Ostap Kharysh on 05.01.2017.
 */
public class StringND {
    private ArrayList<StringND> arrOfChildren = new ArrayList<StringND>();
    private Character data;
    private int weigth;

    StringND(Character data) {
        this.data = data;
        this.arrOfChildren = new ArrayList<StringND>();
    }

    StringND addChar(char letter, int size) {
        for (StringND anArrOfChildren : arrOfChildren) {
            if (Objects.equals(anArrOfChildren.getData(),
                    letter)) {
                if (anArrOfChildren.getWeigth() != 0) {
                    return anArrOfChildren;
                } else {
                    anArrOfChildren.setWeigth(size);
                    return anArrOfChildren;
                }
            }
        }
        StringND node = new StringND(letter);
        node.setWeigth(size);
        arrOfChildren.add(node);
        return node;

    }

    void dfs(StringND nD,
             String tmpWord, ArrayList<String> arr) {
        if (nD.getWeigth() > 0) {
            arr.add(tmpWord);
        }
        for (int i = 0; i < nD.arrOfChildren.size(); i++) {
            dfs(nD.arrOfChildren.get(i),
                    tmpWord + nD.arrOfChildren.get(i).getData(), arr);
        }
    }

    void dfsPrefix(StringND nD,
                   String tmpWord, ArrayList<String>
                           arr, String prefix) {
        if (nD.getWeigth() > 0 && tmpWord.startsWith(prefix)) {
            arr.add(tmpWord);
        }
        for (int i = 0; i < nD.arrOfChildren.size(); i++) {
            dfsPrefix(nD.arrOfChildren.get(i),
                    tmpWord + nD.arrOfChildren.
                            get(i).getData(), arr, prefix);
        }
    }


    Character getData() {
        return data;
    }

    private int getWeigth() {
        return weigth;
    }

    ArrayList<StringND> getArrOfChildren() {
        return arrOfChildren;
    }

    void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}
