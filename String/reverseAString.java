package String;

public class reverseAString {
    public static void main(String[] args) {
        reverse1("ABCDE");
        reverse2("ABCDE");
    }
    public static void reverse1(String str){
        int n=str.length();
        String ans="";
        for(int i=0;i<n;i++){
            ans=str.charAt(i)+ans;
        }
        System.out.println(ans);
    }
    public static void reverse2(String str){
        StringBuilder ans=new StringBuilder(str);
        int n=ans.length();
        for(int i=0;i<n/2;i++){
            char firstChar=ans.charAt(i);
            char lastChar= ans.charAt(n-1-i);
            ans.setCharAt(i,lastChar);
            ans.setCharAt(n-1-i,firstChar);

        }
        System.out.println(ans.toString());
    }
}
