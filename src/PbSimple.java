import java.net.InetAddress;
import java.time.LocalTime;

public class PbSimple {

    public static void main(String[] args) {
        int i = 1;
        do
            try {
                PbSimple printArgs = new PbSimple();
                printArgs.heyPrint("Executed: " + i + " Hostname: " + InetAddress.getLocalHost().getHostName() + " Time: " + LocalTime.now());
                i++;
                Thread.sleep(2000); //sleep 2s
            } catch (Exception e) {
                e.printStackTrace();
            }
        while (i < 150);

    }

    public void heyPrint(String a) throws Exception {
        System.out.println(a + ": " + a.length());
    }
}


