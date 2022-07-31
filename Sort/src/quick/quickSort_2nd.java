package quick;
/*
双指针法
 */
public class quickSort_2nd {
    public static void quickSort_2nd(int[] arr,int start,int end){
        //递归结束条件
        if(start == end || start == end+1)return;
        //中间值，分区的位置
        int middle = partiton(arr,start,end);
        //left
        quickSort_2nd(arr,start,middle-1);
        //right
        quickSort_2nd(arr,middle+1,end);

    }

    public static int partiton(int[] arr,int start,int end){
        int pivot = arr[start];
        //左指针
        int left = start+1;
        //右指针
        int right = end;
        while(left < right){
            //从开始位置找到一个大于pivot的数
            if(left < right && arr[left] <= pivot) left++;
            //从末尾位置找到一个小于pivot的数
            if(left < right && pivot <= arr[right]) right++;
            //比较左右指针的位置
            if(left < right){
                exchange(arr,left,right);
                left++;
                right--;
            }
        }
        //如果left和right相等，单独比较pivot和arr[right]
        if(left == right && arr[right] > pivot) right--;
        exchange(arr,start,right);
        return right;
    }

    public static void exchange(int[] arr,int left,int rigth){
        //异或运算实现交换
        arr[left] ^= arr[rigth];
        arr[rigth] ^= arr[left];
        arr[left] ^= arr[rigth];
    }
}
