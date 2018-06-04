package communications.encryption;

import org.apache.log4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;

import static communications.encryption.KeyPairUtil.*;

public class EncryptionUtil {

    static Logger logger = LoggerFactory.getLogger(EncryptionUtil.class);

    public static void configureLogging(boolean debug) {
        ConsoleAppender consoleAppender = new ConsoleAppender();

        if (!debug) {
            consoleAppender.setThreshold(Level.toLevel(Priority.INFO_INT));
        } else {
            consoleAppender.setThreshold(Level.toLevel(Priority.DEBUG_INT));
        }

        consoleAppender.setLayout(new EnhancedPatternLayout("%-6d [%t] %-5p %40.80c - %m%n"));
        consoleAppender.activateOptions();
        org.apache.log4j.Logger.getRootLogger().addAppender(consoleAppender);
    }

    public static void main(String[] args) {
        configureLogging(false);
        logger.info("Hello this is encryption utility.");
        logger.info("Step 1. Generating the public, private key pair.");

        String privateKeyFile = "src/main/resources/encryptionKeys/privateKey.dat";
        String publicKeyFile  = "src/main/resources/encryptionKeys/publicKey.dat";

        try {
            generateDsaKeys(privateKeyFile, publicKeyFile);
        } catch (NoSuchAlgorithmException e) {
            logger.error("Encountered NoSuchAlgorithm exception", e);
        } catch (IOException e) {
            logger.error("Encountered IOException while generating rsa key pair.", e);
        } catch (NoSuchProviderException e) {
            logger.error("Encountered NoSuchProviderException.", e);
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }

        logger.info("KeyPair generated successfully!");
        logger.info("Step 2. Sign the Data.");
        try {
            Signature       dsa             = Signature.getInstance("SHA1withDSA");
            //dsa.initSign((PrivateKey)(download("src/main/resources/encryptionKeys/privateKey.dat")));
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/sensitiveData/TopSecretDataFile" +
                                                                          ".txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] buffer = new byte[1024];
            int len;
            while( (len=bufferedInputStream.read(buffer)) >= 0 ){
                dsa.update(buffer,0,len);
            };
            bufferedInputStream.close();

            byte[] realSignature = dsa.sign();
            logger.info("Save the signature in a file.");
            FileOutputStream sigFOS = new FileOutputStream("src/main/resources/encryptionKeys/signature");
            sigFOS.write(realSignature);
            sigFOS.close();

            logger.info("Save the public key in a file");


        } catch (NoSuchAlgorithmException e) {
            logger.error("Encountered NoSuchAlgorithm exception", e);
        } catch (IOException io) {
            logger.error("IOException.", io);
        } catch (SignatureException e) {
            e.printStackTrace();
        }

    }
}
