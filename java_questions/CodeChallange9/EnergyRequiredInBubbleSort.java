package java_questions.CodeChallange9;

public class EnergyRequiredInBubbleSort {
    public static int energyRequired(int ranks[],int n){
        int swaps=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ranks[j+1]<ranks[j]){
                    int t=ranks[j];
                    ranks[j]=ranks[j+1];
                    ranks[j+1]=t;
                    swaps++;
                }
            }
        }
        return swaps;
    }
}
