package chap08;

public class BFMatch {
    public static void main(String[] args) {
        String s1 = "ABC이지스DEF";
        String s2 = "이지스";

        int idx = bfMatch(s1, s2);
        if (idx == -1) {

        } else {
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += s1.substring(i, i + 1).getBytes().length;
            }
            len += s2.length();
        }
        System.out.println(idx + 1);
    }

    public static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pat.length())
            return pt - pp;
        return -1;
    }
}
