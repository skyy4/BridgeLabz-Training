package course_registration;

public class CourseRegistration implements RegistrationService {
    public void enroll(Student s) throws CourseLimitExceededException {
        s.addCourse();
    }
}
