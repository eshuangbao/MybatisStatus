package com.esb;

/**
 * 房东
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 15:31
 **/
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房了。。。");
    }
}
