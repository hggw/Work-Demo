import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HTTPClient {
    public static void main(String[] args) {
        String uri = "index.htm";
        if(args.length!=0){
            uri=args[0];
        }
        doGet("localhost",8080,uri);
    }

    /**
     * 按照GET请求方式访问HTTPServer
     */
    public static void doGet(String host,int port,String uri){
        Socket socket=null;
        try{
            socket= new Socket(host,port);
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            /*创建HTTP请求*/
            StringBuffer sb = new StringBuffer("GET"+uri+"HTTP/1.1\r\n");
            //HTTP请求头
            sb.append("Accept:*/*\r\n");
            sb.append("Accept-Language；zh-ch\r\n");
            sb.append("Accept-Encoding:gzip,deflate\r\n");
            sb.append("User-Agent；HTTPClient\r\n");
            sb.append("Host:localhost；8080\r\n");
            sb.append("Connection:Keep-Alive\r\n\r\n");

            OutputStream socketOut=socket.getOutputStream();
            socketOut.write(sb.toString().getBytes());
            Thread.sleep(2000);
            InputStream socketIn = socket.getInputStream();
            int size = socketIn.available();
            byte[] buffer = new byte[size];
            socketIn.read(buffer);
            System.out.println(new String(buffer));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
