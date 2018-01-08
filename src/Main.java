public class Main {
    public static void main(String[] args) {
        //传统：User user=new User（）
        User user = new User();

        //使用反射 :每个类的Class对象 只有一个
        Class cls=user.getClass();

        User user2 = null;
        try {
            user2 =  (User)cls.newInstance();
            //newInstance方法使用时，类必须要有无参构造方法
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
