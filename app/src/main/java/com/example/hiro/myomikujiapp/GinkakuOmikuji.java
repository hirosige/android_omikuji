package com.example.hiro.myomikujiapp;

import java.util.Random;

/**
 * Created by hiro on 2017/12/29.
 */

public class GinkakuOmikuji extends Omikuji {
    private String[] omikujiList = {
            "大吉",
            "吉",
            "凶"
    };

    GinkakuOmikuji() {
        super("Ginkaku");
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
