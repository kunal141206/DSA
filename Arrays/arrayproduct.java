public class arrayproduct {
    public static int[] productExceptSelf(int[] nums){
        int n  = nums.length;
        int[] answers = new int[n];

        answers[0] = 1;
        for(int i = 1;i<n;i++){
            answers[i] = nums[i-1] * answers[i-1];
        }

        int rightproduct = 1;
        for(int i = n -1;i>=0;i--){
            answers[i] *= rightproduct;
            rightproduct *= nums[i];
        }
            return answers;
    }
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4};
        int[] answers = productExceptSelf(nums);
        for(int i : answers){
            System.out.println(i);
        }
    }
}
