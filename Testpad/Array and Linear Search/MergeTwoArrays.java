package Testpad.Array and Linear Search;

public class MergeTwoArrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        
        int[] arra=new int[s1];
        for(int i=0;i<s1;i++){
            arra[i]=sc.nextInt();
        }
        
        int s2=sc.nextInt();
        
        int[] arrb=new int[s2];
        for(int i=0;i<s2;i++){
            arrb[i]=sc.nextInt();
        }
        
        ArrayList<Integer> arl=new ArrayList<>();
        
        for(int i=0;i<arra.length;i++){
            arl.add(arra[i]);
        }
        
        for(int i=0;i<arrb.length;i++){
            arl.add(arrb[i]);
        }
        
        Collections.sort(arl);
        
        int[] newarr=new int[arl.size()];
        for(int i=0;i<arl.size();i++){
            newarr[i]=arl.get(i);
        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    } 
}
