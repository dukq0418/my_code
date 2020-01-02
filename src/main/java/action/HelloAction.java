package action;

import com.opensymphony.xwork2.Action;
import pojo.User;

/**
 * 默认把请求处理的类约定俗成 Action
 * struts2 会提供一个Action接口
 * @author
 */
public class HelloAction implements Action {


    private String name;
    private String message;
    private User user;
    /*
        struts2 在读取请求的参数的时候，走的是set方法，写和前段页面同名的属性，后端就可以接收.
                set 方法就相当于 getParameter()
                在往前段写入参数的时候，走的是get方法.
     */

    @Override
    //execute()用来处理请求的默认方法。
    //servlet中的doGet()和doPost()类似，用来处理请求。
    public String execute() throws Exception {
        /*
        Action接口中提供的五个字段
        用作访问成功
        public static final String SUCCESS = "success";
        用作没有找到访问路径
        public static final String NONE = "none";
        用作访问异常
        public static final String ERROR = "error";
        用作输入异常
        public static final String INPUT = "input";
        用作登录
        public static final String LOGIN = "login";
         */
       // System.out.println("接收到的name是"+name);
        //这句话相当于servlet里的request.setAttribute()
        //message="helloAction";
        System.out.println("hello struts2");
       // System.out.println("对象信息"+user);
        return SUCCESS;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
