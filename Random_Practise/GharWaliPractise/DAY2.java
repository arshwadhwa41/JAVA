import java.util.*;
package Random_Practise.GharWaliPractise;


public class DAY2
{
    
    class Node{
        Node next;
        int data;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    
    public static int ArrayMax(int arr[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    
	
	public static int count(int arr[],int k){
	    int first=fo(arr,k);
	    int last=lo(arr,k);
	    return last-first+1;
	}
	public static int fo(int arr[],int k){
	    int st=0;
	    int ans=-1;
	    int end=arr.length-1;
	    while(st<end){
	        int mid=end-(st-end)/2;
	        if(arr[mid]==k){
	            ans=mid;
	            end=mid-1;
	        }
	        else if(arr[mid]<k){
	            st=mid+1;
	        }
	        else{
	            end=mid-1;
	        }
	    }
	}
	public static int lo(int arr[],int k){
	    int st=0;
	    int ans=-1;
	    int end=arr.length-1;
	    while(st<end){
	        int mid=end-(st-end)/2;
	        if(arr[mid]==k){
	            ans=mid;
	            st=mid+1;
	        }
	        else if(arr[mid]<k){
	            st=mid+1;
	        }
	        else{
	            end=mid-1;
	        }
	    }	    
	}
	
	
	
	public static int majorEle(int arr[]){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<arr.length;i++){
	        int x=arr[i];
	        map.put(num,map.getOrDefault(num,0)+1);
	        if(map.get(num)>arr,length/2){
	            return num;
	        }
	    }
	    return -1;
	}
	
	
	
	
	public static int BeautifulGarden(int arr[],int n){
	    int last=arr[n-1];
	    int first=arr[0];
	    
	    if(last>first){
	        int maxone=Integer.MIN_VALUE;
	        for(int i=0;i<n-2;i++){
	            if(arr[i]>maxone){
	                maxone=arr[i];
	            }
	        }
	        return maxone+last
	    }
	    else{
	        int maxtwo=Integer.MIN_VALUE;
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]>maxtwo){
	                maxtwo=arr[i];
	            }
	        }
	        return first+maxtwo;
	    }
	}
	
	
	
	public static int totalSearchingTime(int books[],int find[]){
	    HashMap <Integer,Integer> map=new HashMap<>();
	    
	    for(int i=0;i<books.length;i++){
	        map.put(books[i],i);
	    }
	    
	    int res=0;
	    
	    for(int num:find){
	        if(map.containsKey(num)){
	            res+=map.get(num);
	        }
	        else{
	            res+=book.length;
	        }
	    }
	    return res;
	}
	
	
	
	public static int balancedString(String s){
	    Stack <Integer> index=new Stack<>();
	    Stack <Character> st=new Stack<>();
	    
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(ch=='('||ch='{'){
	            st.push(ch);
	            index.push(i);
	        }
	        else if(ch=='}'||ch==')'){
	            if(st.isEmpty()){
	                return i;
	            }
	            char top=st.pop();
	            index.pop();
	            if(ch=='}' && top!='{' || ch==')' && top!='('){
	                return i;
	            }
	        }
	    }
	    if(st.isEmpty()){
	       return s.length;
	    }
	    return -1;
	}
	
	
	public static boolean checkListPalindrome(Node head){
	    Node slow=head;
	    Node fast=head;
	    
	    while(fast.next!=null || fast!=null){
	        slow=slow.next;
	        fast=fast.next.next;
	        
	        Node sechalf=rev(slow);
	        Node p1=head;
	        Node p2=sechalf;
	        
	        while(p2!=null){
	            if(p1.data!=p2.data){
	                return false;
	            }
	            p2=p2.next;
	            p1=p1.next;
	        }
	        return true;
	    }
	}
	
	public static Node rev(Node head){
	    Node curr=head;
	    Node prev=null;
	    while(curr!=null){
	        Node nxt=curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=nxt;
	    }
	    return prev;
	}
	
	
	public static String StringCompression(String str){
	    StringBuilder sb=new StringBuilder();
	    int n=str.length();
	    for(int i=0;i<n;i++){
	        char ch=str.charAt(i);
	        int count=1;
	        int j=i+1;
	        while(j<n && str.charAt(j)==ch){
	            count++;
	            j++;
	        }
	        sb.append(ch);
	        if(count>1){
	            sb.append(count);
	        }
	        i=j;
	    }
	    return sb.toString();
	}
	
	
	public static Node DistinctList(Node head){
	    Node prev=null;
	    Node curr=head;
	    HashSet<Integer> hs=new HashSet<>();
	    while(curr!=null){
	        if(hs.contains(curr.data)){
	            prev.next=curr.next;
	        }
	        else{
	            hs.add(curr.data);
	            prev=curr;
	        }
	        curr=curr.next;
	    }
	    return head;
	}
	
	
	
	public static int EnergyRequiredinInsertionSort(int ranks[],int n){
	    int shifts=0;
	    for(int i=0;i<n;i++){
	        int key=ranks[i];
	        int j=i-1;
	        boolean moved=false;
	        while(j>=0 && ranks[j]>key){
	            ranks[j+1]=ranks[j];
	            shifts++;
	            j--;
	            moved=true;
	        }
	        if(moved){
	            ranks[j+1]=key;
	            shifts++;
	        }
	    }
	    return shifts*4;
	}
	
	
	
	class Employee{
        String name;
        Employee sendsReqTo;
        Employee(String name){
            this.name=name;
            this.sendsReqTo=null;
        }
    }
    
    public static Employee specialEmp(Employee first){
        if(first==null){
            return null;
        }
        Employee tmp=first;
        HashSet<Employee> visited=new HashSet<>();
        
        while(tmp.sendsReqTo!=null && !visited.contains(tmp.sendsReqTo)){
            visited.add(tmp);
            tmp=tmp.sendsReqTo;
        }
        return tmp.sendsReqTo;
    }
    
    
    public static removeDuplicatesFromDoublyList(Node head){
        if(head==null){
            return null;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}