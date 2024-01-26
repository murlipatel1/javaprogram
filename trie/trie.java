public class trie
{
    static class Node {
        Node[] children;
        boolean isEndOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++)
                children[i] = null;

            isEndOfWord = false;
        }

    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i <word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            if(i ==word.length()-1){
                curr.children[index].isEndOfWord = true;
            }
            curr = curr.children[index];
        }
    }

    public static boolean search(String word){
        Node curr = root;
        for (int i = 0; i <word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                return false;
            }
            if(i ==word.length()-1 && curr.children[index].isEndOfWord == false){
                return curr.children[index].isEndOfWord;
            }
            curr = curr.children[index];
        }
        return true;
    }

    public static boolean wordsBreak(String word){
        if(word.length() == 0){
            return true;
        }
        for (int i = 1; i < word.length(); i++) {
            String firstPart = word.substring(0,i);
            String secPart = word.substring(i);
            if(search(firstPart) && search(secPart)){
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';

            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index]; 
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]= {"the","a","there","answer","any","by","bye","their"};
        String prefix = "th";
        for (int i = 0; i < words.length;i++) {
            insert(words[i]);
        }
        System.out.println(search("there"));
        System.out.println(startWith(prefix));
    }
}
