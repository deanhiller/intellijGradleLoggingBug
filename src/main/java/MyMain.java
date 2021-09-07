import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMain {

    private static final Logger log = LoggerFactory.getLogger(MyMain.class);

    public static final void main(String[] args) throws InterruptedException {
        log.info("starting");
        new MyMain().start();
    }

    private void start() throws InterruptedException {

        try {
            throw new RuntimeException("test the logging of exceptions");

        } catch (Exception e) {
            log.error("Exception", e);
        }

        Thread.sleep(5000);

        log.info("done with program");
    }

}
