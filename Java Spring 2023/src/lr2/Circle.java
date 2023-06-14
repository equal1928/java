package lab2;

public class Circle implements Figures{
    float radius;
    float pi = 3.14F;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    @Override
    public float get_perimetr(){
        return radius*2*pi;
    }
    @Override
    public float get_area(){
        return radius*radius*pi;
    }

    public Circle(float radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.printf("%f",(circle.get_area()));
    }
}
