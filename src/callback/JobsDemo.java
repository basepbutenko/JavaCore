package callback;

public class JobsDemo {

    public static void main(String[] args) {

        Job job = new Job("Job1");
        System.out.println("MAIN job start");
        job.doJob();
        System.out.println("MAIN job after start");

        Job job2 = new Job("Job2");
        System.out.println("MAIN job2 start");
        job2.doJob();
        System.out.println("MAIN job2 after start");

    }
}
