package communications.protocol;

import shipBob.live.traffic.TrafficIncidentOuterClass;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class IncidentReportCenter {

    public static void main(String[] args) throws Exception {
        Transmitter transmitter = new Transmitter(KafkaConfig.getShipByConfig("transmitter"));

        for (int i = 0; i < 1000; i++) {
            TrafficIncidentOuterClass.TrafficIncident.Builder tBuilder      = TrafficIncidentOuterClass
                    .TrafficIncident.newBuilder();
            Point                                             incidentPoint = getRandomPoint();
            tBuilder.setXCoordinate((int) incidentPoint.getX());
            tBuilder.setYCoordinate((int) incidentPoint.getY());
            tBuilder.setSeverityScore(-10.0d);
            transmitter.transmitMessage(tBuilder.build().toByteArray());
            Thread.sleep(60000);
        }
    }

    private static Point getRandomPoint() {
        int i = ThreadLocalRandom.current().nextInt(0, 28);
        int j = ThreadLocalRandom.current().nextInt(0, 28);

        return new Point(i * 25, j * 25);
    }
}
