package lab7.Homework;

public class TCPLayer extends BaseLayer {
    private String header = "HTTP:400 ";

    public void encrypt(String message){
        next_layer.encrypt(header + message);
    }

    public void decrypt(String message){
        String result = message.replace(header, "");
        next_layer.decrypt(result);
    }
}
