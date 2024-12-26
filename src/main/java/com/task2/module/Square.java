package com.task2.module;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    private double sideLength;

    public Square(double x, double y, double sideLength, double strokeWidth, Color strokeColor) {
        super(x, y, strokeWidth, strokeColor);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.YELLOW);
        gr.setStroke(Color.BLACK);
        gr.setLineWidth(4);

        double startX = getX();
        double startY = getY();

        gr.strokeRect(startX, startY, sideLength, sideLength);
    }

    @Override
    public boolean contains(double x, double y) {
        return x >= getX() && x <= getX() + sideLength &&
                y >= getY() && y <= getY() + sideLength;
    }
}