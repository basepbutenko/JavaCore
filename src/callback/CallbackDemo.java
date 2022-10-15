package callback;

public class CallbackDemo {

    public static void main(String[] args) {

        Job job = new Job("Job1");
        System.out.println("MAIN job start");
        job.doJob();
        job.setCallBack(new JobCallBack() {
            @Override
            public void onJobDone(boolean result) {
                System.out.println("CALLBACK job done: result: " + result);

            }
        });
        System.out.println("MAIN job after start");

        Job job2 = new Job("Job2");
        System.out.println("MAIN job2 start");
        job2.doJob();
        System.out.println("MAIN job2 after start");

    }
}
