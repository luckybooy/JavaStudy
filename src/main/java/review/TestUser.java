package review;

class InternetUser{
    int id;
    String passwd;
    String email;

    public InternetUser(){}

    public InternetUser(int id){
        this.id = id;
    }

    public InternetUser(int id,String passwd){
        this.id = id;
        this.passwd = passwd;

        //给email字段设置默认值
        email = 4 + "@gameschool.com";
    }

    public InternetUser(int id,String passwd,String email){
        this(id, passwd);
        this.email = email;
    }

    public void print(){
        System.out.println("用户id是:" + id + ",密码是:" +passwd+ ", 邮箱是:" + email);
    }

}

public class TestUser {
    public static void main(String[] args){
        InternetUser it = new InternetUser(4,"mima");
        it.print();

        InternetUser it2 = new InternetUser(5,"888888","xiaoran@gmail.com");
        it2.print();
    }
}
