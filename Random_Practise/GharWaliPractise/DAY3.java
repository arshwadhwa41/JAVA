package Random_Practise.GharWaliPractise;

import java.util.Scanner;

import Random_Practise.addTwoNumbers;

public class DAY3 {
    public static void cinemabook(){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[r][c]=sc.nextInt();
            }
        }
        int groupSize=sc.nextInt();
        boolean found=false;

        for(int i=0;i<r;i++){
            int start=0;
            int count=0;
            for(int j=0;j<c;j++){
                if(arr[r][c]==0){
                    count++
                    if(count==1){
                        start=j;
                    }
                    if(count==k){
                        System.out.print("seat found at row :"+(i+1)+"and starting column"+(start+1));
                        fount=true;
                        break;
                    }
                }
                else{
                    count=0;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Not Available.");
        }
    }


    public static void HeatWave(){
        Scannersc=new Scanner(System.in);
        int[][] arr=new int[7][4];
        for(int i=0;i<7;i++){
            for(int j=0j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        double maxavg=1;
        int hotindex=0;
        for(int i=0;i<7;i++){
            int sum=0
            for(int j=0;j<4;j++){
                sum=arr[i][j];
            }
            int avg=sum/4.0;
            if(avg>maxavg){
                maxavg=avg;
                hotindex=i;
            }
        }
        System.out.println("Hotest Day:"+days[hotindex]);
    }


    public static void ImagePixel() {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[][] b=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=255-a[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void nextSmall(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int ele=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<curr){
                    ele+=arr[j];
                    break;
                }
            }
            System.out.println(ele+" ");
        }
    }
}
