public class removeDuplicates{
    public static void solution(int idx, String str, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            solution(idx+1, str, newStr, map);
        }else{
            map[currChar-'a']=true;
            solution(idx+1, str, newStr.append(currChar), map);
        }


    }
    public static void main(String[] args) {
    String str = "appnna";
    solution(0, str, new StringBuilder(""), new boolean[26]);

    }
}