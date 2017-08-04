
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class ContainerClient {
		String server;
	    int port;
	    int containerPort;
	    Packet packet = new Packet();

	    public ContainerClient(String server, int port, int containerPort, Packet packet) {
	        this.server = server;
	        this.port = port;
	        this.containerPort = containerPort;
	        this.packet = packet;
	    }
	    
	    public void start() {
	    	
	        EventLoopGroup group = new NioEventLoopGroup();

	        try {
	            Bootstrap bootstrap = new Bootstrap().group(group)
	                    .channel(NioSocketChannel.class)
	                    .handler(new ClientAdapterInitializer());

	            NioSocketChannel channel = (NioSocketChannel)bootstrap.connect(server, port).sync().channel();
	            	      
	         //   Thread.sleep(4000);
	            
	            channel.write(String.valueOf(packet.flag)+"/");
	            channel.write(String.valueOf(packet.sys_id)+"/");
	            channel.write(String.valueOf(packet.sen_id)+"/");
	            channel.write(String.valueOf(packet.timestamp)+"/");
	            channel.write(packet.data);
	            channel.flush();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            group.shutdownGracefully();
	        }
	    }
}
