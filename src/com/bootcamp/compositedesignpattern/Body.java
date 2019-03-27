package com.bootcamp.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

class Body implements Root, Node {
    private List<Node> childNodes;

    Body() {
        this.childNodes = new ArrayList<>();
    }

    @Override
    public void add(Node node) {
        this.childNodes.add(node);
    }

    @Override
    public void remove(Node node) {
        this.childNodes.remove(node);
    }

    @Override
    public String refresh() {
        StringBuilder body = new StringBuilder("Body");
        System.out.println(childNodes);
        for (Node childNode : this.childNodes) {
            body.append(childNode.refresh());
        }
        System.out.println("Body refresh!");
        return body.toString();
    }

    @Override
    public String toString() {
        return "Body{" +
                "childNodes=" + childNodes +
                '}';
    }
}
