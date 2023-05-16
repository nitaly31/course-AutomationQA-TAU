package chapter9;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(){
        System.out.println("Constructor predeterminado en persona");
    }
    public Person(String name){
        System.out.println("2do Constructor predeterminado en persona. El nombre es set");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
