package merge;

/**
 * 相比上个归并算法，这一个的空间复杂度更滴，O（1）
 */
public class mergeSort_2nd {
    public void mergeSort_2nd(int[] arr){
        if(arr.length == 0)return;
        mergeSort_2nd(arr,0, arr.length-1);
    }
    public void mergeSort_2nd(int[] arr,int start,int end ){
        if(start == end)return;
        int middle = (start + end)/2;
        mergeSort_2nd(arr,start,middle);
        mergeSort_2nd(arr,middle+1,end);
        merge(arr,start,end);
    }

    public void merge(int[] arr,int start,int end){
        int end1 = (start + end)/2;
        int start2 = end1 + 1;

        int index1 = start;
        int index2 = start2;
        while(start < end1 && start2 <end){
            if(arr[index1] < index2){
                index1++;
            }else {
                int value = arr[index2];
                int index = index2;
                while(index > index1){
                    arr[index] = arr[index-1];
                    index--;
                }
                arr[index] = value;
                index1++;
                index2++;
                end1++;
            }
        }
    }
}
