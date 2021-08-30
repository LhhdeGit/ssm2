package zuoye7jdkdongtaidaili;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LiuLanQiTest {
    @Test
    public void test01(){
        LiuLan liuLan = new LiuLan();
        Conn jdkProxy = (Conn) Proxy.newProxyInstance(liuLan.getClass().getClassLoader(),
                liuLan.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String string =(String) method.invoke(liuLan, args);
                        if(string!=null){
                            string="  vpn可以访问谷歌  true";
                        }
                        return string;
                    }
                }
        );
        String s = jdkProxy.FangWen();
        System.out.println(s);
    }
}
