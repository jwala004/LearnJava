package org.app.abstraction;

public class Sender extends Mail{

	@Override
	void send(String send) {
		System.out.println(send);
		Reciever reciever=new Reciever();
		reciever.messgae();
		reciever.recieve("sent");
	}
	
}
