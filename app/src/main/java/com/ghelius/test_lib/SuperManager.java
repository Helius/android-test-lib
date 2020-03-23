package com.ghelius.test_lib;

public class SuperManager {
    static private SuperManager instance = null;

    public SuperManager getInstance() {
        if( instance == null) {
            instance = new SuperManager();
        }
        return instance;
    }

    public String getValue () {
        return "pam-pam";
    }
}
