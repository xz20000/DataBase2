import java.net.HttpURLConnection;
import java.net.URL;

public class ConnInf {
    public  URL url ;
    public  boolean DoInput; //允许输入流，即允许下载
    public  boolean DoOutput; //允许输出流，即允许上传
    public  boolean UseCaches; //不使用缓冲
    public  String Method; //使用get请求
    public  String Authorization;
}
