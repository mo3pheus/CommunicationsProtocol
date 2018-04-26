package communications.protocol;

import java.util.Properties;

public class KafkaConfig {

    public static final Properties getKafkaConfig(String entity) {
        Properties kafkaConfig = new Properties();

        String randomId = Long.toString(System.currentTimeMillis());

        kafkaConfig.put("zookeeper.connect", "localhost:2181");
        kafkaConfig.put("group.id", "space.exploration.mars.rover.curiosity." + randomId);
        kafkaConfig.put("auto.offset.reset", "largest");

        if (entity.equals("Rover")) {
            kafkaConfig.put("source.topic", "earth_to_curiosity_5");
            kafkaConfig.put("destination.topic", "curiosity_to_earth_5");
        } else {
            kafkaConfig.put("destination.topic", "earth_to_curiosity_5");
            kafkaConfig.put("source.topic", "curiosity_to_earth_5");
        }

        kafkaConfig.put("metadata.broker.list", "localhost:9092");
        kafkaConfig.put("bootstrap.servers", "localhost:9092");
        kafkaConfig.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaConfig.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");


        return kafkaConfig;
    }

    public static final Properties getShipByConfig(String transmit) {
        Properties kafkaConfig = new Properties();

        String randomId = Long.toString(System.currentTimeMillis());

        kafkaConfig.put("zookeeper.connect", "localhost:2181");
        kafkaConfig.put("group.id", "shipBob.org.live.traffic" + randomId);
        kafkaConfig.put("auto.offset.reset", "largest");

        if (transmit.equals("transmitter")) {
            kafkaConfig.put("source.topic", "navigation_guidance");
            kafkaConfig.put("destination.topic", "traffic_incident");
        } else {
            kafkaConfig.put("source.topic", "traffic_incident");
            kafkaConfig.put("destination.topic", "navigation_guidance");
        }
        kafkaConfig.put("metadata.broker.list", "localhost:9092");
        kafkaConfig.put("bootstrap.servers", "localhost:9092");
        kafkaConfig.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaConfig.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");

        return kafkaConfig;
    }

    public static final Properties getTSConfig(String transmit) {
        Properties kafkaConfig = new Properties();

        kafkaConfig.put("zookeeper.connect", "localhost:2181");
        kafkaConfig.put("group.id", "traffic.simulator");
        kafkaConfig.put("auto.offset.reset", "largest");

        if (transmit.equals("transmitter")) {
            kafkaConfig.put("source.topic", "image.processing.queue");
            kafkaConfig.put("destination.topic", "image.classification.queue");
        } else {
            kafkaConfig.put("source.topic", "image.classification.queue");
            kafkaConfig.put("destination.topic", "image.processing.queue");
        }
        kafkaConfig.put("metadata.broker.list", "localhost:9092");
        kafkaConfig.put("bootstrap.servers", "localhost:9092");
        kafkaConfig.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaConfig.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");

        return kafkaConfig;
    }

    public static final Properties getConfig(boolean transmit, String groupId, String sourceTopic, String
            destinationTopic) {
        Properties kafkaConfig = new Properties();

        String randomId = Long.toString(System.currentTimeMillis());

        kafkaConfig.put("zookeeper.connect", "localhost:2181");
        kafkaConfig.put("auto.offset.reset", "largest");

        kafkaConfig.put("group.id", groupId + randomId);

        if (transmit) {
            kafkaConfig.put("source.topic", sourceTopic);
            kafkaConfig.put("destination.topic", destinationTopic);
        } else {
            kafkaConfig.put("source.topic", sourceTopic);
            kafkaConfig.put("destination.topic", destinationTopic);
        }
        kafkaConfig.put("metadata.broker.list", "localhost:9092");
        kafkaConfig.put("bootstrap.servers", "localhost:9092");
        kafkaConfig.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaConfig.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");

        return kafkaConfig;
    }
}
