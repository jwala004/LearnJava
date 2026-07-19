package org.app.abstraction;

public class Test {
public static void main(String[] args) {
	Mail mail=new Sender();
	mail.messgae();
	mail.send("Hello Dear.");
}
}
