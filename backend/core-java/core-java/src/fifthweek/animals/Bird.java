package fifthweek.animals;

public abstract class Bird {

    private String name;
    private int age;

    public Bird(String name) {

        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String sing();
}
