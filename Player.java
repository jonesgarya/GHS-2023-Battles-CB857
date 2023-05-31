public class Player
{
    // Static constants for the Player class

    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private static final int NUM_SHIPS = 5;

    // Direction constants

    private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;

    private Grid myGrid;
    private Grid opponentGrid;

    private Ship[] myShips;
    private int numShips;

    public Player()
    {
        myGrid = new Grid();
        opponentGrid = new Grid();
        myShips = new Ship[NUM_SHIPS];
        numShips = 0;
    }

    public void printMyShips()
    {
        myGrid.printShips();
    }

    public void printOpponentGuesses()
    {
        myGrid.printStatus();
    }

    public void printMyGuesses()
    {
        opponentGrid.printStatus();
    }

    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        s.setLocation(row, col);
        s.setDirection(direction);
        myGrid.addShip(s);
    }
}

/*public class Player
{
    // Write your Player class here
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    
    int[] human = {2, 3, 3, 4, 5};
    int[] computer = {2, 3, 3, 4, 5};
    
    public Ship s;
    public int row;
    public int col;
    public int direction;
    
    Grid shipGrid;
    Grid guessGrid;
    
    //private Location[][] humanGrid;
    //Location[][] humanGrid = new Location[NUM_ROWS][NUM_COLS];
    //humanGrid.Grid();
    
    public void Player()
    {
        shipGrid = new Grid();
        guessGrid = new Grid();
    }
    
    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        this.s = s;
        s.row = row;
        s.col = col;
        s.direction = direction;
        
        shipGrid.addShip(s);
        System.out.println(s.getLength());
    }
    
    public void printMyShips()
    {
        //shipGrid.printShips();
    }
    
    public void printMyGuesses()
    {
        guessGrid.printStatus(guessGrid);
    }
    
    public void printOpponentGuesses()
    {
        
    }
}*/
