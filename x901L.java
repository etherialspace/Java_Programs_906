// Encapsulation in Java is the process of wrapping code and data together into a single unit.
// We can use getter and setter methods to get and set data in it.

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TestEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("vijay");
        System.out.println(s.getName());
    }
}