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
}
