import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {

    public static class Student {
        private String name;
        private String group;
        private int course;
        private List<Double> grades;

        public Student(String name, String group, int course, List<Double> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = grades;
        }

        public String getName() {
            return name;
        }

        public String getGroup() {
            return group;
        }

        public int getCourse() {
            return course;
        }

        public List<Double> getGrades() {
            return grades;
        }

        public double getAverageGrade() {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Group: " + group + ", Course: " + course + ", Grades: " + grades;
        }

        public static void removeLowPerformingStudents(List<Student> students) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                double averageGrade = student.getAverageGrade();
                if (averageGrade < 3) {
                    iterator.remove();
                } else {
                    student.course++;
                }
            }
        }

        public static void printStudents(List<Student> students, int course) {
            System.out.println("Students on course " + course + ":");
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
}
