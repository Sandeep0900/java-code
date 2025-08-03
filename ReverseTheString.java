public class ReverseTheString {
    public static class Data {
        int first = -1;
        int last = -1;
    }

    public static void occuranceOfChar(String s, Data d, char B, int i) {
        if(i == s.length()) {
            return;
        }

        if(d.first == -1 && s.charAt(i) == B) {
            d.first = i;
        }
        if(s.charAt(i) == B) {
            d.last = i;
        }

        occuranceOfChar(s, d, B, i + 1);
    }

    public static void printTheString(String s, int i) {
        if(i == -1) {
            return;
        }
        System.out.print(s.charAt(i) + " ");
        printTheString(s, i - 1);
    }

    public static void main(String[] arr) {
        printTheString("sandeep", "sandeep".length() - 1);
        Data d = new Data();
        occuranceOfChar("sandeep", d, 'e', 0);
        System.out.println("\nIn the given string, 'e' first appears at index " + d.first + " and last at index " + d.last);
    }
}
