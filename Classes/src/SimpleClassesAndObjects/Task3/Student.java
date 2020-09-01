package SimpleClassesAndObjects.Task3;

import java.util.ArrayList;

public class Student {
    private String fullName;
    private String groupNum;
    private int[] scores = new int[5];

    public Student(String fullName, String groupNum) {
        this.fullName = fullName;
        this.groupNum = groupNum;
        genRandomScores(this);
    }

    public Student(String fullName, String groupNum, int[] scores) {
        this.fullName = fullName;
        this.groupNum = groupNum;
        this.scores = scores;
    }

    public static void showTheBest(ArrayList<Student> students) {
        for (Student student : students) {
            int countGood = 0;
            for (int score : student.scores
            ) {
                if (score > 8) {
                    countGood++;
                }
            }
            if (countGood >= student.scores.length) {
                System.out.println(student.fullName + " " + student.groupNum);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Fedor V.S.", "1", new int[]{9, 9, 9, 9, 9});
        Student student2 = new Student("Ivan G.V.", "2");
        Student student3 = new Student("Vasiliy A.P.", "3");
        Student student4 = new Student("Oleg D.R.", "3");
        Student student5 = new Student("Kristina A.F.", "2");
        Student student6 = new Student("Maz J.", "1");
        Student student7 = new Student("Nataly G.X.", "4", new int[]{9, 10, 9, 10, 9});
        Student student8 = new Student("Vladimir R.T.", "2");
        Student student9 = new Student("Zoe R.B.", "1");
        Student student10 = new Student("Slender A.F.", "4", new int[]{9, 10, 9, 10, 9});

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        showTheBest(students);
    }

    public void genRandomScores(Student student) {
        for (int i = 0; i < this.scores.length; i++) {
            this.scores[i] = (int) (1 + (Math.random() * 10));
        }
    }

}
