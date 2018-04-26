/**
 * 
 */
package communications.protocol;

import com.google.protobuf.InvalidProtocolBufferException;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author sanketkorgaonkar
 *
 */
public class Transmitter {
	private Producer<String, byte[]>	earthChannel;
	private InputStream					inputStream;
	private Properties					kafkaProperties;
	
	public Transmitter(KafkaShipmentBuilder kafkaShipmentBuilder) {
		/*
		 * Set up Kafka producer
		 */
		try {
			System.out.println(kafkaShipmentBuilder.getPropertyFileLocation());
			inputStream = new FileInputStream(kafkaShipmentBuilder.getPropertyFileLocation());
			kafkaProperties = new Properties();
			kafkaProperties.load(inputStream);
			kafkaProperties.put("sourceTopic", kafkaShipmentBuilder.sourceTopic);
			earthChannel = new Producer<String, byte[]>(new ProducerConfig(kafkaProperties));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Transmitter(Properties comsConfig) {
		kafkaProperties = comsConfig;
		earthChannel = new Producer<String, byte[]>(new ProducerConfig(kafkaProperties));
	}

	public void transmitMessage(byte[] message) throws InterruptedException, InvalidProtocolBufferException {
		for (int i = 0; i < 1; i++) {
			earthChannel.send(new KeyedMessage<String, byte[]>(kafkaProperties.getProperty("destination.topic"), message));
			System.out.println(" Sending canned interrupt messages to " + kafkaProperties.getProperty("destination.topic"));
			Thread.sleep(1500l);
		}
	}

	public void cleanUp() throws IOException {
		this.inputStream.close();
		this.earthChannel.close();
	}

	public static class KafkaShipmentBuilder {
		private String	sourceTopic;
		private String	propertyFileLocation;

		public KafkaShipmentBuilder withPropertyFileAt(String fileLocation) {
			this.propertyFileLocation = fileLocation;
			return this;
		}

		public KafkaShipmentBuilder withSourceTopic(String sourceTopic) {
			this.sourceTopic = sourceTopic;
			return this;
		}

		public KafkaShipmentBuilder build() throws Exception {
			return this;
		}

		public String getPropertyFileLocation() {
			return propertyFileLocation;
		}
	}
}
