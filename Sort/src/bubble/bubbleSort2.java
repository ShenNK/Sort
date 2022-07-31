package bubble;

/**
 * 提前结束循环
 */
public class bubbleSort2 {
    public static void bubbleSort2(int[] arr){
        boolean signal = true;
        for(int i = 0; i < arr.length-1;i++){
            if(!signal)break;
            signal = false;
            for(int j = 0; j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    signal = false;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

}
