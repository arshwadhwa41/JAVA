package java_questions.CodeChallange8;

import Queue_Concept.LinkedListImplementation.Node;

public class CopyList {
    public static Node Copy(Node org){
        if(org==null){
            return null;
        }
        Node newhead=new Node(org.data);
        Node oldcurr=org.next;
        Node currnew=newhead;
        while(oldcurr!=null){
            currnew.data=new Node(oldcurr.data);
            currnew=currnew.next;
            oldcurr=oldcurr.next;
        }
        return newhead;
    }
}
