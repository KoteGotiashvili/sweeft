public class SingleNumber {
    public static void main(String[] args) {
        //first sort
        //then find
        int[] nums={-1,-1,-5,-5,6,6,9,9,1,1,5,8,8};
        System.out.println(singleNumber(nums));

    }

    static int singleNumber(int[] nums){
        quickSort(nums,0,nums.length-1);
        for (int i = 0; i <nums.length ; i++) {
           //2,2,4,4,7,7,8,8,9,10,10
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                return nums[i];
            }
        }

        return -1;
    }
    public static void quickSort(int[] array, int start, int end) {

        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array,i,end);

        return i;
    }
    private static void swap(int[] numbers, int index1, int index2) {
        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }

}
