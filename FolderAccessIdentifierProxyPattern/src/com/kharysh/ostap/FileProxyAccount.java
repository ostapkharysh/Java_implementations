package com.kharysh.ostap;


/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class FileProxyAccount implements IFile {
    /*
    This is a class which implements interface functionality.
    */
    File file;
    Person per;

    public FileProxyAccount(Person per){
        this.per = per;
    }

    @Override
    public void editDocument() {
        if(per.getUserName().equalsIgnoreCase("ostap") && per.getPassword().equalsIgnoreCase("student123")){
            file = new File();
            file.editDocument();
        }
        else {
            System.out.println("ERROR. ATTENTION! You do not have the access to this file.");
        }

    }
}
