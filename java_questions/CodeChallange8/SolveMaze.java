package java_questions.CodeChallange8;

public class SolveMaze {
    public static int ratMaze(int[][] maze,int size){
        if(maze[0][0]==-1 || maze[size-1][size-1]==-1){
            return 0;
        }
        
        int[][] dp=new int[size][size];
        dp[0][0]=1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(maze[i][j]==-1){
                    dp[i][j]=0;
                }
                else{
                    if(i>0){
                        dp[i][j]+=dp[i-1][j];
                    }
                    if(j>0){
                        dp[i][j]+=dp[i][j-1];
                    }
                }
            }
        }
        return dp[size-1][size-1];
    }
}
