import java.util.*;

class InvalidBackupPathException extends Exception {
}

class BackupTask implements Comparable<BackupTask> {
    String path;
    int pr;

    BackupTask(String path, int pr)
            throws InvalidBackupPathException {

        if (path == null || path.isEmpty())
            throw new InvalidBackupPathException();

        this.path = path;
        this.pr = pr;
    }

    public int compareTo(BackupTask b) {
        return b.pr - this.pr; // high priority first
    }
}

public class BackupScheduler {

    public static void main(String[] args) {

        PriorityQueue<BackupTask> pq = new PriorityQueue<>();

        try {
            pq.add(new BackupTask("/system", 5));
            pq.add(new BackupTask("/docs", 2));
            pq.add(new BackupTask("/images", 3));
        } catch (InvalidBackupPathException e) {
            System.out.println("Invalid backup path");
        }

        while (!pq.isEmpty()) {
            BackupTask t = pq.remove();
            System.out.println("Backing up: " + t.path + " priority:" + t.pr);
        }
    }
}
