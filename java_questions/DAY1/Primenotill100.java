package java_questions.DAY1;

public class Primenotill100 {
    public static boolean prm(int num) {
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(prm(i)){
                System.out.println(i);
            }
        }
    }
}
