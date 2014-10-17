package com.sys.android.activity;
//downloda by http://www.codefans.net
import org.jivesoftware.smack.packet.Message;

public interface OnMessageListener
{
    public void processMessage(Message message);
}
