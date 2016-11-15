package sockets;

import enums.CCommands;
import enums.ClientType;

public class SendData {
	
	// 사용자 구분
	public ClientType clientType = ClientType.None;
	
	public CCommands CCommand = CCommands.None;
	
	
	public String CData = "";
	
	
	public Boolean DePacking(String data)
	{
		return true;
	}
	
	public String Packing()
	{
		return "tesfdsfldlsdjfl";
	}
	
}
