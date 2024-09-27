public class Letter {
    // instance variables
    private String writer;
    // constructor
    public Letter(String author) { 
        writer = author;
    }
    
    //writeLetter method here:
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + writer);
    }
}

