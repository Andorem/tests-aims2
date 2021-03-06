package als.pbt.lab7;

public class Rectangle {
    // DO NOT MODIFY THE INSTANCE VARIABLES
    // begin instance variables
    private int width;
    private int height;
    // end instance variables

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle(" + width + ", " + height + ")";
    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

}
