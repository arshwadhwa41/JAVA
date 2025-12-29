package Testpad.Binary Search;

public class FindAllPairsWithSumK {
    static int getPairsCount(int arr[], int n, int k) {
        
        Arrays.sort(arr);
        
        int st = 0;
        int end = n - 1;
        long count = 0;

        while (st < end) {
            int sum = arr[st] + arr[end];

            if (sum == k) {

                // Case 1: both numbers are same
                if (arr[st] == arr[end]) {
                    long freq = end - st + 1;
                    count += freq * (freq - 1) / 2;
                    break;
                }

                // Case 2: count duplicates on left and right
                int leftVal = arr[st];
                int rightVal = arr[end];
                long leftCount = 0, rightCount = 0;

                while (st < end && arr[st] == leftVal) {
                    leftCount++;
                    st++;
                }

                while (end >= st && arr[end] == rightVal) {
                    rightCount++;
                    end--;
                }

                count += leftCount * rightCount;
            }
            else if (sum < k) {
                st++;
            }
            else {
                end--;
            }
        }

        return (int) count;
    }
}
