package java_questions.CodeChallange8;

public class ColumnSum {
    public static void Colsum(int arr[][],int rows,int cols){
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum+=arr[i][j];
            }
            System.out.println("Column : "+(i+1)+" Sum : "+sum);
        }
    }
}
