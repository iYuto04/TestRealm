package com.example.yuto.testrealm;

import io.realm.Realm;

/**
 * Created by yuto on 2017/05/18.
 */

public class HandleCount {

    public void writeDB(){
        System.out.println("wrote");
        Realm realm = Realm.getDefaultInstance();

    }
}
