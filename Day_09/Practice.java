package Day_09;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age.");
        }
    }

    public int getAge() {
        return age;
    }
}

public class Practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Seeta");
        s1.setAge(21);

        System.out.println("Name : " + s1.getName());
        System.out.println("Age : " + s1.getAge());
    }
}