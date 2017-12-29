package com.example.hiro.myomikujiapp;

/**
 * Created by hiro on 2017/12/29.
 */

abstract public class Omikuji {
    protected String name;

    Omikuji(String naming) {
        name = naming;
    }

    public abstract String getFortune();
}
