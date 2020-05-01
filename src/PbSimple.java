import java.net.InetAddress;
import java.time.LocalTime;

public class PbSimple {

    //dummy update 30 Apr 2020
    public static void main(String[] args) {
        int i = 1;
        do
            try {
                PbSimple printArgs = new PbSimple();
                printArgs.heyPrint("Executed: " + i + " Hostname: " + InetAddress.getLocalHost() + " Time: " + LocalTime.now());
                i++;
                Thread.sleep(500); //sleep 1s
            } catch (Exception e) {
                e.printStackTrace();
            }
        while (i < 50);

    }

    public void heyPrint(String a) throws Exception {
        System.out.println(a + ": " + a.length());
    }
}


