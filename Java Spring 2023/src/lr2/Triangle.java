package lab2;

public class Triangle implements Figures {
    float height;
    float base;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }


    @Override
    public float get_area(){
        return (float) (height*base*0.5);
    }
    @Override
    public float get_perimetr(){
        return (base*3);
    }

    public float getHeight() {
        return height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,5);
        System.out.printf("%f",(triangle.get_area()));
    }

}
