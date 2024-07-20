package String;

public class reverse {
    public static void main(String[] args) {
        String res=reverseWords("The sky is blue");
        System.out.println(res);
    }
    public static String reverseWords(String s) {

        String arr[]=s.split(" ");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){
                continue;
            }
            if(res.length()==0){
                res+=arr[i];
            }
            else{
                res+=" "+arr[i];
            }
        }
        return res;
    }
}
