package structural.proxy;

public class ProxyServer implements Server{
    RealServer realServer;
    private String host;

    public ProxyServer(String host){
        this.host = host;
        realServer = null;
        System.out.println("Startind proxy");
    }
    @Override
    public void download(String url) {
        if (realServer == null){
            realServer = new RealServer(host);
        }
        realServer.download(url);
    }
}
