package unittest;

public class MessageProcessor1841720149Alief {
    private String mSender;
    private String mRecipient;
    private String mMessage;

    public String getmSenderAlief() {
        return mSender;
    }

    public void setmSenderAlief(String mSender) {
        this.mSender = mSender;
    }

    public String getmRecipientAlief() {
        return mRecipient;
    }

    public void setmRecipientAlief(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public String getmMessageAlief() {
        return mMessage;
    }

    public void setmMessageAlief(String mMessage) {
        this.mMessage = mMessage;
    }

    public String messageFormatAlief() {
        return String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.getmRecipientAlief(), this.getmSenderAlief(), this.getmMessageAlief());
    }

    public void showMessageAlief() {
        System.out.println(messageFormatAlief());
    }
}
