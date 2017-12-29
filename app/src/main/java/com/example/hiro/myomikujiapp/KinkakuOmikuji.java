package com.example.hiro.myomikujiapp;

import java.util.Random;

/**
 * Created by hiro on 2017/12/29.
 */

public class KinkakuOmikuji extends Omikuji {
    private String[] omikujiList = {
            "大吉",
            "吉",
            "凶",
            "地獄行き"
    };

    KinkakuOmikuji() {
        super("Kinkaku");
    }

    public String toString() {
        return "あなたが今いるのは？ : " + name + " !!";
    }

    public String getFortune() {
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(omikujiList.length);

        return omikujiList[num];
    }
}
