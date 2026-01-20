abstract class CourseType {
    abstract String evaluation();
}

class ExamCourse extends CourseType {
    String evaluation() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    String evaluation() {
        return "Assignment Based";
    }
}

class Course<T extends CourseType> {
    T type;

    Course(T type) {
        this.type = type;
    }
}

class CourseUtil {
    static void displayCourses(Course<? extends CourseType>[] c) {
        for (Course<? extends CourseType> x : c)
            System.out.println(x.type.evaluation());
    }
}

public class CourseTest {
    public static void main(String[] args) {
        Course<ExamCourse>[] arr = new Course[] { new Course<>(new ExamCourse()) };

        CourseUtil.displayCourses(arr);
    }
}
