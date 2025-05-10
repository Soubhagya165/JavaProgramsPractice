class Student {
    String name;
    int age;

    public Student (String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name = '"+name+"', age = "+age+"}";
    }
}

public class ToStringmethod {
    public static void main(String[] args) {
        Student obj = new Student("Soubhagya", 22);
        System.out.println(obj);
    }
}
