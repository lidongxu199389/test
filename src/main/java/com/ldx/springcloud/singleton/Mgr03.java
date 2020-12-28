package com.ldx.springcloud.singleton;

/**
 * 静态内部类方式
 * JVM保证线程安全
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private static class Mgr03Holder{//定义一个静态内部类
        private final static Mgr03 INSTANCE = new Mgr03();
    }
    public static Mgr03 getINSTANCE(){
        return Mgr03Holder.INSTANCE;
    }
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            new Thread(()-> System.out.println(Mgr03.getINSTANCE().hashCode())).start();
        }
    }
}
