package com.task6;

import com.task6.module.Shape;
import com.task6.module.Triangle;
import com.task6.module.Circle;
import com.task6.module.Rectangle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView<Shape> listView; // Список фигур
    @FXML
    private Canvas canvas; // Область рисования
    @FXML
    private ColorPicker colorPicker; // Выбор цвета

    private ObservableList<Shape> content; // Коллекция фигур
    private GraphicsContext gc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Создаем экземпляры фигур
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        // Заполняем список
        content = FXCollections.observableArrayList(circle, rectangle, triangle);
        listView.setItems(content);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Получаем GraphicsContext для рисования на Canvas
        gc = canvas.getGraphicsContext2D();
    }

    @FXML
    public void drawShape(MouseEvent mouseEvent) {
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            // Создаем копию фигуры из списка
            Shape shape = (Shape) content.get(index).clone();
            shape.setColor(colorPicker.getValue()); // Устанавливаем выбранный цвет
            shape.draw(gc, mouseEvent.getX(), mouseEvent.getY()); // Рисуем фигуру
        }
    }
}