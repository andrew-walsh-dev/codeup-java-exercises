public class Person {
    private String name;

    public static void main(String[] args) {
        Person person = new Person("Andrew");
        person.sayHello();
        person.setName("Jeff");
        person.sayHello();
        System.out.println(person.getName());
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, my name is " + this.name);
    }
}
