package learnunittesting;

public class MessageProcessor1841720149Alief{
private String sender, recipient, message;

public String getMessageAlief() { 
    return message;
}

public String getRecipientAlief() { 
    return recipient;
}

public String getSenderAlief() { 
    return sender;
}

public void setMessageAlief(String message) { 
    this.message = message;
}

public void setRecipientAlief(String recipient) { 
    this.recipient = recipient;
}

public void setSenderAlief(String sender) { 
    this.sender = sender;
}

public String messageFormatAlief(){
    String message = String.format("Hi. %s you have message from %s.\nThe message as follows : %s",
            this.recipient, this.sender, this.message);
    return message;
}
public void showMessageAlief(){
    System.out.println(messageFormatAlief());
}
}