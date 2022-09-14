package task3;
   /*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */


public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
//        System.out.println(fuzzySearch("cwhl", "cartwheel"));
//        System.out.println(fuzzySearch("cwhee", "cartwheel"));
//        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
//        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
//        System.out.println(fuzzySearch("lw", "cartwheel"));
    }

    public static boolean fuzzySearch(String shortWord, String longWord) {
        if (shortWord == null || longWord == null) {
            return false;
        }
        int i = 0;
        String[] shortStr = shortWord.split("");
        String[] longStr = longWord.split("");
        for (String s : longStr) {
            if (s.equals(shortStr[i])) i++;
            if (i == shortStr.length) return true;
        }
        return false;
    }

}
