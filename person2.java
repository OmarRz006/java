public class person2 {
private String name;
private int age;
public void talk(){
    System.out.println("Hi,my name is:"+name+"and my age is:"+age);
    
}

    public person2() {
    }

    public person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person2{" + "name=" + name + ", age=" + age + '}';
    }

}
