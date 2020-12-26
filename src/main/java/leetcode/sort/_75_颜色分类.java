package leetcode.sort;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 进阶：
 * 你可以不使用代码库中的排序函数来解决这道题吗？
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 * <p>
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * <p>
 * 示例 2：
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 * <p>
 * 示例 3：
 * 输入：nums = [0]
 * 输出：[0]
 * <p>
 * 示例 4：
 * 输入：nums = [1]
 * 输出：[1]
 * <p>
 * 提示：
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] 为 0、1 或 2
 * <p>
 * Related Topics 排序 数组 双指针
 * <p>
 * https://leetcode-cn.com/problems/sort-colors/
 *
 * @author Fubiao.Liu
 * @since 2020/11/30 16:26
 **/
public class _75_颜色分类 {
    public void sortColors(int[] num) {
        int i = 0;
        int l = 0;
        int r = num.length - 1;

        while (i <= r) {
            int val = num[i];
            if (val == 0) {
                swap(num, i++, l++);
            } else if (val == 2) {
                swap(num, i, r--);
            } else {
                i++;
            }
        }

    }

    private void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}