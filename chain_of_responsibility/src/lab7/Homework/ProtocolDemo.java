package lab7.Homework;

public class ProtocolDemo {
    public static void main(String[] args)
    {
        //encryption - sender
        ApplicationLayer senderAppLayer = new ApplicationLayer();
        EncryptionLayer senderEncryptLayer = new EncryptionLayer();
        TCPLayer senderTCPLayer = new TCPLayer();
        EthernetLayer senderEthernetLayer = new EthernetLayer();

        senderAppLayer.addLayer(senderEncryptLayer);
        senderEncryptLayer.addLayer(senderTCPLayer);
        senderTCPLayer.addLayer(senderEthernetLayer);

        System.out.println("encrypting...");
        senderAppLayer.startEncryption();

        String senderOutputMessage = senderEthernetLayer.getOutput();
        System.out.println("encrypted message " + senderOutputMessage);

        //decryption - receiver
        ApplicationLayer receiverAppLayer = new ApplicationLayer();
        EncryptionLayer receiverEncryptLayer = new EncryptionLayer();
        TCPLayer receiverTCPLayer = new TCPLayer();
        EthernetLayer receiverEthernetLayer = new EthernetLayer();

        receiverEthernetLayer.addLayer(receiverTCPLayer);
        receiverTCPLayer.addLayer(receiverEncryptLayer);
        receiverEncryptLayer.addLayer(receiverAppLayer);

        System.out.println("decrypting...");
        receiverEthernetLayer.decrypt(senderOutputMessage);

        String receiverOutputMessage = receiverAppLayer.getOutput();
        System.out.println("decrypted message " + receiverOutputMessage);

    }
}
