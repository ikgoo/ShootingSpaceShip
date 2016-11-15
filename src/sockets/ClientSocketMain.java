package sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class ClientSocketMain {

	static ClientSocket clientSocket = null;
	
	public static void main(String[] args) {
		
		clientSocket = new ClientSocket();
		Boolean b = clientSocket.Connection("127.0.0.1", 5000);
		
		int i = 0;
    } 
	
}
