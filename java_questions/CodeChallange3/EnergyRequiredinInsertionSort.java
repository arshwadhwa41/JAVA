package java_questions.CodeChallange3;

public class EnergyRequiredinInsertionSort {
    static int EnergyRequired(int ranks[],int n){
        int shifts=0;
        for(int i=1;i<n;i++){
            int key=ranks[i];
            int j=i-1;
            boolean moved=false;
            while(j>=0 && ranks[j]>key){
                ranks[j+1]=ranks[j];
                shifts++;
                moved=true;
                j--;
            }
            if(moved){
                ranks[j+1]=key;
                shifts++;
            }
        }
        return shifts*4;
    }
}
