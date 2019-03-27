package com.bootcamp.compositedesignpattern;

class BottomPannel implements Node {
    BottomPannel() {
    }

    @Override
    public String refresh() {
        System.out.println("BottomPannel refresh!");
        return "BottomPannel";
    }
}
