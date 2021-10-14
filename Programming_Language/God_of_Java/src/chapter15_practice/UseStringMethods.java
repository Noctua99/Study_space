package chapter15_practice;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods sample = new UseStringMethods();
        String text = "The String class represents character strings";

        sample.printWords(text);
        sample.findStrings(text, "string");
        sample.findAnyCaseString(text, "String");
        sample.countChar(text, 's');
        sample.printContainWords(text, "ss");
    }

    public void printWords(String str) {
        for (String temp : str.split(" ")) {
            System.out.println(temp);
        }
    }

    public void findStrings(String str, String findStr) {
        System.out.println(findStr + " is appeared at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr) {
        str = str.toLowerCase();
        findStr = findStr.toLowerCase();
        System.out.println(findStr + " is appeared at " + str.indexOf(findStr));
    }

    public void countChar(String str, char c) {
        int count = 0;
        for (char temp : str.toCharArray()) {
            if (temp == c) count++;
        }
        System.out.println("char '" + c + "' count is " + count);
    }

    public void printContainWords(String str, String findStr) {
        for (String temp : str.split(" ")) {
            if (temp.contains(findStr)) {
                System.out.println(temp + " contains " + findStr);
            }
        }
    }
}
