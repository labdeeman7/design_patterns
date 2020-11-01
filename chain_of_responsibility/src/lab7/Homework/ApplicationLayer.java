package lab7.Homework;

import java.util.logging.Handler;

public class ApplicationLayer extends BaseLayer {
    String message;

    ApplicationLayer(){
        message = "How are you?";
    }

    void startEncryption(){
        this.encrypt(message);
    }

    public void encrypt(String message){
        // Construct message
        next_layer.encrypt(message);

    }

    public void decrypt(String message){
        //display message
        this.message = message;
    }

    String getOutput(){
        return message;
    }
}
