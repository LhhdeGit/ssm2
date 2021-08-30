package zuoyec6glib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LiuLanQiCglib implements MethodInterceptor{
private LiuLanQia liuLanQia;
    public LiuLanQiCglib(){
       liuLanQia =  new LiuLanQia();
    }

    public LiuLanQia cglibCreator(){
        //1.用字节码的增强器
        Enhancer enhancer = new Enhancer();
        //2.指定一个父类
        enhancer.setSuperclass(LiuLanQia.class);
        //3.调用工厂执行
        enhancer.setCallback(this);
        //4.创建
        return (LiuLanQia) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String string = (String) method.invoke(liuLanQia,objects);
        string=string+"   vpn可以访问谷歌  true";
        return string;
    }
}
