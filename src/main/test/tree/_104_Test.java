package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _104_Test {
    @Test
    public void should_return_0_given_tree0(){
        _104_二叉树的最大深度 maxDepth = new _104_二叉树的最大深度();
        assertThat(maxDepth.maxDepth1(TreeUtil.tree0())).isEqualTo(0);
        assertThat(maxDepth.maxDepth2(TreeUtil.tree0())).isEqualTo(0);
    }
    @Test
    public void should_return_1_given_tree1(){
        _104_二叉树的最大深度 maxDepth = new _104_二叉树的最大深度();
        assertThat(maxDepth.maxDepth1(TreeUtil.tree1())).isEqualTo(1);
        assertThat(maxDepth.maxDepth2(TreeUtil.tree1())).isEqualTo(1);
    }
    @Test
    public void should_return_4_given_tree5(){
        _104_二叉树的最大深度 maxDepth = new _104_二叉树的最大深度();
        assertThat(maxDepth.maxDepth1(TreeUtil.tree5())).isEqualTo(4);
        assertThat(maxDepth.maxDepth2(TreeUtil.tree5())).isEqualTo(4);
    }

    @Test
    public void should_return_4_given_tree6(){
        _104_二叉树的最大深度 maxDepth = new _104_二叉树的最大深度();
        assertThat(maxDepth.maxDepth1(TreeUtil.tree6())).isEqualTo(4);
        assertThat(maxDepth.maxDepth2(TreeUtil.tree5())).isEqualTo(4);
    }
}
