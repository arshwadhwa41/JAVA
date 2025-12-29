package Testpad.Stack-1;

public class FindNextGreater {
    static void printNextGreaterElement(int arr[],int n){
    // Write your code here
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<n;i++){
          int nextvalue=-1;
          for(int j=i+1;j<n;j++){
              if(arr[j]>arr[i]){
                  nextvalue=arr[j];
                  break;
              }
          }
          sb.append(nextvalue);
          if(i<n-1){
              sb.append(" ");
          }
      }
      System.out.print(sb.toString());
  }
    public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    Result result = new Result();
    int t = s.nextInt();
    while(t-- > 0){
      int n;
      n = s.nextInt();
      int arr[] = new int[n];
      int i=0;
      for(i=0;i<n;i++)
        arr[i] = s.nextInt();
      result.printNextGreaterElement(arr,n);
      System.out.println();
    }
  }
}
