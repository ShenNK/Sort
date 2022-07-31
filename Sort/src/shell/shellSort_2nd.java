package shell;

public class shellSort_2nd {
    public static void shellSort_2nd(int[] arr){
        //分组，gap /= 2
        for(int gap = arr.length / 2;gap > 0;gap /= 2){
            //
            for(int currentIndex = gap;currentIndex < arr.length;currentIndex++){
                int currentNum = arr[currentIndex];
                int preIndex = currentIndex - gap;
                //currentIndex 指向的数如果比前面的数小，则交换
                if(currentIndex > 0 && arr[currentIndex] < arr[preIndex]){
                    arr[preIndex+gap] = arr[preIndex];
                    //继续向前寻找
                    preIndex -= gap;
                }
                //currentNUm找到适合自己的位置
                arr[preIndex+gap] = arr[currentIndex];
            }
        }
    }


}
