/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    public enum Status {REJECTED,PENDING,PROCESSING,APPROVED};
    public enum Code {ZERO,ONE,TWO,THREE};
    private Status statusUser;
    private Code codeUser;
    
    public StausUser(Status statusUser,Code codeUser)
    {
        this.statusUser=statusUser;
        this.codeUser=codeUser;
    }
    /**
     * @return the statusUser
     */
    public Status getStatusUser() {
        return statusUser;
    }

    /**
     * @param statusUser the statusUser to set
     */
    public void setStatusUser(Status statusUser) {
        this.statusUser = statusUser;
    }

    /**
     * @return the codeUser
     */
    public Code getCodeUser() {
        return codeUser;
    }

    /**
     * @param codeUser the codeUser to set
     */
    public void setCodeUser(Code codeUser) {
        this.codeUser = codeUser;
    }
    
}
