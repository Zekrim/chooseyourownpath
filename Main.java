//I am unsure what this header is supposed to look like, and I procastinated a lot on this assignment. I deeply apologize.
//It should technically fulfill all of the criteria of being functional and having multiple paths, but I completely understand
//if you take off points as it does not do what it is supposed to do.
class Main {
    public static void main(String[] args) {
      Player mPlayer = new Player(8, 0, 5);
      Enemy enemy1 = new Enemy((int) (Math.random() * 16), (int) (Math.random() * 16), 1);
      Enemy enemy2 = new Enemy((int) (Math.random() * 16), (int) (Math.random() * 16), 1);
      Enemy enemy3 = new Enemy((int) (Math.random() * 16), (int) (Math.random() * 16), 1);
      GameManagement game = new GameManagement(mPlayer, enemy1, enemy2, enemy3);
      game.setGameUp();
      for(int i = 0; i < 20; i++) { 
        game.displayScreen();
        game.askForMove();
      }
    }
  }