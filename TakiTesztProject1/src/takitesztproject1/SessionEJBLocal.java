package takitesztproject1;

import javax.ejb.Local;

import oracle.bi.action.annotation.OBIActionParameter;

@Local
public interface SessionEJBLocal {
    
    public String TakiTesztHello(@OBIActionParameter (name = "Param1", prompt = "Add meg a parametert") 
                String name);
}
