package gameclasses;

import java.util.Scanner;

public class HumanPlayer extends Player{

	public HumanPlayer(String name, char mark) {
		super(name, mark);
	
	}
	
	@Override
	public void play() {
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
	public void makeMove() {
		int row,column;
		Scanner s = new Scanner(System.in);
		System.out.print(this.name + " what row your next " + this.mark +" be placed in? ");
		row=s.nextInt();
		System.out.print(this.name + " what column your next " + this.mark +" be placed in? ");
		column=s.nextInt();
		board.addMark(row, column, this.mark);		
	}

}
