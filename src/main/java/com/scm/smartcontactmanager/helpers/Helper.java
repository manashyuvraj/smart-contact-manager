package com.scm.smartcontactmanager.helpers;

import java.security.Principal;

public class Helper {

    public static String getEmailLoggedInUser(Principal principal){
        return principal.getName();
    }
}
