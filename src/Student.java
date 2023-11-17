public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws ThatMyException {
        this.name = name;
        if(age<0){
            throw new ThatMyException("Студенттин жашы он сан менен жазылсын!");
        }
        this.age = age;
    }

    public Student() {
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

    public void setAge(int age)throws Exception{
        if(age<0){
            throw new ThatMyException("Студенттин жашы он сан менен жазылсын!");
        }
        this.age = age;


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
