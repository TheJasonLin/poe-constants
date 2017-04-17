package com.poe.constants;

public enum Rarity {
    NORMAL(0),
    MAGIC(1),
    RARE(2),
    UNIQUE(3),
    GEM(4),
    CURRENCY(5),
    DIVINATION_CARD(6),
    QUEST_ITEM(7),
    PROPHECY(8),
    RELIC(9);

    public int code;

    Rarity(int code) {
        this.code = code;
    }
}
