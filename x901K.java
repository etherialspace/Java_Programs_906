interface Printable {
    void print();
}

interface Showable {
    void show();
}

class X901K implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        X901K obj = new X901K();
        obj.print();
        obj.show();
    }
}