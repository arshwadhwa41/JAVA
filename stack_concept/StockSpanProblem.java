package stack_concept;

public class StockSpanProblem {
    public static void main(String[] args) {
        Stack <Integer> st =new Stack();
        int arr[]={100,80,60,70,60,75,85}
        int span[]=new int[arr.length];
        int n=arr.length;
        span[0]=1;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(span[i]+" ");
        }
    }    
}
