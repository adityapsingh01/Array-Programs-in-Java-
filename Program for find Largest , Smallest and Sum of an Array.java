public class Practice {
    public static void main(String[] args) {
//        Practice.SumOfArray();
//        Practice.max();
//        Practice.min();

 }

    public static void SumOfArray() {
        int arr[] = {1, 5, 3};

        System.out.println(arr.length);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void max() {
        int arr[] = {23, 45, 12, 10, 58, 99};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void min() {
        int arr[] = {19, 23, 56, 50, 23, 90};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[0]) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }

}
