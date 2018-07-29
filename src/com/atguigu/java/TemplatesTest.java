package com.atguigu.java;

import com.atguigu.bean.Customer;

public class TemplatesTest {
    public static void main(String[] args) {

    }

    //下面一行用到的类，是在模块里面的，而本文件并不属于模块,直接使用模块里面的类，是不能使用的
    //解决办法就是将光标放到Customer类上面，按alt+enter,从弹出的选项里面选择“Add dependency on module 'Module01'”
    //此时会在Project01.iml文件里面增加一个依赖：<orderEntry type="module" module-name="Module01" />
    //如果我们把Project01.iml文件里面的依赖给删除掉，那么下面一行的Customer就又报错了
    private static final Customer cust=new Customer();
}
