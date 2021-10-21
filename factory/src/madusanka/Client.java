package madusanka;

public class Client {
    public static void main(String[] args) {

        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());

//      Message message = new JSONMessageCreator().createMessage();
//      System.out.println(message.getContent());
    }

    public static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
