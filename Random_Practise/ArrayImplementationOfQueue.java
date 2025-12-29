package Random_Practise;

public class ArrayImplementationOfQueue {
    public static class qarr{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[];
        public void add(int item){
            if(r==arr.length-1){
                System.out.println("q is full");
            }
            if(f==-1){
                r=f=0;
                arr[0]=item;
            }
            else{
                arr[r+1]=item;
                r++;
            }
            size++;
        }
        public int remove(){
            if(q.isEmpty()){
                System.out.println("q is full");
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("q is empty.");
            }
            return arr[f];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void size(){
            return size;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("q is empty");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
