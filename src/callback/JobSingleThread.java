package callback;

public class JobSingleThread {

    private JobCallBack callBack;

    void doJob() {

        try {
            System.out.println("sleep start");
            Thread.sleep(5000);
            System.out.println("sleep end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void setCallBack(JobCallBack callBack) {
        this.callBack = callBack;
    }
}
