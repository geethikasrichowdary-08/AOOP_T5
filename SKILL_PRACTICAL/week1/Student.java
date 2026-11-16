class Student {
    int studentId;
    String name;
    int age;

    void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = 101;
        s1.name = "Geethika";
        s1.age = 19;

        Student s2 = new Student();
        s2.studentId = 102;
        s2.name = "Siri";
        s2.age = 20;

        Student s3 = new Student();
        s3.studentId = 103;
        s3.name = "Manya";
        s3.age = 19;

        s1.display();
        s2.display();
        s3.display();
    }
}