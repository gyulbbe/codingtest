class Solution {
    private int len;
    private int count;
    public int solution(int[] numbers, int target) {
        len = numbers.length;
        count = 0;
        dfs(numbers, target, 0, 0);
        return count;
    }
    
    private void dfs(int[] numbers, int target, int sum, int index) {
        if (index == len) {
            if (target == sum) {
                count++;
            }
            return;
        }
        
        dfs(numbers, target, sum + numbers[index], index + 1);
        dfs(numbers, target, sum - numbers[index], index + 1);
    }
}