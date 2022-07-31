package quick;

public class quickSort {
    public static void quickSort(int[] arr,int start,int end){
        if(start == end || start == end+1)return;
        //分区
        int middle = partiton(arr,start,end);
        //left
        quickSort(arr,start,middle);
        //right
        quickSort(arr,middle+1,end);
    }

    public static int partiton(int[] arr,int start,int end){
        // 取第一个数为基数
        int pivot = arr[start];
        // 从第二个数开始分区
        int left = start + 1;
        // 右边界
        int right = end;
        // left、right 相遇时退出循环
        while (left < right) {
            // 找到第一个大于基数的位置
            while (left < right && arr[left] <= pivot) left++;
            // 交换这两个数，使得左边分区都小于或等于基数，右边分区大于或等于基数
            if (left != right) {
                exchange(arr, left, right);
                right--;
            }
        }
        // 如果 left 和 right 相等，单独比较 arr[right] 和 pivot
        if (left == right && arr[right] > pivot) right--;
        // 将基数和中间数交换
        if (right != start) exchange(arr, start, right);
        // 返回中间值的下标
        return right;

    }

    public static void exchange(int[] arr,int left,int rigth){
        //异或运算实现交换
        arr[left] ^= arr[rigth];
        arr[rigth] ^= arr[left];
        arr[left] ^= arr[rigth];
    }


}
