/* Online Java Compiler and Editor */
public class HelloWorld {

    public static void main(String []args) {
        String day="Saturday";
        switch(day) {
        case "Sunday","Tuesday":
            System.out.println("6am");
        case "Saturday":
            System.out.println("5am");
        case "Monday":
            System.out.println("7am");
        }
    }
}