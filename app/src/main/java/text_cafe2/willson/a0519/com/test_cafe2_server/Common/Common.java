package text_cafe2.willson.a0519.com.test_cafe2_server.Common;

import text_cafe2.willson.a0519.com.test_cafe2_server.Model.User;

/**
 * Created by Asus on 27/11/2017.
 */

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code){
        if (code.equals("0"))
            return "Cooking";
        else if (code.equals("1"))
            return "5 more minutes";
        else
            return "Done";
    }
}
