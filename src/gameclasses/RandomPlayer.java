package gameclasses;

public class RandomPlayer extends Player {
	private RandomGenerator rg;
	public RandomPlayer(String name, char mark) {
		super(name, mark);
		 rg=new RandomGenerator();
	}
	@Override
	protected void play() {
		 while(super.board.xWins()==false && board.oWins()==false) {
				
				if(board.isFull()==true) {
					System.out.print(" Game ends in a draw " );
					return;
				}
				
				makeMove();
				board.display();
				opponent.play();
			}
			System.out.print(this.opponent.getPlayerName()+ " has won ");
			return;
	}
	
	@Override
	protected void makeMove() {
		int x,y;
		x=rg.discrete(0, 2);
		y=rg.discrete(0, 2);
		while(super.board.getMark(x, y)=='X' || super.board.getMark(x, y)=='O')	{
			x=rg.discrete(0, 2);
			y=rg.discrete(0, 2);
			}
		board.addMark(x, y, this.mark);
	}

}
