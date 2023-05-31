public class Ship
{
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public int row;
    public int col;
    public int length;
    public int direction;
    public String directionStr;
    
    public Ship(int length)
    {
        this.length = length;
    }
    
    public boolean isLocationSet()
    {
        return false;
    }
    
    public boolean isDirectionSet()
    {
        return false;
    }
    
    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
        boolean isLocationSet = true;
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
        boolean isDirectionSet = true;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getCol()
    {
        return col;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getDirection()
    {
        return direction;
    }
    
    private String directionToString()
    {
        if(direction == 1)
        {
            directionStr = "vertical";
        }
        else
        {
            directionStr = "horizontal";
        }
        return directionStr;
    }
    
    public String toString()
    {
        return "Ship at row " + row + " and column " + col + " with length " + length + " and direction " + direction;
    }
}
