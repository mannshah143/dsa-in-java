// create a package
package data;

class Modifier {
    // public --> anyone inside and outside the package can have access
    public String name1;

    // default --> anyone inside the package can have access
    String name2;

    // protected --> anyone inside the package and subclasses outside the package can have access
    protected String name3;

    // private --> no one outside the class can access
    private String name4;

    // getters and setters --> to access private functions outside the class
    public String getName() {
        return this.name4;
    }
    public void setName(String name) {
        this.name4 = name;
    }
}

// class to which the package belongs
public class Pack {
    public static void main(String args[]) {
        Modifier m1 = new Modifier();
        m1.name1 = "public"; // accessible

        Modifier m2 = new Modifier();
        m2.name2 = "default"; // accessible

        Modifier m3 = new Modifier();
        m3.name3 = "protected"; // accessible

        Modifier m4 = new Modifier();
        // m4.name4 = "private"; --> not accessible
        m4.setName("marshall");
        System.out.println(m4.getName());
    }
    public void print() {
        System.out.println("Hello World");
    }
}