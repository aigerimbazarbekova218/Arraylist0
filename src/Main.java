import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       /* int []array=new int[5];
        array[0]=2;
        array[1]=3;
        array[2]=4;
        array[3]=5;
        array[4]=6;
        //array[5]=7;
        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(2,3,4,5,6));
        arrayList.add(4);
        System.out.println("size before"+ arrayList.size());
        arrayList.add(3);
        System.out.println("size after"+ arrayList.size());*/




        ArrayList<Student> students = new ArrayList<>();
        try {
            students.add(new Student("Aigerim",25));
            students.add(new Student("Bazarbekova", -5));
        } catch (ThatMyException e) {
            e.printStackTrace();
         //   System.out.println(e.getMessage());
        }

          students.forEach(System.out::println);

    }
}