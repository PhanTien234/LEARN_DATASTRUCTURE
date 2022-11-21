package implementations;
import interfaces.Display;

import java.util.Objects;

public class Student implements Display {
    private int ID;
    private String name;
    private int age;
    private double score;

    public Student(){

    }
    public Student(int ID){
        this.ID = ID;
    }
    public Student(int ID,String name,int age, double score){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String toString(){
        return "ID :"+ID + " name: "+name + " age: "+ age+ " Score: "+ score;
    }

    @Override
    public void displayInformation() {
        System.out.println("Day la sinh vien so thu tu "+ID +"voi ten la "+name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return ID == student.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

}
