package java_questions.CodeChallange8;

public class LinkStack {
    private LinkList first;
    LinkStack{
        first=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public static void push(int dd){
        LinkList newnode=new LinkStack(dd);
        newnode.next=first;
        first=newnode;
    }

    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int x=first.data;
        first=first.next;
        return x;
    }
}
