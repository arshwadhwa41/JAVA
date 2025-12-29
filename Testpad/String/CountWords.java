package Testpad.String;

public class CountWords {
    static int CountWords(String str){
        int count=0;
        boolean inwords=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' ' && !inwords){
                inwords=true;
                count++;
            }
            else if(ch==" "){
                inwords=false;
            }
        }
        return count;
    }
  public static void main(String[] args)
  {
    String t;
    Scanner s=new Scanner(System.in);
    t=s.nextLine();
    System.out.println(Result.CountWords(t));
  } 
}
