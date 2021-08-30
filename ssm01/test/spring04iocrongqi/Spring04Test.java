package spring04iocrongqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/*
* 容器的由来：根据刚刚的工厂模式得出，一个项目中有大量的对象
* 那么大量的对象需要管理，如果管理方便，使用容器，把对象统一处理
*
* Spring中的容器IOC
* IOC有个思想：控制反转  什么叫控制，我控制了你，你控制了我，我如何才能算控制你，你的出生，使用，死亡都归我管
* 什么叫做反转：事情本来由A控制，现在变为B控制，
* 反转：控制的主体  改变了，
* 容器是负责控制反转的
* */
public class Spring04Test {
    //传统的创建对象的3中方式  传统的对象
    // 没有容器的统一管理
    @Test
    public void test01(){
        //因为我们说spring容器使管理对象
        //传统的创建对象有3中方式

        //第一种：new关键字
        Date date = new Date();  //1、创建对象方法
        System.out.println("date = " + date);
        System.out.println("=================== 分隔符=====");

        //第二种：static静态方法创建，静态工厂创建
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("=================== 分隔符=====");

        //第三种实例工厂的创建
        Date time = calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("以上就是传统创建对象的3种方式");



        //传统的创建对象的缺点：
        //1、控制权在哪里？ 现在在test01的方法中
        //2、对象创建的执行顺序有谁控制？ test01的方法中


        //使用spring如何管理对象（创建，销毁，使用）

    }

    /*
    * spring 容器管理对象，看spring如何创建对象
    * 容器  作用域  生命周期
    * */

    @Test
    public void test02(){
        //1、加载容器的XML
        String xml="spring04iocrongqi/applicationContext.xml";

        //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);

        //如何取得对象
        Date date = ac.getBean("date", Date.class);
        System.out.println("date = " + date);

        //作用域：测试spring默认创建对象是否是单例模式
        Pc pc1=ac.getBean("pc",Pc.class);
        Pc pc2=ac.getBean("pc",Pc.class);
        System.out.println("pc1 = " + pc1);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc1==pc2);   //默认单例模式 ==true 内存地址一样
        //加上scope=“prototype"   ==为false
        ( (ClassPathXmlApplicationContext) ac).close();  //关闭容器

        //如果生命周期中使用原型模式看，那么无法调用对象的摧毁方法
    }
}
