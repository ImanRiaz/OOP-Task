class Person {
    private final String name;  
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        // this.name = newName;  // Uncommenting this line will cause a compilation error
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Name: " + person.getName());

        // person.name = "Bob"; // Error: cannot assign a value to final variable 'name'

        person.changeName("Bob");  
    }
}
