package Random_Practise.GharWaliPractise;

import java.util.HashMap;

public class DAY4
{
    class Node{
        Node next;
        int data;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
	public static Node DeleteGreaterThanX(Node head,int x) {
	    if(head==null){
	        return null;
	    }
	    if(head.data<=x && head.next!=null){
	        head=head.next;
	    }
	    Node curr=head;
	    while(curr!=null && curr.next!=null){
	        if(curr.data=>x){
	            curr.data=curr.next.data;
	        }
	        else{
	            curr=curr.next;
	        }
	    }
	    return head;
	}
	
	public static long minCandies(int[] candies,int k){
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<candies.length;i++){
	        if(candies[i]<min){
	            min=candies[i];
	        }
	    }
	    long maxallow=(long)min+k;
	    long removed=0;
	    for(int i=0;i<candies.length;i++){
	        if(candies[i]>maxallow){
	            removed+=candies[i]-maxallow;
	        }
	    }
	    return removed;
	}
	
	Public static Node middleNode(Node head){
	    Node slow=head;
	    Node fast=head;
	    while(fast!=null && fast.next!=null){
	        slow=slow.next;
	        fast=fast.next.next;
	    }
	    return slow;
	}
	
	public static void Stringfrequency(String exp){
	    HashMap<Character,Integer> map=new HashMap<>();
	    for(int ch:exp.toCharArray()){
	        map.put(ch,map.getOrDefault(ch,0)+1);
	    }
	    map.forEach((key,value){
	        if(value>1){
	            System.out.println("frequency of "+key+" is "+value);
	        }
	    });
	}
	
	public static String Stringrev(String str){
	    StringBuilder sb=new StringBuilder(str);
	    sb.reverse();
	    return sb.toString();
	}
	
	
	public static int DistinctInArray(int[] arr,int k,int n){
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    for(int x: arr){
	        hm.put(arr[x],hm.get(getOrDefault(arr[x],0)+1));
	    }
	    for(int i=0;i<n;i++){
	        int c=0;
	        if(hm.get(arr[i])==1){
	            c++;
	            if(c==k){
	                return arr[i];
	            }
	        }
	    }
	    return 0;
	}
	
	
	
	
	public static String encrypt(String txt,int shift){
	    StringBuilder sb=new StringBuilder();
	    for(char ch:sb.toCharArray()){
	        if(ch>='A' && ch<='Z'){
	            char c=(char)((ch-'A'+shift)%26+'A')
	            sb.append(c)
	        }
	        else if(ch>='a' && ch<='z'){
	            char c=(char)((ch-'a'+shift)%26+'a')
	            sb.append(c)
	        }
	        else{
	            sb.append(ch);
	        }
	    }
	    return sb.toString();
	}
	
	public static String decrypt(String txt,int shift){
	    return encrypt(txt,26-(shift%26));
	}
}