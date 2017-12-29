package com.example.hiro.myomikujiapp;

import java.util.HashMap;

public class OmikujiFactory {
    private HashMap<String, Omikuji> omikujiStore;

    public OmikujiFactory() {
        omikujiStore = new HashMap<String, Omikuji>();
        omikujiStore.put("Ginkaku", new GinkakuOmikuji());
        omikujiStore.put("Kinkaku", new KinkakuOmikuji());
        omikujiStore.put("Kiyomizu", new KiyomizuOmikuji());
    }

    public Omikuji create(String key) {
        return omikujiStore.get(key);
    }
}
