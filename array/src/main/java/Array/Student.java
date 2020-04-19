package Array;

public class Student {

    private String name;

    private int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        ArrayGenerics<Student> arrayGenerics = new ArrayGenerics<Student>();
        arrayGenerics.addLast(new Student("小米",70));
        arrayGenerics.addLast(new Student("大米",89));
        arrayGenerics.addLast(new Student("黄米",68));
        arrayGenerics.addLast(new Student("高粱米",100));
        System.out.println(arrayGenerics);
    }
}
