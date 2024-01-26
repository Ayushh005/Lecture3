package Array;

public class FindUnique {
    public static int Unique(int[] arr) {
//        int n = arr.length;
//        for (int i=0;i<=n;i++) {
//            int j;
//            for (j=0;j<n;j++) {
//                if (i != j) {
//                    if (arr[i]==arr[j]) {
//                        break;
//                    }
//                }
//            }
//            if (j==arr.length) {
//                return arr[i];
//            }
//        }
//        return Integer.MAX_VALUE;
        int res = arr[0];
        for (int i=1;i<arr.length;i++) {
            res=res^arr[i];

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,5,5,6,7,7,};
        Unique(arr);
    }
}
