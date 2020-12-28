package com.ldx.springcloud.singleton;

/**
 * 懒汉式
 *在多线程情况下会出现问题，因此需要加锁synchronized  但是效率低下  需要双重检查
 */
public class Mgr02 {
    private static volatile Mgr02 INSTANCE;//JIT优化需要添加volatile   指令重排问题，会在没有初始化的时候就会返回INSTANCE

    private Mgr02(){}

    public static  Mgr02 getINSTANCE(){
        if(INSTANCE  == null){
            synchronized (Mgr02.class){
                if(INSTANCE  == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr02();
                }
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            new Thread(()-> System.out.println(Mgr02.getINSTANCE().hashCode())).start();
        }
    }
}
