package com.ldx.springcloud.singleton;

/**
 * 不仅可以解决线程同步问题，还可以防止返序列化
 * 原因是枚举没有构造方法
 */
public enum Mgr04 {

    INSTANCE;

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            new Thread(()-> System.out.println(Mgr04.INSTANCE.hashCode())).start();
        }
    }

}
