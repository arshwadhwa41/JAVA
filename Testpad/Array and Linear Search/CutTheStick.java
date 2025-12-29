package Testpad.Array and Linear Search;

public class CutTheStick {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void cutSticks(int[] lengths) {
        int n = lengths.length;
        bubbleSort(lengths); // sort first

        System.out.println(n); // first cut includes all sticks

        for (int i = 1; i < n; i++) {
            if (lengths[i] != lengths[i - 1]) {
                System.out.println(n - i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lengths = new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }
        cutSticks(lengths);
        sc.close();
    }
}
