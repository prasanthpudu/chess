package chessboard;

public class rook implements display,coin{
   position curr;
   public rook(position curr) {
	this.curr= curr;
}
   public void displaymov()
   {
	 for(int i=curr.y_pos+1;i<8;i++)
	 {
		 if(board.data[curr.x_pos][i]==null)
		 {
			 System.out.print(curr.x_pos+" "+i+"  ");
		 }
		 else
		 {
			 break;
		 }
	 }
	 for(int i=curr.y_pos-1;i>0;i--)
	 {
		 if(board.data[curr.x_pos][i]==null)
		 {
			 System.out.print(curr.x_pos+" "+i+"  ");
		 }
		 else
		 {
			 break;
		 }
	 }
	 System.out.println();
	 for(int i=curr.x_pos+1;i<8;i++)
	 {
		 if(board.data[i][curr.y_pos]==null)
		 {
			 System.out.print(curr.y_pos+" "+i+"  ");
		 }
		 else
		 {
			 break;
		 }
	 }
	 
	 for(int i=curr.x_pos-1;i>0;i--)
	 {
		 if(board.data[i][curr.y_pos]==null)
		 {
			 System.out.print(curr.y_pos+" "+i+"  ");
		 }
		 else
		 {
			 break;
		 }
	 }
	 
   }
}
