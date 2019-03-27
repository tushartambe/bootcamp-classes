package com.bootcamp.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Content implements Root, Node {
    private List<Node> childNodes;

    public Content() {
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
        StringBuilder content = new StringBuilder("Content");

        for (Node childNode : this.childNodes) {
            content.append(childNode.refresh());
        }
        System.out.println("Content refresh!");
        return content.toString();
    }
}
