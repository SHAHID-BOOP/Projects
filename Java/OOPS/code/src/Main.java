import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

//        Student shahid;

//        System.out.println(Arrays.toString(students));
        Student shahid = new Student();
//        shahid.rno = 23;
        System.out.println(shahid.rno);
        System.out.println(shahid.name);
        System.out.println(shahid.marks);

    }
}
// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;
}