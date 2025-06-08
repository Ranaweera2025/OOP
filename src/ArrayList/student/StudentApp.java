package ArrayList.student;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();


        list.add(s1);
        list.add(s2);
        list.add(s3);


        for(Student x:list){
            x.dis();
            System.out.println();
        }
    }
}
