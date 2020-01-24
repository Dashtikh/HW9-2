package Remote;

import java.rmi.Remote;

public interface SiteInterface extends Remote {
    String pardakht (int money , int cost) throws Exception;
    String vahed (String vaheds) throws Exception;

}
