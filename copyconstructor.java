
class Student {
    String name;
    int age;
    Student(String c,int a)
    {
        name=c;
        age=a;
    }
    Student(Student s1)
    {
        name=s1.name;
        age=s1.age;
    }
    
    public static void main(String[] args) {
    Student s2=new Student("ram",20);
    Student s3=new Student(s2);
    System.out.println("name:"+s3.name);
     Student s1=new Student(s2);
       System.out.println("name:"+s1.name);
    }
}