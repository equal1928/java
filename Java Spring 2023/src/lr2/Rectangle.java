package lab2;

public class Rectangle {
    float height;
    float width;

    public float getHeight() {
        return height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float get_area(){
        return height*width;
    }
    public float get_perimetr(){
        return 2*height*width;
    }
    public Rectangle(float width,float height){
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        System.out.printf("%f\n",rectangle.get_area());
        System.out.printf("%f\n",rectangle.get_perimetr());
    }
}