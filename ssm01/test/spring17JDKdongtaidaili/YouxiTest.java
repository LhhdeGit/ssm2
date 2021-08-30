package spring17JDKdongtaidaili;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理 省去了代理对象 代理对象由程序员手写变成了jdk中的类 直接调用即可
 */
public class YouxiTest {
    @Test
    public void test01(){
        Youxi youxi = new Youxi();
      Conn jdkProxy = (Conn) Proxy.newProxyInstance(youxi.getClass().getClassLoader(),
                youxi.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Integer integer = (Integer) method.invoke(youxi, args);
                       if(integer!=null){
                           integer = 60;
                       }

                        return integer;
                    }
                }
        );
        int i = jdkProxy.conNet();
        System.out.println("i = " + i);
    }
}
