public class containerwithmostwater {
    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxarea = -1;
        while(left < right){
            int currentarea = Math.min(height[left],height[right]);
            maxarea = Math.max(maxarea,currentarea*(right-left));
            while(left < right && height[left] <= currentarea){
                left++;
            }
            while(left < right && height[right] <= currentarea){
                right--;
            }
        }
            return maxarea;
    }
}
