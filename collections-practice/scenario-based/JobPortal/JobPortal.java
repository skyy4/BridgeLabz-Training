import java.util.*;

public class JobPortal {

    public static List<Resume> shortlist(
            List<Resume> list,
            Set<String> req
    ) throws InvalidResumeException {

        if (list == null || list.isEmpty()) {
            throw new InvalidResumeException("Invalid resume list");
        }

        list.sort((a, b) ->
                count(b.skills, req) - count(a.skills, req)
        );

        return list;
    }

    private static int count(Set<String> s, Set<String> r) {
        int c = 0;
        for (String x : s) {
            if (r.contains(x)) c++;
        }
        return c;
    }

    public static void main(String[] args) throws Exception {
        Set<String> req = Set.of("Java", "SQL", "Spring");

        Resume r1 = new Resume("Aman", Set.of("Java", "SQL"));
        Resume r2 = new Resume("Neha", Set.of("Java", "Spring", "SQL"));
        Resume r3 = new Resume("Raj", Set.of("HTML"));

        List<Resume> list = new ArrayList<>(List.of(r1, r2, r3));

        List<Resume> res = shortlist(list, req);

        for (Resume r : res) {
            System.out.println(r.name);
        }
    }
}
