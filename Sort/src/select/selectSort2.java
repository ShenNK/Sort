package select;
//单次交换
public class selectSort2 {
    public static void insertSort(int[] arr){
        int min = 0;
        //遍历I次
        for(int i = 0; i< arr.length;i++){
            min = i;
            //逐一比较
            for(int j = i+1;j< arr.length;j++){
                //交换最小值的下标
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
}
