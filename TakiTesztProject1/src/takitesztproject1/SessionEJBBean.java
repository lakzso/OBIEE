package takitesztproject1;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import oracle.bi.action.annotation.OBIActionParameter;

@Stateless(name = "TakiSessionEJB", mappedName = "ejb/TakiTesztApp1-TakiTesztProject1-SessionEJB")
@TransactionManagement(TransactionManagementType.BEAN)
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
    public String TakiTesztHello(){
  
          return "Hello";
    } 
}

