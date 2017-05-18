package com.example.yuto.testrealm;

import io.realm.RealmObject;

/**
 * Created by yuto on 2017/05/18.
 */

public class SittingTimeDB extends RealmObject{
    private Integer totalTime;

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }
}
