public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Main mainObj = new Main();
        mainObj.printArrayElement(arr);
        mainObj.findElementFrequency();
    }

    private void printArrayElement(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
    }

    private void findElementFrequency() {
        int[] arr = {1, 2, 3, 4, -1, 3, 4, 6, 4, 6, 3, 35, 5, -1, 35, 322, 3, 5, 6, 6};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            if (checkIsVisited(arr, i, arr[i]))
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    private boolean checkIsVisited(int[] arr, int uptoIndex, int n) {
        boolean isVisited = false;
        for (int i = 0; i < uptoIndex; i++) {
            if (arr[i] == n) {
                isVisited = true;
                break;
            }
        }
        return isVisited;
    }
}