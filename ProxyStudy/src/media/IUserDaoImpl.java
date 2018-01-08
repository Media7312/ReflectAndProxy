package media;

import java.util.Date;

public class IUserDaoImpl implements IUserDao{
    @Override
    public int login(String username, String password) {
        boolean LoginCheck = (username.equals("admin")) && (password.equals("123"));
        if(LoginCheck){
            return 1;
        }
        return 0;
    }
}
