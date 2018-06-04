package communications.encryption;

import java.io.*;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.*;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

public class KeyPairUtil {

    public static void generateDsaKeys(String prvFile, String pubFile) throws NoSuchAlgorithmException, IOException,
            NoSuchProviderException, KeyStoreException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA", "SUN");
        keyPairGenerator.initialize(1024, SecureRandom.getInstance("SHA1PRNG", "SUN"));
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey      = keyPair.getPrivate();
        PublicKey  publicKey       = keyPair.getPublic();
        byte[]     privateKeyBytes = privateKey.getEncoded();
        byte[]     publicKeyBytes  = publicKey.getEncoded();

        FileOutputStream prvFos = new FileOutputStream(new File(prvFile));
        FileOutputStream pubFos = new FileOutputStream(new File(pubFile));

        prvFos.write(privateKeyBytes);
        pubFos.write(publicKeyBytes);

        prvFos.close();
        pubFos.close();
    }

    public static void saveKeysToKeyStore(String privateKeyFile, String publicKeyFile, String password) throws Exception{

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        RSAPublicKeySpec publicKeySpec = keyFactory.getKeySpec(keyPair.getPublic(),RSAPublicKeySpec.class);
        saveToFile(publicKeyFile,publicKeySpec.getModulus(),publicKeySpec.getPublicExponent());
        RSAPrivateKeySpec privateKeySpec = keyFactory.getKeySpec(keyPair.getPrivate(),RSAPrivateKeySpec.class);
        saveToFile(privateKeyFile,privateKeySpec.getModulus(), privateKeySpec.getPrivateExponent());
    }

    public static PublicKey readPublicKey(String pubicKeyFile) throws Exception {
        InputStream in = new FileInputStream(pubicKeyFile);
        ObjectInputStream oin =
                new ObjectInputStream(new BufferedInputStream(in));
        try {
            BigInteger       m       = (BigInteger) oin.readObject();
            BigInteger       e       = (BigInteger) oin.readObject();
            RSAPublicKeySpec keySpec = new RSAPublicKeySpec(m, e);
            KeyFactory       fact    = KeyFactory.getInstance("RSA");
            PublicKey        pubKey  = fact.generatePublic(keySpec);
            return pubKey;
        } finally {
            oin.close();
        }
    }

    private static void saveToFile(String fileName,
                                   BigInteger mod, BigInteger exp)
            throws Exception {
        ObjectOutputStream oout = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)));
        try {
            oout.writeObject(mod);
            oout.writeObject(exp);
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            oout.close();
        }
    }


    private static void writeKeyPair(String prvFile, String pubFile, KeyPairGenerator instance) throws IOException,
            NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = instance;

        keyPairGenerator.initialize(1024, SecureRandom.getInstanceStrong());
        KeyPair    keyPair         = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey      = keyPair.getPrivate();
        PublicKey  publicKey       = keyPair.getPublic();
        byte[]     privateKeyBytes = privateKey.getEncoded();
        byte[]     publicKeyBytes  = publicKey.getEncoded();

        FileOutputStream prvFos = new FileOutputStream(new File(prvFile));
        FileOutputStream pubFos = new FileOutputStream(new File(pubFile));

        prvFos.write(privateKeyBytes);
        pubFos.write(publicKeyBytes);

        prvFos.close();
        pubFos.close();
    }

    public static void generateRSAKeys(String prvFile, String pubFile) throws NoSuchAlgorithmException, IOException,
            NoSuchProviderException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);

        keyPairGenerator.initialize(1024, SecureRandom.getInstanceStrong());
        KeyPair    keyPair         = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey      = keyPair.getPrivate();
        PublicKey  publicKey       = keyPair.getPublic();
        byte[]     privateKeyBytes = privateKey.getEncoded();
        byte[]     publicKeyBytes  = publicKey.getEncoded();

        FileOutputStream prvFos = new FileOutputStream(new File(prvFile));
        FileOutputStream pubFos = new FileOutputStream(new File(pubFile));

        prvFos.write(privateKeyBytes);
        pubFos.write(publicKeyBytes);

        prvFos.close();
        pubFos.close();
    }


    public static final byte[] download(String urlString) throws IOException {
        URL           url = new URL(urlString);
        URLConnection uc  = url.openConnection();
        int           len = uc.getContentLength();
        InputStream   is  = new BufferedInputStream(uc.getInputStream());
        try {
            byte[] data   = new byte[len];
            int    offset = 0;
            while (offset < len) {
                int read = is.read(data, offset, data.length - offset);
                if (read < 0) {
                    break;
                }
                offset += read;
            }
            if (offset < len) {
                throw new IOException(
                        String.format("Read %d bytes; expected %d", offset, len));
            }
            return data;
        } finally {
            is.close();
        }
    }

}
