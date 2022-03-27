package structural.proxy;

public class Main {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer("misitio.com");
        proxyServer.download("loquesea");
    }
}
