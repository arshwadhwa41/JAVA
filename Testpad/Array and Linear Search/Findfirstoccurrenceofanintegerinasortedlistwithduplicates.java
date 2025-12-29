package Testpad.Array and Linear Search;

public class Findfirstoccurrenceofanintegerinasortedlistwithduplicates {
    
    public static int firstoccur(int arr[], int n, int k) {
        int st = 0;
        int end = n - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == k) {
                ans = mid;
                end = mid - 1;
            } 
            else if (arr[mid] < k) {
                st = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastoccur(int arr[], int n, int k) {
        int st = 0;
        int end = n - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == k) {
                ans = mid;
                st = mid + 1;
            } 
            else if (arr[mid] < k) {
                st = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int f = firstoccur(arr, n, k);
            int l = lastoccur(arr, n, k);

            if (f == -1) {   
                System.out.println(0);
                continue;
            }

            System.out.println(l - f + 1);
        }
    }
}
