package media.Proxy.Test;

import media.IUserDao;
import media.IUserDaoImpl;
import media.Proxy.ProxyIUserDao;

public class MainTest {
    public static void main(String[] args) {
        IUserDao iUserDao = new IUserDaoImpl();
        /**
         *@Description: 静态代理，构造器注入
         *
         */
        iUserDao = new ProxyIUserDao(iUserDao);
        int res = iUserDao.login("admin","123");
        if (res == 1){
            System.out.println("登陆成功！");
        }else {
            System.out.println("登陆失败！");
        }
    }
}
