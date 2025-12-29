package java_questions.CodeChallange9;

public class EnergyRequiredInSelectionSort {
    public static int energyRequired(int ranks[],int n){
        int swaps=0;
        for(int i=0;i<n;i++){
            int mindindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                int t=arr[mindindex];
                arr[mindindex]=arr[i];
                arr[i]=t;
                swaps++;
            }
        }
        return swaps*3;
    }
}
