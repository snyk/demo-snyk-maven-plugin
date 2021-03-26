package snyk.demo.utils;

public class StringUtils {

    public void writeStuff(String s) {
        System.out.println(s);
    }

    public static String leftPad(String s, char padChar, int numPadChars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numPadChars; i++) {
            sb.append(padChar);
        }
        sb.append(s);
        return sb.toString();
    }
}
