package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class VerifyingAccessProcess {
    /*
    This class provides with functionality checking and creating process which other classes are responsible for.
     */
    public static void main(String[] args) {
        
        Person per = new Person("Ostap","student123");
        FileProxyAccount folderProxy=new FileProxyAccount(per);
        System.out.println("USER AUTHORIZED");
        folderProxy.editDocument();
        System.out.println();
        Person perWrong=new Person("stranger","want_to_steal_info_123");
        FileProxyAccount folderProxyWrong=new FileProxyAccount(perWrong);
        System.out.println("USER NOT AUTHORIZED");
        folderProxyWrong.editDocument();
    }

}
