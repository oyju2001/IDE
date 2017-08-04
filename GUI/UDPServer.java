import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.Vector;

public class UDPServer extends Thread {
	public Vector<Packet> vector = new Vector<Packet>(10);
	
	public Packet getPacket(){
			Packet p = vector.get(0);
			vector.remove(0);
			return p;
	}
	
	public boolean IsExist(){
		return (vector.size() > 0);
	}
	
		
	@Override
	public void run() {
		
		
		DatagramSocket serverSocket = null;
		try {
			serverSocket = new DatagramSocket(5258);
		}catch (SocketException e1) {
			e1.printStackTrace();
		}
		int i = 0;
		Packet pack = new Packet();
		while(true){
	         byte[] receiveData = new byte[1024];
	         byte[] sendData = new byte[1024];
	         
	         DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	         try {
	        	 serverSocket.receive(receivePacket); 
	         }catch (IOException e) {
	        	 e.printStackTrace();
	         }
	         String sentence = new String(receivePacket.getData()).trim();
	         System.out.println("RECEIVED: " + sentence);
	         i++;
	         
	         switch(i){
		         case 1 : pack.flag = Integer.parseInt(sentence); break;  	
		         case 2 : pack.sys_id = Integer.parseInt(sentence); break;	
		         case 3 : pack.sen_id = Integer.parseInt(sentence); break;
		         case 4 : pack.timestamp = Integer.parseUnsignedInt(sentence); break; 	 
		         case 5 : pack.data = sentence; i = 0; 
		         			vector.addElement(pack);
		         			pack = new Packet();	break; 
	         }
			
					/*
					InetAddress IPAddress = receivePacket.getAddress();   
					int port = receivePacket.getPort();
					String capitalizedSentence = sentence;//.toUpperCase();
					sendData = capitalizedSentence.getBytes();
					DatagramPacket sendPacket =
					new DatagramPacket(sendData, sendData.length, IPAddress, port);
					try {
						serverSocket.send(sendPacket);
					} catch (IOException e) {
						e.printStackTrace();
					}*/
		
			}
	
	}
}
