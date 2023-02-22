package status;

/**
 * This class +++ Insert class description here +++ 
 *
 * @author Moyu Ran
 */
public class GenerateStatus {
   
    private int size =16;
    StausUser[] rank = new StausUser[size]; //Array of objects: rank[StausUser1, StausUser2,..]
    public void statusDetail()
    {
        int count=0;
        for( StausUser.Status s : StausUser.Status.values() ) //Status - REJECTED , PENDING  
        {
            for(StausUser.Code c : StausUser.Code.values()) //values  1
            {
                rank[count] = new StausUser(s,c); //REJECTED,1, rank[1]=StausUser(REJECTED,1); ...
                //StausUser su1 = new StausUser(s,c);
                    count++;
            }
        }
    }        

    
}
