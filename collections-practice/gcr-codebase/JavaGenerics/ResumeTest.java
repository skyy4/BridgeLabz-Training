package JavaGenerics;

abstract class JobRole {
    abstract String role();
}

class SoftwareEngineer extends JobRole {
    String role() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    String role() {
        return "Data Scientist";
    }
}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

class ScreeningPipeline {
    static void screen(Resume<? extends JobRole>[] r) {
        for (Resume<? extends JobRole> x : r)
            System.out.println("Screening " + x.role.role());
    }
}

public class ResumeTest {
    public static void main(String[] args) {
        Resume<?>[] r = {
                new Resume<>(new SoftwareEngineer()),
                new Resume<>(new DataScientist())
        };
        ScreeningPipeline.screen(r);
    }
}
