public class PrefixExtractor{
    public static String getLongestCommonPrefix(String[] words){
        if(words.length == 0) {
            return "";
        }
        String prefix = words[0];
        for(int i = 1; i < words.length; i++){
            while(words[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        System.out.println(getLongestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}