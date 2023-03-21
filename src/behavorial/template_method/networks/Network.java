package behavorial.template_method.networks;

public abstract class Network {
    String userName;
    String password;
    
    Network() {
        
    }

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    protected abstract void logOut();

    protected abstract boolean sendData(byte[] data);

    protected abstract boolean logIn(String userName, String password);
}
