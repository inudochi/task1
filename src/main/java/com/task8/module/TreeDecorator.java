package com.task8.module;

import javafx.scene.layout.Pane;

public class TreeDecorator implements ChristmasTree{
    private ChristmasTree tree;

    public TreeDecorator (ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public void draw(Pane pane) {
        tree.draw(pane);
    }
}
