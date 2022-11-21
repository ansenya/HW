public class Person {
    protected int  age = 0;
    protected String name = " ";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "("+name + ", " + age+")";
    }

    public Person (String name, int age){
        this.name=name;
        this.age=age;
    }
    public String work(){
        return "None";
    }

}
