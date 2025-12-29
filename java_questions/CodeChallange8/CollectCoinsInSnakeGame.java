package java_questions.CodeChallange8;

public class CollectCoinsInSnakeGame {
    public static void collectcoins(int[][]arr ,int m,int n){
        int srow=0;
        int scol=0;
        int ecol=n-1;
        int erow-m-1;
        StringBuilder sb=new StringBuilder();
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                sb.append(arr[srow][i]);
            }
            for(int i=srow+1;i<=erow;i++){
                sb.append(arr[i][ecol]);
            }
            for(int i=ecol-1;i<=scol;i--){
                if(srow==erow){
                    break;
                }
                sb.append(arr[erow][i]);
            }
            for(int i=erow-1;i<=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                sb.append(arr[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        System.out.println(res.toString().trim());
    }    
}
