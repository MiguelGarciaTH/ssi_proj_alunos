package crypto;
import java.nio.ByteBuffer;

public class CryptoModuleStudents{
    public CryptoModuleStudents(String username, String sender) {
    }
    /**
     * Do not change this method
     * @param src the sender of the message
     * @param ciphered byte array with the serialized data
     * @param signed byte array with the signature of the ciphered data
     * @return byte array with all the content
     */
    public byte[] prepareMessage(String src, byte[] ciphered, byte[] signed){
        byte[] srcArray = src.getBytes();
        ByteBuffer message = ByteBuffer.allocate(srcArray.length + ciphered.length + (4 * 2));
        message.putInt(srcArray.length);
        message.put(srcArray);
        message.putInt(ciphered.length);
        message.put(ciphered);
        return message.array();
    }

    /**
     *  This method needs to be modified
     * @param data to cipher
     * @return ciphered data
     */
    public byte[] encrypt(byte[] data) {
        return data;
    }
    /**
     *  This method needs to be modified, the following code's purpose is only to make the software work with this
     *  class even without the actual functionality.
     * @param data ciphered data
     * @return deciphered data
     */
    public byte[] decrypt(byte[] data) {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        int lenSrc = buffer.getInt();
        byte[] src = new byte[lenSrc];
        buffer.get(src, 0, lenSrc);
        int cipheredLen = buffer.getInt();
        byte[] ciphered = new byte[cipheredLen];
        buffer.get(ciphered, 0, cipheredLen);
        return ciphered;
    }
    /**
     * This method needs to be modified. It signs a message
     * @param data byte array to sign
     * @return the signature (byte array)
     */
    public byte[] sign(byte[] data) {
        return data;
    }
    /**
     * This method needs to be modified. It verifies a signature
     * @param data receives the data that was used to generate the signature
     * @return true if the signature is valid, false otherwise
     */
    public boolean verifySignture(byte[] data) {
        return true;
    }
}
