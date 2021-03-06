package shapes;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

abstract public class Shape {
    private Color color;
    private final double x;
    private final double y;
    private final double size;

    public Shape(Color color, double x, double y, double size) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public Shape(Shape shape) {
        this.color = shape.color;
        this.x = shape.x;
        this.y = shape.y;
        this.size = shape.size;
    }

    public void draw(GraphicsContext graphicsContext) {}
    public abstract String drawSVG();

    public boolean isInside(double x, double y) {
        return false;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public abstract void setSize(double size);

    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    public abstract Shape copyOf();

}