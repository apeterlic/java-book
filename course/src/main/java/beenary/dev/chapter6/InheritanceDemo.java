package beenary.dev.chapter6;

public class InheritanceDemo {

    public static void main(String[] args) {
        Employee employee = new Developer("Beenary", "13232565879", "4", 5000, "Mid", "Java");
        Developer developer = (Developer) employee;

Employee architect = new Architect("Jon Doe", "567809869", "54343", 7000, "Solution Architect");
//Developer developer = (Developer) architect;

    }
}
