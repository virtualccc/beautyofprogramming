package Chapter1;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1,4, 7, 1, 8, 5, 9};
        QuickSort sc = new QuickSort();
        int[] arr1 = sc.quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private int[] quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int pindex = partition(arr, left, right);//找分区位置
            quicksort(arr, left, pindex - 1);//左边搜索
            quicksort(arr, pindex + 1, right);//右边搜索
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int base = left;
        int index = base + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[base]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, base, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
