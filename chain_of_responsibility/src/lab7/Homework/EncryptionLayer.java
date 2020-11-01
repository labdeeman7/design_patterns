package lab7.Homework;

public class EncryptionLayer extends BaseLayer {
    private String key = "encryption_key";

    public void encrypt(String message){

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++)
            sb.append((char)(message.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();

        next_layer.encrypt(result);
    }

    public void decrypt(String message){

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++)
            sb.append((char)(message.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();

        next_layer.decrypt(result);
    }

}
