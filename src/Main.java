import com.Manager.Beans.UserInfo;
import com.tools.DataManager;
import com.tools.UserInfoManager;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(DataManager.getInstance());
        UserInfo userInfo = new UserInfo();
        userInfo.setPhone("18863014572");
        userInfo.setPassWord("zhongjie");
        userInfo.setNickName("zhangsan");
        userInfo.setRegion("+86");
        UserInfoManager.registerUserInfo(userInfo);


    }
}



