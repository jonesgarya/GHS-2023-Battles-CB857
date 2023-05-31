public class Grid
{
    // Copy over your Grid class into here
    private Location[][] grid;

    // Constants for number of rows and columns.
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
    
    String letters = "ABCDEFGHIJ";
    String status = "-XO";
    
    // Create a new Grid. Initialize each Location in the grid
    // to be a new Location object.
    public Grid()
    {
        grid = new Location[NUM_ROWS][NUM_COLS];
        
        for(int row = 0; row < 10; row++)
        {
            for(int col = 0; col < 10; col++)
            {
                grid[row][col] = new Location();
            }
        }
    }
    // Mark a hit in this location by calling the markHit method
    // on the Location object.  
    public void markHit(int row, int col)
    {
        grid[row][col].markHit();
    }
    // Mark a miss on this location.    
    public void markMiss(int row, int col)
    {
        grid[row][col].markMiss();
    }
    // Set the status of this location object.
    public void setStatus(int row, int col, int status)
    {
        grid[row][col].setStatus(status);
    }
    // Get the status of this location in the grid  
    public int getStatus(int row, int col)
    {
        return grid[row][col].getStatus();
    }
    // Return whether or not this Location has already been guessed.
    public boolean alreadyGuessed(int row, int col)
    {
        return !grid[row][col].isUnguessed();
    }
    // Set whether or not there is a ship at this location to the val   
    public void setShip(int row, int col, boolean val)
    {
        grid[row][col].setShip(val);
    }
    // Return whether or not there is a ship here   
    public boolean hasShip(int row, int col)
    {
        return grid[row][col].hasShip();
    }
    // Get the Location object at this row and column position
    public Location get(int row, int col)
    {
        return grid[row][col];
    }
    // Return the number of rows in the Grid
    public int numRows()
    {
        return NUM_ROWS;
    }
    // Return the number of columns in the grid
    public int numCols()
    {
        return NUM_COLS;
    }
    
    public void printStatus()
    {
        System.out.print(" ");
        for(int i = 1; i <= 10; i++)
        {
            System.out.print(" " + i);
        }
        System.out.println();
        for(int row = 0; row < 10; row++)
        {
            System.out.print(letters.charAt(row) + " ");
            for(int col = 0; col < 10; col++)
            {
                System.out.print(status.charAt(grid[row][col].getStatus()) + " ");
            }
            System.out.println();
        }
    }
    
    public void printShips()
    {
        System.out.print(" ");
        for(int i = 1; i <= 10; i++)
        {
            System.out.print(" " + i);
        }
        System.out.println();
        for(int row = 0; row < 10; row++)
        {
            System.out.print(letters.charAt(row) + " ");
            for(int col = 0; col < 10; col++)
            {
                if(grid[row][col].hasShip())
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    
    public void addShip(Ship s)
    {
        int shipRow = s.getRow();
        int shipCol = s.getCol();
        int shipLength = s.getLength();
        int shipDir = s.getDirection();
        boolean val = true;
        
        if(shipDir == 0)
        {
            for(int i = 0; i < shipLength; i++)
            {
                grid[shipRow][shipCol+i].setShip(val);
            }
        }
        else
        {
            for(int i = 0; i < shipLength; i++)
            {
                grid[shipRow+i][shipCol].setShip(val);
            }
        }
    }
}
