import com.Manager.Beans.UserInfo;
import com.Servlet.demo.RegisterServlet;
import com.reflect.StringPattern.StringPattern;
import com.tools.DataManager;
import com.tools.UserInfoManager;

import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
//        System.out.println(DataManager.getInstance());
//        UserInfo userInfo = new UserInfo();
//        userInfo.setPhone("18863014572");
//        userInfo.setPassWord("zhongjie");
//        userInfo.setNickName("zhangsan");
//        userInfo.setRegion("+86");
//        UserInfoManager.registerUserInfo(userInfo);
//        System.out.println(UserInfoManager.LoginUserInfo("18863014571","zhongjie"));
//

        StringPattern.sortIPAddress();
        try {
            RegisterServlet.receiveRegiserServlet();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




