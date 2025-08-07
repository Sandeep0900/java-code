public class backTracking {
    public static void arreng_the_words(String str, String perm) {
         if(str.length() == 0) {
            System.out.println(perm);
            return;
         }
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            arreng_the_words(newStr, perm+currChar);
        }
    }
    public static void main(String[] arr) {
        String a = "ABC";
        arreng_the_words(a,"");
    }
   
}
