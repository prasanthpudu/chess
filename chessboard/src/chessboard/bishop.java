package chessboard;

public class bishop implements coin {
   position curr;
   public bishop(position curr)
   {
	   this.curr= curr;
   }
   public void displaymov()
   {
	   int i= curr.x_pos+1;
	   int j=curr.y_pos+1;
	   
	  while((i>=0 && i<8 && j>=0 && j<8) && board.data[i][j]==null)
	  {
			System.out.print(i+" "+j+"  ");
			i++;
			j++;
	  }
	  i= curr.x_pos-1;
	  j=curr.y_pos-1;
	  while((i>=0 && i<8 && j>=0 && j<8) && board.data[i][j]==null)
	  {
		  if(i<0&&i>8&&j<0&&j<8)
		   {
			  break;
		   }
		  else
		  {
			System.out.print(i+" "+j+"  ");
			i--;
			j--;
		  }
	  }
	  i= curr.x_pos+1;
	   j=curr.y_pos-1;
	   System.out.println();
	  while((i>=0 && i<8 && j>=0 && j<8) && board.data[i][j]==null)
	  {
		  if(i<0&&i>8&&j<0&&j<8)
		   {
			  break;
		   }
		  else
		  {
			System.out.print(i+" "+j+"  ");
			i++;
			j--;
		  }
	  }
	  i= curr.x_pos-1;
	  j=curr.y_pos-1;
	  while((i>=0 && i<8 && j>=0 && j<8) && board.data[i][j]==null)
	  {
		  if(i<0&&i>8&&j<0&&j<8)
		   {
			  break;
		   }
		  else
		  {
			System.out.print(i+" "+j+"  ");
			i--;
			j++;
		  }
	  }
  }
}
