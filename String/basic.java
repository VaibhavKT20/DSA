package String;


import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
//        String s="vaibhav";
//        System.out.println(s);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word=sc.next();
//        System.out.println(word);
//        System.out.println("Enter a line: ");
//        String line=sc.nextLine();
//        System.out.println(line);

        String s="vaibhav kumaR";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.charAt(0));
//        System.out.println(s.indexOf('i'));
//        System.out.println(s.length());
//        char ch[]=s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }

//        System.out.println("VAIBHAV".compareTo("VAIB"));
//        System.out.println("VAIBHAV".compareTo("VAIBHAV"));
//        System.out.println("VAIB".compareTo("VAIBHAV"));
//
//        System.out.println(       "       vaibhav      " );
//        System.out.println("              vaibhav           ".trim());
//        System.out.println("vaibhav kumar".startsWith("vai"));
//        System.out.println("vaibhav kumar".endsWith("mar")) ;
//        System.out.println("vaibhav".substring(3,5));

//        String myLocation="Hydrabad, Chennai, Bangalore, Delhi, Gurugram";
//        String myLocationList[]=myLocation.split(",");
//        for(int i=0;i<myLocationList.length;i++)
//        {
//            System.out.print(myLocationList[i]);
//        }
        String email1="example1@gmail.com";
        String email2="example2@hotmail.com";
        String answer1[]=email1.split("@");
        String lastPart=answer1[answer1.length-1];
        int dotIndex=lastPart.lastIndexOf(".");
        System.out.println(lastPart.substring(0,dotIndex));
        String answer2[]=email2.split("@");
        String lastPart2=answer2[answer2.length-1];
        int dotIndex2=lastPart2.lastIndexOf(".");
        System.out.println(lastPart2.substring(0,dotIndex2));
    }
}
