package takitesztproject1;

import javax.ejb.Remote;

@Remote
public interface SessionEJB {
    
    public String TakiTesztHello();
}
