import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String>loginInfo=new HashMap<String,String>();
    IDandPassword(){
        loginInfo.put("Hassan1","Hassan");
        loginInfo.put("Hassan","Ha@200780");
        loginInfo.put("Abdo","123456");
    }
    //using this function to access passwords and id from hash map;
 public HashMap getLoginInfo(){
        return loginInfo;
    }
}
