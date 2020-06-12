package element;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public abstract class Element implements Comparable<Object> {
    private float value;

    private int index;

    Rectangle rectangle;

    Label label;

    Pane shape;


    public Element(float value, int index) {
        this.value = value;
        this.index = index;
    }

    public Pane getShape() {
        return shape;
    }

    public float getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public int compareTo(Object o) {
         if(- value + ((Element)o).value > 0 ) {
        	 return 1;
         }
         return -1;
    }

    abstract public void setStateColor(State state);

    public enum Type {
        COLUMN, BOX
    }

    public enum State {
        COMPARE, SWAP, DONE, BUCKET, DEFAULT
    }
}
