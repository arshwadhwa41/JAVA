package java_questions.CodeChallange9;

public class EnergyRequiredInInsertionSort {
    public static int energyRequired(int ranks[],int n){
        int shifts=0;
        for(int i=0;i<n;i++){
            boolean moved=false;
            int key=ranks[i];
            int j=i-1;
            while(j>=0 && ranks[j]>key){
                ranks[j+1]=ranks[j];
                j--;
                moved=true;
                shifts++;
                ranks[j+1]=key;
            }
            if(moved){
                shifts++;
            }
        }
        return shifts*4;
    }
}
