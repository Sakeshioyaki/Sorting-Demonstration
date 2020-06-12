package element;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class ColumnElement extends Element {
    public ColumnElement(float value, int index) {
        super(value, index);

        shape = new VBox(Common.HEIGHT);
        shape.setPrefWidth(Common.WIDTH);
        shape.setPrefHeight(value * Common.HEIGHT);
        //shape.set

        rectangle = new Rectangle(Common.WIDTH, value * Common.HEIGHT);

        label = new Label(value + "");
        label.setFont(Font.font(12));
        label.setTextFill(Color.AQUAMARINE);

        ((VBox)shape).setAlignment(Pos.BOTTOM_CENTER);
        shape.getChildren().addAll(rectangle, label);
        rectangle.setFill(Color.BURLYWOOD);
        rectangle.setArcHeight(Common.WIDTH/2);
        rectangle.setArcWidth(Common.WIDTH/2);
    }

    @Override
    public void setStateColor(State state) {
        switch (state) {
            case DONE:
                rectangle.setFill(Color.CHARTREUSE);
                break;
            case SWAP:
                rectangle.setFill(Color.BROWN);
                break;
            case COMPARE:
                rectangle.setFill(Color.CORAL);
                break;
            case BUCKET:
                rectangle.setFill(Color.CYAN);
                break;
            default:
                rectangle.setFill(Color.BEIGE);
                break;
        }


    }
}
