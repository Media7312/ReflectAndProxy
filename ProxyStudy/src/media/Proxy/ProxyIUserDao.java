package media.Proxy;

import media.IUserDao;

import java.util.Date;
/**
 *@Description: 静态代理
 *
 */
public class ProxyIUserDao implements IUserDao{
    private IUserDao iUserDao;
    /**
     *@Description: 构造方法注入
     *
     */
    public ProxyIUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    @Override
    public int login(String username, String password) {
        System.out.println("LOG-----登陆时间" + new Date());
        return iUserDao.login(username,password);
    }
    /**
     *@Description: Setter注入
     *
     */
    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }
}
