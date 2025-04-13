class Solution {
    public static void main(String[] args) {
        int[] heights = { 2, 1, 2 };
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int currentArea = 0;
            int j = i;
            while (j < heights.length) {
                if (heights[j] >= heights[i]) {
                    currentArea += heights[i];
                    j++;
                } else {
                    break;
                }
            }
            j = i - 1;
            while (j >= 0) {
                if (heights[j] >= heights[i]) {
                    currentArea += heights[i];
                    j--;
                } else {
                    break;
                }
            }
            area = Math.max(currentArea, area);
        }
        return area;
    }
}