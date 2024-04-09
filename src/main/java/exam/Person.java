package exam;

public abstract class Person {
    private String name;
    private Size size;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    Person(String name, Size size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public abstract void printInfo();
}
