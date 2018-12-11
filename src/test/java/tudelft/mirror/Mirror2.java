package tudelft.mirror;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Mirror2 {
    public String mirrorEnds(String string) {
        String mirror = "";
        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }
        return begin >= end ? string : mirror;
    }

    @Test
    public void even6Char() {
        Assertions.assertEquals("aaaaaa", mirrorEnds("aaaaaa"));
    }

    @Test
    public void evenSingleChar4Times() {
        Assertions.assertEquals("aaaa", mirrorEnds("aaaa"));
    }

    @Test
    public void even7Char() {
        Assertions.assertEquals("aaaaaaa", mirrorEnds("aaaaaaa"));
    }

    @Test
    public void t1() {
        Assertions.assertEquals("ab", mirrorEnds("abXYZba"));
    }

    @Test
    public void t2() {
        Assertions.assertEquals("a", mirrorEnds("abca"));
    }

    @Test
    public void t3() {
        Assertions.assertEquals("aba", mirrorEnds("aba"));
    }

    @Test
    public void uneven1() {
        Assertions.assertEquals("a", mirrorEnds("abcaa"));
    }

    @Test
    public void even4CharsBut2Different() {
        Assertions.assertEquals("abba", mirrorEnds("abba"));
    }

    @Test
    public void unevenSingleChar5Times() {
        Assertions.assertEquals("aaaaa", mirrorEnds("aaaaa"));
    }

    @Test
    public void even8Char() {
        Assertions.assertEquals("aaaaaaaaa", mirrorEnds("aaaaaaaaa"));
    }

    @Test
    public void noMirror() {
        Assertions.assertEquals("", mirrorEnds("abcde"));
    }

    @Test
    public void noMirrorEven() {
        Assertions.assertEquals("", mirrorEnds("abcdef"));
    }

    @Test
    public void mirror4CharsOf10Chars() {
        Assertions.assertEquals("abcde", mirrorEnds("abcdeZTedcba"));
    }
}
