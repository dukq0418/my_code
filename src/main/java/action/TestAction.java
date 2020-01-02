package action;

import com.opensymphony.xwork2.ActionSupport;

//ActionSupport 这个类不仅实现了Action这个接口，还对其进行了扩展
//当继承了这个类之后，我们可以写一些属于自己的方法，比如 登录
public class TestAction extends ActionSupport {
    private String username;
    private String password;


    //在 struts2 中所有的返回值类型都是 String 类型的
    public String login(){
        System.out.println("login");
        return SUCCESS;
    }

    public String regist(){
        System.out.println("regist");
        return SUCCESS;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
