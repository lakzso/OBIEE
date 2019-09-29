package takitesztproject1;

import javax.ejb.Remote;

import oracle.bi.action.annotation.OBIActionParameter;

@Remote
public interface SessionEJB {
    
    public String TakiTesztHello(@OBIActionParameter (name = "Param1", prompt = "Add meg a parametert") 
                String name);
}
