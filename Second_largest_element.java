public class Practice {
    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 10, 58, 99};
        int Largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= Largest) {
                Largest = arr[i];
            }
        }
            int dusra_largest = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > -1 && arr[j] < Largest){
                    dusra_largest = arr[j];
                }
            }
            System.out.println(dusra_largest);
    }
}
