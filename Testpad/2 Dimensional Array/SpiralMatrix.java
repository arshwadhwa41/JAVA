package Testpad;

import java.util.*;

public class SpiralMatrix {

    public static ArrayList<Integer> spiral(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int srow = 0, scol = 0;
        int erow = m - 1, ecol = n - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (srow <= erow && scol <= ecol) {

            for (int j = scol; j <= ecol; j++) {
                ans.add(mat[srow][j]);
            }

            for (int i = srow + 1; i <= erow; i++) {
                ans.add(mat[i][ecol]);
            }
            
            for (int k = ecol - 1; k >= scol; k--) {
                if (srow == erow) break;
                ans.add(mat[erow][k]);
            }
            
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (ecol == scol) break;
                ans.add(mat[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> result = spiral(mat);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}






















// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }
    
    
    
    //solve maze
    public static int solveMaze(int maze[][],int size){
        if(maze[0][0]==-1 || maze[size-1][size-1]==-1){
            return 0;
        }
        int[][] dp=new int[size][size];
        dp[0][0]=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(dp[i][j]==-1){
                    dp[i][j]=0;
                }
                else{
                    if(i>0){
                        dp[i][j]+=dp[i-i][j];
                    }
                    if(j>0){
                        dp[i][j]+=dp[i][j-1];
                    }
                }
            }
        }
        return dp[size-1][size-1];
    }
    
    
    //count words
    public staic int count(String str){
        str=str.trim();
        if(str.length()==0){
            return 0;
        }
        String words[]=str.split("\\s+");
        return words.length;
    }
    
    //invalid string
    public static void validString(String str){
        if(Str.length()==0){
            System.out.print("Invalid");
        }
        char first=str.charAt(0);
        if(!Character.isLetter(first)){
            System.out.print("Invalid");
        }
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                System.out.print("Invalid");
                return;
            }
        }
        System.out.print("valid");
    }
    
    
    //implement stack with linkedlist
    class LinkStack{
        private LinkList first;
        public LinkStack{
            first==null
        }
        
        public boolean isEmpty(){
            return (first==null);
        }
        
        public void push(int data){
            Node newnode=new Node(data);
            newnode.next=first;
            newnode=first;
        }
        
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int x=first.data;
            first=first.next;
            return x;
        }
    }
    
    
    //column wise sum
    
    public static void colSum(int arr[][],int row,int col){
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++){
                sum+=arr[i][j];
            }
            system.out.print("col : "+(j+1)+" sum : "+sum);
        }
    }
    
    //Capitailze
    
    public static String Capitalize(String str){
        StringBuilder res=new StringBuilder();
        boolean cap=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                res.append();
                cap=true;
            }
            else{
                if(cap && ch>='a' && ch<='z'){
                    res.append((char)ch-32);
                    cap=false;
                }
                else{
                    res.append(ch);
                    cap=false;
                }
            }
        }
        return res.toString();
    }
}