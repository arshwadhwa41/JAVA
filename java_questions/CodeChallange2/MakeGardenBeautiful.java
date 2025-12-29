package java_questions.CodeChallange2;

public class MakeGardenBeautiful {
    public int Beautiful(int[] arr,int n){
        int last=arr[n-1];
        int first=arr[0];
        if(last>first){
            int maxone=Integer.MIN_VALUE;
            for(int i=0;i<n-2;i++){
                if(arr[i]>maxone){
                    maxone=arr[i];
                }
            }
            return last+maxone;
        }
        else{
            int max2=Integer.MIN_VALUE;
            for(int i=1;i<n-1;i++){
                if(arr[i]>max2){
                    max2=arr[i];
                }
            }
            return first+max2;
        }   
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7};
        int n=arr.length;
        int res=obj.Beautiful(arr,n);
        System.out.println("For making the garden beautiful the arrangment for corner plant height sum is : "+ res);
    }    
}
