package bubble;

/**
 * 提前结束循环以及，减少每轮冒泡排序的比较次数
 */

public class bubbleSort3 {
    public static void bubbleSort3(int[] arr){
        boolean signal = true;
        int last = arr.length - 1;
        int swapped = -1;
        while (signal){
            signal = false;
            for(int i = 0; i < last;i++ ){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i + 1);
                    signal = true;
                    swapped = i;
                }
            }
            last = swapped;
        }

    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
