package structural.proxy;

public class RealServer implements Server{
    private final String host;

    public RealServer(String host){
        this.host = host;
        System.out.println("Starting...");
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading "+host+url);
    }
}
