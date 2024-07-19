package String;

public class PrintAllSubString {
    public static void main(String[] args) {
        printSubString("abc");

    }
    public static void printSubString(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print(str.substring(i,j)+" , ");
            }
        }
    }
}
