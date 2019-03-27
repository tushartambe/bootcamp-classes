package com.bootcamp.compositedesignpattern;

class SidePannel implements Node {
    SidePannel() {
    }

    @Override
    public String refresh() {
        System.out.println("SidePannel refresh!");
        return "SidePannel";
    }
}
