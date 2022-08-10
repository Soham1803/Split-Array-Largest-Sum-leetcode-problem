//Awesome problem! 🤘

public class Split_array_largest_sum {

    public static void main(String[] args) {
        int[] arre = {1,2,3,4,5};
        System.out.println(splitArray(arre, 1));
    }

    static int splitArray(int[] nums, int m) {
        int maxAns = 0, minAns = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] > minAns){
                minAns = nums[i];
            }
            maxAns += nums[i];

        }

        int start = minAns;
        int end = maxAns;

        while(start < end){

            int mid = (start + end)/2;
            int check = pieces(nums, mid);

            if (check <= m){
                end = mid;
            }else{
                start = mid + 1;
            }

        }
        return start;

    }

    static int pieces(int[] array, int mid){

        int pieces = 0, i = 0;
        int sum = 0;

        while(i < array.length){

            sum += array[i];
            if(sum > mid){
                pieces++;
                sum = 0;
                i = i-1;
            }
            i++;
        }
        return pieces + 1;

    }

}
