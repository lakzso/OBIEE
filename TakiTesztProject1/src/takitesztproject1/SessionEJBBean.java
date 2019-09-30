package takitesztproject1;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import oracle.bi.action.annotation.OBIActionParameter;
import java.sql.*;  

@Stateless(name = "TakiSessionEJB", mappedName = "ejb/TakiTesztApp1-TakiTesztProject1-SessionEJB")
@TransactionManagement(TransactionManagementType.BEAN)
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
//    public String TakiTesztHello(){return "HELLO";}
    public String TakiTesztHello(@OBIActionParameter (name = "Param1", prompt = "Add meg a parametert") 
    		String name){
        
     
        String  param2;
        try{  
        //step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
          
        //step2 create  the connection object  
        Connection con=DriverManager.getConnection(  
        "jdbc:oracle:thin:@//10.0.90.53:1521/pdborcl","system","****");  
          

            
        CallableStatement cstmt = con.prepareCall(" declare  ta VARCHAR2(10);\n" + 
        "BEGIN\n" + 
        "? :=  ANALYST_FBD.TESZT(?);\n" + 
        "END;");
        
        cstmt.registerOutParameter(1,Types.VARCHAR);
        
        cstmt.setString(2, name);
        cstmt.execute();
            
        param2 = cstmt.getString(1);

         System.out.println("success");  
            
          
        con.close();   
          
        }catch(Exception e){ System.out.println(e);}   
          
        
  
          return "Helloka";
          
    } 
}

