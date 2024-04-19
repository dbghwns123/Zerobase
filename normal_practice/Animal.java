package normal_practice;

public class Animal {
    String name;
    double weight;
    String classification;

    Animal(String name, double weight, String classification) {
        this.name = name;
        this.weight = weight;
        this.classification = classification;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("classification = " + classification);
    }

    public void eat() {
        System.out.println("냠냠");
    }

    public void sleep() {
        System.out.println("쿨쿨");
    }

    public void walk() {
        System.out.println("터벅터벅");
    }

    public void run() {
        System.out.println("런런!");
    }
}
