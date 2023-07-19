import java.util.ArrayList;

public class phoneCombination {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;

        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeForch = codes[ch-'0'];
        for (int i = 0; i < codeForch.length(); i++) {
            char chcode = codeForch.charAt(i);
            for(String rstr:rres){
                mres.add(chcode+rstr);
            }
            
        }
        return mres;
    }
    public static void main(String[] args) {
        String str = "573";
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
}
