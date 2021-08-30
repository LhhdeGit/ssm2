package spring12zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@component  通用注解
//@Controller  //等于@Component 用在controller层
//@Component  //这个注解相当于在xml中的bean标签
//@Service  //等于@Component 用在service层
//@Repository("ren")   //可以起别名，如果不起，那么id就是类名的首字母小写
  @Repository  //等于@Component 用在dao层  但一般不用，因为dao层有xml映射
                //@component  @Controller @Component @Service四个 简称四大注解
 @Scope("prototype") //加上这个就是原型/多例
  @Lazy  //加上这个就是懒加载

  public class Human {
    public Human(){
        System.out.println("人对象诞生了");
        System.out.println("女人对象诞生了");}

        @PostConstruct  //构造器之前的方法 意思就是  生命周期
                        //<bean id="pc" class="spring04iocrongqi.Pc" scope="prototype" init-method="initShow" destroy-method="destroyObj">
        public void initShow(){
            System.out.println("大哭...");

    }
    @PreDestroy //<bean id="pc" class="spring04iocrongqi.Pc" scope="prototype" init-method="initShow" destroy-method="destroyObj">
    public void destroy(){
        System.out.println("死之前的遗嘱...");
    }
}
