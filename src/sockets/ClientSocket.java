package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

import Utils.Utils;
import enums.CCommands;

public class ClientSocket {

	public String serverIP = "";
	public int serverPort = 5000;
	
	private Socket socket;
	
	
	public Boolean Connection(String serverIP, int serverPort)
	{
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		
		Boolean b = false;
		
		try
		{
			socket = new Socket(this.serverIP, this.serverPort);
			
			b = true;
			
			
		} catch (ConnectException ce) {
	        //ce.printStackTrace();
	        Utils.Log(ce);
	        
	    } catch (IOException ie) {
	        //ie.printStackTrace();
	        Utils.Log(ie);
	        
	    } catch (Exception e) {
	        //e.printStackTrace();
	        Utils.Log(e);
	        
	    }
		
		return b;
	}
	
	public void GetMsg(String data)
	{
		SendData getData = new SendData();
		getData.DePacking(data);
		
		if(getData.CCommand == CCommands.GetServerList)
		{
			
		}
				
	}
	
	public boolean SendMsg(SendData sendData)
	{
		// 소켓의 출력스트림을 얻는다.
        OutputStream out;
		try {
			out = socket.getOutputStream();
	        DataOutputStream dos = new DataOutputStream(out); // 기본형 단위로 처리하는 보조스트림
	         
	        dos.writeUTF(sendData.Packing());
	        

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
         
		
		return false;
		
	}
	
	public void Distory()
	{
		try {
			socket.close();
		} catch (IOException e) {
			//e.printStackTrace();
			Utils.Log(e);
			
		}
	}
    

	
	
	
	
	
}
