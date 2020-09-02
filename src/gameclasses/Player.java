package gameclasses;

/**
 * class that holds information about the players and allows the to make moves and play the game
 * @author hamza
 *
 */
public abstract class Player implements Constants{
	/**
	 * Name of player
	 */
	protected String name;
	/**
	 * The board the game is played on
	 */
	protected Board board;
	/**
	 * The other player
	 */
	protected Player opponent;
	/**
	 * the players mark(X or O)
	 */
	protected char mark;
	/**
	 * Sets a particular mark to a particular player
	 * @param name name of player that mark needs to be assigned to
	 * @param mark mark that needs to be assigned
	 */
	protected Player(String name,char mark) {
		setPlayerName(name);
		this.mark=mark;
	}
	/**
	 * sets the name of the player
	 * @param name the name that needs to be set
	 */
	protected void setPlayerName(String name) {
		
		this.name=name;
		return;
		
	}
	/**
	 * gets the name of the player
	 * @return the players name
	 */
	protected String getPlayerName() {
		
		return this.name;
		
	}
	/**
	 * initiates the game and allows the game to continue till a player wins or game ends in a draw
	 */
	protected abstract void play() ;
	/**
	 * makes the move the player wants depending on the row and column chosen
	 */
	protected abstract void makeMove();
	/**
	 * sets the opponent player
	 * @param foe the opponent player
	 */
	protected void setOpponent(Player foe) {
		
		this.opponent=foe;
		return;
		
	}
	/**
	 * sets the board the game needs to be played on
	 * @param theBoard the game needs to be played on this board
	 */
	protected void setBoard(Board theBoard) {
		this.board=theBoard;
		return;
	}

}
