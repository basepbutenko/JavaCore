package callback;

public class Job {

    private JobCallBack callBack;

    String name;

    public Job(String name) {
        this.name = name;
    }

    void doJob() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(name + " start ");
                    Thread.sleep(5000);
                    if(callBack != null){
                        callBack.onJobDone(true);
                    }
                    System.out.println(name + "sleep end ");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public void setCallBack(JobCallBack callBack) {
        this.callBack = callBack;
    }
}
