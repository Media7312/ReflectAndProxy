package media.Proxy.Test;

import media.IUserDao;
import media.IUserDaoImpl;
import media.Proxy.ProxyStudy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Media7312
 * @Description: 动态代理
 * @Date: Created in 22:09 2018/1/7
 */
public class DProxy {
    public static void main(String[] args) {
        IUserDao iUserDao = new IUserDaoImpl();
        InvocationHandler h =new ProxyStudy2(iUserDao);
        iUserDao = (IUserDao) Proxy.newProxyInstance(IUserDaoImpl.class.getClassLoader(),new Class[] {IUserDao.class},h);

        int res = iUserDao.login("admin","123");
        if (res == 1){
            System.out.println("登陆成功");
        } else{
            System.out.println("登陆失败");
        }


    }
}
