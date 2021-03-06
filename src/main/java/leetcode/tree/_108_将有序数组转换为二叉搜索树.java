package leetcode.tree;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 * <p>
 * Related Topics 树 深度优先搜索
 * <p>
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * <p>
 *
 * @author FuBiaoLiu
 * @since 2020/1/6
 */
public class _108_将有序数组转换为二叉搜索树 {

    /**
     * [l,r]
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : buildBST(nums, 0, nums.length - 1);
    }

    public TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int mid = (end + start) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);
        return root;
    }

    /**
     * [l,r)
     */
    public TreeNode sortedArrayToBST1(int[] nums) {
        return nums == null ? null : buildBST1(nums, 0, nums.length);
    }

    private TreeNode buildBST1(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST1(nums, start, mid);
        root.right = buildBST1(nums, mid + 1, end);
        return root;
    }
}
