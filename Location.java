public class Location
{
    //Implement the Location class here
    
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    public boolean val;
    public int status;
    
    public Location()
    {
        
    }
    
    public boolean checkHit()
    {
        return status == HIT;
    }
    
    public boolean checkMiss()
    {
        return status == MISSED;
    }
    
    public boolean isUnguessed()
    {
        return status == UNGUESSED;
    }
    
    public void markHit()
    {
        status = HIT;
    }
    
    public void markMiss()
    {
        status = MISSED;
    }
    
    public boolean hasShip()
    {
        return val;
    }
    
    public void setShip(boolean val)
    {
        this.val = val;
    }
    
    public void setStatus(int status)
    {
        this.status = status;
    }
    
    public int getStatus()
    {
        return status;
    }
}
