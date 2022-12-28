package KONG_VONGPISITH_TP07.Exercise02and03;

import java.security.Key;

import javax.crypto.Cipher;

public class DecryptionMessage extends EncryptMessage {
    private String message, key;

    public DecryptionMessage(String message, String key) {
        super(message, key);
        this.message = message;
        this.key = key;
    }

    public String decryptMessage() {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            byte[] p = new byte[message.length()];
            for (int i = 0; i < message.length(); i++) {
                p[i] = (byte) message.charAt(i);
            }
            cipher.init(Cipher.DECRYPT_MODE, convertAllToKey());
            try {
                byte[] text = cipher.doFinal(p);
                return new String(text);
            } catch (Exception e) {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Key convertAllToKey() {
        return null;
    }
}
