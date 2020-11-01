package lab7.Homework;

public class EthernetLayer extends BaseLayer {
    private String header = "localhost:://3000/ ";
    String message;

    public void encrypt(String message){
        this.message = header + message;
    }

    public void decrypt(String message){
        String result = message.replace(header, "");
        next_layer.decrypt(result);
    }

    String getOutput(){
        return message;
    }

}
