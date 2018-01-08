package media.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Media7312
 * @Description: 动态代理
 * @Date: Created in 21:57 2018/1/7
 */
public class ProxyStudy2 implements InvocationHandler{
    private Object target;

    public ProxyStudy2() {
        super();
    }

    public ProxyStudy2(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"start");

        Object res = null;
        switch ( method.getName() ){
            case "login":
                System.out.println("login()方法执行模块");
                res = method.invoke(target,args);
                break;
            case "add":
                break;
            default:
                break;
        }


        System.out.println(method.getName()+"end");
        return res;
    }
}
