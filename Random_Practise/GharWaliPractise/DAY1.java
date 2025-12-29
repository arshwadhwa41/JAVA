package Random_Practise.GharWaliPractise;

public class DAY1
{
	public static int arrdiff(int[] marr,int[] narr) {
	    Arrays.sort(marr);
	    Arrays.sort(narr);
	    
	    
	    for(int i=0;i<narr.length;i++){
	        if(marr[i]!=narr[i]){
	            return marr[i];
	        }
	    }
	    return marr[marr.length-1];
	}
	
	
	public static String ReturnRepeatedString(String[] str){
	    Set<String> seen=new Set<>();
	    
	    for(int i=0;i<str.length;i++){
	        String item=str[i];
	        if(seen.contains(seen)){
	            return item;
	        }
	        seen.add(item);
	    }
	    return null;
	}
	
	
	
	public static String revChar(String str){
	    Stack<Character> st=new Stack<>();
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        st.push(ch);
	    }
	    StringBuilder sb=new StringBuilder();
	    while(!st.isEmpty()){
	        sb.append(st.pop());
	    }
	    return sb.toString();
	}
	
	
	public static String revWords(String str){
	    String Words[]=str.trim().split("\\s+");
	    int st=0;
	    int end=str.length-1;
	    while(st<end){
	        String t=words[st];
	        words[st]=words[end];
	        words[end]=t;
	        st++;
	        end--;
	    }
	    return String.join(" ",words);
	}
	
	
	public static char findMinIndexLetter(String husbandName,String WifeName){
	    int minindex=Integer.MAX_VALUE;
	    char resultchar='\0';
	    
	    for(int i=0;i<wifeName.length();i++){
	        char c=wifeName.charAt(i);
	        int idx=husbandName.indexOf(c);
	        
	        if(idx!=-1 && idx<minindex){
	            minindex=idx;
	            resultchar=c;
	        }
	    }
	    return resultchar;
	}
}