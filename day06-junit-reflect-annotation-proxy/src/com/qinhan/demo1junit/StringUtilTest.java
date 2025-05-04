package com.qinhan.demo1junit;


import org.junit.Assert;
import org.junit.Test;

// 测试类：junit单元测试框架，对业务类中的业务方法进行正确性测试。
public class StringUtilTest {
    // 测试方法：必须是公开public，无参，无返回值
    // 测试方法必须加上@Test注解（Junit框架核心步骤）
    @Test
    public void testPrintNumber() {
        // 测试步骤
        StringUtil.printNumber("张三abc");
        // 测试用例
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        int index1 = StringUtil.getMaxIndex("你好");
        int index2 = StringUtil.getMaxIndex("");
        int index3 = StringUtil.getMaxIndex(null);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        // 做断言：判断结果是否与预期结果一致
        Assert.assertEquals("本轮测试失败，业务获取的最大索引有问题",1,index1);
        Assert.assertEquals("本轮测试失败，业务获取的最大索引有问题",-1,index2);
        Assert.assertEquals("本轮测试失败，业务获取的最大索引有问题",-1,index3);
    }
}
