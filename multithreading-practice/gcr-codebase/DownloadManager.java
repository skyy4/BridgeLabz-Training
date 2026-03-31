import java.util.Random;

class FileThread extends Thread {
    private String f;

    FileThread(String f) {
        this.f = f;
    }

    public void run() {
        Random r = new Random();
        for (int p = 0; p <= 100; p += 25) {
            System.out.println("[" + getName() + "] Downloading " + f + ": " + p + "%");
            try {
                Thread.sleep(200 + r.nextInt(300));
            } catch (InterruptedException e) {
            }
        }
    }
}

public class DownloadManager {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new FileThread("Document.pdf");
        Thread t2 = new FileThread("Image.jpg");
        Thread t3 = new FileThread("Video.mp4");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}
