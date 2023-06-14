package lab2;

public class Person {
    String name;
    int age;
    String sex;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.printf("Информация об объекте %d \t%s \t%s",age,sex,name);
    }
    public Person(String name, int age, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public static void main(String[] args) {
        Person person = new Person("Анна", 23,"Женщина");

        person.printInfo();
    }
}
