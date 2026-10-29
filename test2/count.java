class Result {
    static void countAndPrint(int[] arr, int n) {
        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(even);
        System.out.println(odd);
    }
}