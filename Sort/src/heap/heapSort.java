package heap;

public class heapSort {
    public static void heapSort(int[] arr){
        buildHeap(arr);
    }
    //构建大顶堆
    private static void buildHeap(int[] arr){
        //从最后一个非叶子结点开始调整，最后一个非叶子节点是arr.length/2 -1
        for(int i = arr.length / 2 - 1;i >= 0;i--){
            maxHeapify(arr,i,arr.length);
        }
    }
    //调整堆
    private static void maxHeapify(int[] arr,int i,int heapSize){
        //左叶子节点
        int l = i * 2 + 1;
        //int l = (l << 1)+1
        //右叶子结点
        int r = l + 1;
        //根节点
        int largest = i;
        //若左叶子结点的值大于跟结点，则交换根节点的小标
        if(l < heapSize && arr[l] > arr[largest]){
            largest = l;
        }
        //同上
        if(r < heapSize && arr[r] > arr[largest]){
            largest = r;
        }
        //如果根节点的索引发生改变，交换值的位置
        if(largest != i){
            swap(arr,i,largest);
            //重新调整交换过的堆
            maxHeapify(arr,largest,heapSize);
        }

    }

    private static void swap(int[] arr, int i, int largest) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
    }
}
