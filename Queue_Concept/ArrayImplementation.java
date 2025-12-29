package Queue_Concept;

import Queue_Concept.ArrayImplementation.QArray;

public class ArrayImplementation {
    public static class QArray{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is Full!");
                return;
            }
            if(f==-1){
                r=f=0;
                arr[0]=val;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return(arr[f]);
        }
        public void size(){
            return size;
        }
        public boolean isEmpty(){
            if(size()==0){
               return true; 
            }
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        QArray q=new QArray();
        System.out.println(q.isEmpty());//true
        q.add(1);
        System.out.println(q.isEmpty());//false
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);//[1,2,3,4,5,6]
        q.remove();
        System.out.println(q);//[1,2,3,4,5]
        q.remove();
        System.out.println(q);//[2,3,4,5]
        System.out.println(q.peek());//2
        System.out.println(q.peek());//2
        System.out.println(q.size());//4
    }
}