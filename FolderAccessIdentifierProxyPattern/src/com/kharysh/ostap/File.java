package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class File implements IFile {
    /*
    This is a class which implements interface functionality.
     */
    @Override
    public void editDocument() {
        System.out.println("You are in this file. Editing the secured document ALLOWED.");
    }
}
