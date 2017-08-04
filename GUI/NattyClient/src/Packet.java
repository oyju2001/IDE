
class Packet {
	int flag;
	int sys_id;
	int sen_id;
	int timestamp;
	String data;
	
	public Packet(int flag, int sys_id, int sen_id, int timestamp, String data){
		this.flag = flag;
		this.sys_id = sys_id;
		this.sen_id = sen_id;
		this.timestamp = timestamp;
		this.data = data;
	}
	
	public Packet(){
		
	}
}
