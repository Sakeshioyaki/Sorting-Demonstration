package element;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class BoxElement extends Element {
    public BoxElement(float value, int index) {
        super(value, index);

        shape = new StackPane();
        shape.setPrefWidth(Common.WIDTH);
        shape.setPrefHeight(Common.WIDTH);

        rectangle = new Rectangle(Common.WIDTH, Common.WIDTH);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.GOLD);
        rectangle.setStrokeWidth(3);
        rectangle.setArcWidth(5);
        rectangle.setArcHeight(5);

        label = new Label(value + "");
        label.setFont(Font.font(12));
        label.setTextFill(Color.BLANCHEDALMOND);
        shape.getChildren().addAll(rectangle, label);
    }
    @Override
    public void setStateColor(State state) {
        Color color;

        switch (state) {
            case DONE:
                color = Color.CHARTREUSE;
                break;
            case SWAP:
                color = Color.BROWN;
                break;
            case COMPARE:
                color = Color.CORAL;
                break;
            case BUCKET:
                color = Color.CYAN;
                break;
            default:
                color = Color.DODGERBLUE;
                break;
        }

        rectangle.setStroke(color);
    }
}
