import java.util.Scanner;

public class GameManagement {
    Player player;
    Enemy[] enemiesList;
    char[][] boardState;
    final int size;
    final Scanner inputManager = new Scanner(System.in); 
    
    // Yes, Enemies and players can overlap using this system.
    public GameManagement(int size, Player player, Enemy... enemiesList) {
        this.player = player;
        this.enemiesList = enemiesList;
        this.size = size;
        boardState = new char[size][size];
        for(char[] i : boardState) {
            for(char j : i) {
                j = ' ';
            }
        }
        for(Enemy enemy : enemiesList) {
            boardState[enemy.getX()][enemy.getY()] = 'M';
        }
        boardState[player.getY()][player.getX()] = player.getCharacter();
    }

    // Yes, Enemies and players can overlap using this system.
    public GameManagement(Player player, Enemy... enemiesList) {
        this.player = player;
        this.enemiesList = enemiesList;
        this.size = 16;
        boardState = new char[size][size];
        for(char[] i : boardState) {
            for(char j : i) {
                j = ' ';
            }
        }
        for(Enemy enemy : enemiesList) {
            boardState[enemy.getX()][enemy.getY()] = 'M';
        }
        boardState[player.getY()][player.getX()] = player.getCharacter();
    }

    // Make sure that no enemies overlap with the player when this is called
    // Gets user input 
    public void askForMove() {
        boardState[player.getX()][player.getY()] = ' ';
        System.out.println("Do you wish to rotate up to a quarter of a revolution?" +
        " (r for 45° right turn, R for 90° right turn, l for 45° left turn, L for " +
        "90° left turn, and press enter for no rotation at all.");
        String result = inputManager.nextLine();
        if(result.toUpperCase().equals("L")) {
            player.turnLeft();
            if(result.equals("L")) {
                player.turnLeft();
            }
        } else if(result.toUpperCase().equals("R")) {
            player.turnRight();
            if(result.equals("R")) {
                player.turnRight();
            }
        } else if(!result.equals("")) {
            System.out.println("Invalid input, continuing...");
        }

        System.out.println("Do you want to move left, right, or neither (l/r/n)");
        result = inputManager.next();
        if(result.equals("l")) {
            if(player.getY() != 0) {
                player.moveY(player.getY() - 1);
            }
        } else if(result.equals("r")) {
            if(player.getY() != size - 1) {
                player.moveY(player.getY() + 1);
            }
        } else if(!result.equals("n")) {
            System.out.println("Invalid input, continuing...");
        }

        System.out.println("Do you want to move up, down, or neither (u/d/n)");
        result = inputManager.next();
        if(result.equals("u")) {
            if(player.getX() != 0) {
                player.moveX(player.getX() - 1);
            }
        } else if(result.equals("d")) {
            if(player.getX() != size - 1) {
                player.moveX(player.getX() + 1);
            }
        } else if(!result.equals("n")) {
            System.out.println("Invalid input, continuing...");
        }
        refresh();
    }
    //Updates the screen. Broken, and I don't know why.
    public void displayScreen() {
        for(int i = 0; i < size + 2; i++) {
            System.out.print('█');
        }
        System.out.println();
        for(char[] i : boardState) {
            System.out.print('█');
            System.out.print(i);
            System.out.println('█');
        }
        for(int i = 0; i < size + 2; i++) {
            System.out.print('█');
        }
        System.out.println();
    }

    //Prints text to display the game
    public void setGameUp() {
        System.out.println("Hey! Welcome to my project.");
        System.out.println("I didn't have the time to write an AI for the monsters, so I just had 3 of them fall down on random positions and figured the challenge element would be to get it all done in a few moves as possible.");
        System.out.println("Isn't too interesting of a game, I know, but I really should've gotten started on this project earlier and I overall didn't feel very well when I started to work on it.");
        System.out.println("My justification for this project was that the character used \"lightning\" to fire projectiles to destroy the enemies.");
        System.out.println("At any rate, enjoy! I tried to abide by the project requirements to the best of my ability");
    }
    // Refreshes the screen
    private void refresh() {
        for(char[] i : boardState) {
            for(char j : i) {
                j = ' ';
            }
        }
        boardState[player.getY()][player.getX()] = player.getCharacter();
    }
}