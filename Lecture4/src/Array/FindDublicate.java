package Array;

public class FindDublicate {
    public static void Dublicate(int[] arr){
        for (int i=0;i<(arr.length-1);i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 4};
        System.out.print("Dublicate element is : ");
        Dublicate(arr);
    }
}
