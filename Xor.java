public class Xor {

    public static String compare(String key, String message) {
        /*
         * String ky = ""; String x = ""; Integer i; Integer j; if (key.length() <
         * message.length()) { i = message.length() / key.length(); j = message.length()
         * % key.length(); } while (i > 0) ky.append(ky, key); ky.append(ky,
         * key.substring(0, j)); System.out.println(ky);
         * 
         * for (int i = 0; i < message.length(); i++) { x.append((char)
         * (message.charAt(i) ^ ky.charAt(i))); String result = x.toString(); } return
         * result;
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++)
            sb.append((char) (message.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();
        return result;
    }
    private String store(String key, String message)

    public static void main(String[] args) {
        
    String key1 = "A";
    String key2 = "FISH";
    String message1 = "hello";
    String message2 =")$--.";
    String message3 = "this is a test";
    String message4 = "f=;l5i:;f(s<#"
    //String mode = (args[0]); 
    String key = (args[1]); 
    String message = (arg[2]);
    
        System.out.println(compare("FISH", " this is a test"));

    }
}