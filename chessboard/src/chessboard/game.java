package chessboard;

public class game {
public static void main(String[] args) {
	 coin rookleft = new rook(new position(0,4));
	 coin rookright  = new rook(new position(0,4));
	 coin knightri = new knight(new position(0,1));
	 coin bisri = new bishop(new position(3,6));
			 for(int i=0;i<8;i++)
			 {
				 for(int j=0;j<8;j++)
				 {
					 board.data[i][j]=null;
				 }
			 }
			 board.data[0][7]=rookleft;
			 board.data[0][4]=rookright;
			 board.data[0][1]=knightri;
			 board.data[0][2]=bisri;
			 position in= new position(3,6);
			 board.data[in.x_pos][in.y_pos].displaymov();
   }
}
