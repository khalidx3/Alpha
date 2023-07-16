public class findSubset {
    public static void subset(String str,String ans, int idx){
        // base
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        //Yes
        subset(str,ans+str.charAt(idx),idx+1);
        //No
        subset(str,ans,idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str,"",0);
    }
}
