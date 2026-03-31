package course_registration;

public class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException(String msg) {
        super(msg);
    }
}
