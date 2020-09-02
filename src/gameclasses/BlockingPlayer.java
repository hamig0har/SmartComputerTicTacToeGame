package gameclasses;

public class BlockingPlayer extends RandomPlayer {
protected RandomGenerator rg;
	public BlockingPlayer(String name, char mark) {
		
		super(name, mark);
		rg=new RandomGenerator();
		
	}
	
	@Override
	protected void makeMove() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				boolean tester=testForBlocking(i,j);
				if(tester==true) {
					board.addMark(i, j, mark);
					return;
				}
			}
		}
		int x,y;
		x=rg.discrete(0, 2);
		y=rg.discrete(0, 2);
		while(super.board.getMark(x, y)=='X' || super.board.getMark(x, y)=='O')	{
			x=rg.discrete(0, 2);
			y=rg.discrete(0, 2);
			}
		board.addMark(x, y, this.mark);
	}


	protected boolean testForBlocking(int row,int col) {
		
		if(super.board.getMark(row, col)=='X' || super.board.getMark(row, col)=='O') {
			return false;
		}
		
		if(row==0 && col ==0) {
			if(board.getMark(row, 1)==opponent.mark && board.getMark(row, 2)==opponent.mark){
				return true;
			}
			else if(board.getMark(1, 1)==opponent.mark && board.getMark(2, 2)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1, 0)==opponent.mark && board.getMark(2, 0)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==0 && col==1) {
			if(board.getMark(row, 0)==opponent.mark && board.getMark(row, 2)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1,col)==opponent.mark && board.getMark(2,col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==0 && col==2) {
			if(board.getMark(row, 1)==opponent.mark && board.getMark(row, 0)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1, 1)==opponent.mark && board.getMark(2, 0)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1, col)==opponent.mark && board.getMark(2, col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==1 && col==0) {
			if(board.getMark(row, 1)==opponent.mark && board.getMark(row, 2)==opponent.mark) {
				return true;
			}
			else if(board.getMark(0, col)==opponent.mark && board.getMark(2, col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==1 && col==1) {
			if(board.getMark(row, 0)==opponent.mark && board.getMark(row, 2)==opponent.mark) {
				return true;
			}
			else if(board.getMark(0, col)==opponent.mark && board.getMark(2, col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==1 && col==2) {
			if(board.getMark(row, 1)==opponent.mark && board.getMark(row, 0)==opponent.mark) {
				return true;
			}
			else if(board.getMark(0, col)==opponent.mark && board.getMark(2, col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==2 && col ==0) {
			if(board.getMark(row, 1)==opponent.mark && board.getMark(row, 2)==opponent.mark){
				return true;
			}
			else if(board.getMark(1, 1)==opponent.mark && board.getMark(0, 2)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1, col)==opponent.mark && board.getMark(0, col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==2 && col==1) {
			if(board.getMark(row, 0)==opponent.mark && board.getMark(row, 2)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1,col)==opponent.mark && board.getMark(0,col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(row==2 && col==2) {
			if(board.getMark(row, 1)==opponent.mark && board.getMark(row, 0)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1, 1)==opponent.mark && board.getMark(0, 0)==opponent.mark) {
				return true;
			}
			else if(board.getMark(1, col)==opponent.mark && board.getMark(0, col)==opponent.mark) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}
}
