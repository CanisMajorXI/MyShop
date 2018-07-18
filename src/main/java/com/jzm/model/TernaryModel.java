package com.jzm.model;

public class TernaryModel <L,M,N> {
    private L attr1;
    private M attr2;
    private N attr3;

    public TernaryModel(L attr1, M attr2, N attr3) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }

    public L getAttr1() {
        return attr1;
    }

    public void setAttr1(L attr1) {
        this.attr1 = attr1;
    }

    public M getAttr2() {
        return attr2;
    }

    public void setAttr2(M attr2) {
        this.attr2 = attr2;
    }

    public N getAttr3() {
        return attr3;
    }

    public void setAttr3(N attr3) {
        this.attr3 = attr3;
    }
}

