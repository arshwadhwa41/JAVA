package java_questions.CodeChallange9;

public class SwapNodeInDLL {
    public static void swap(int x,int y){
        if(x==y){
            return;
        }
        Node nodex=null;
        Node nodey=null;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x){
                nodex=curr;
            }
            else if(curr.data==y){
                nodey=curr;
            }
            curr=curr.next;
        }
        if(nodex==null || nodey==null){
            return null;
        }
        int t=nodex.data;
        nodex.data=nodey.data;
        nodey.data=t;
    }
}
