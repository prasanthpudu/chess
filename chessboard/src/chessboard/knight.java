package chessboard;

public class knight implements coin {
  position curr;
  public knight(position curr)
  {
	this.curr= curr;  
  }
  public void displaymov()
  {
	  int x_val=0,y_val=0;
	 for(int i=0;i<8;i++)
	 {
		 switch (i)
		 {
			 case 0:
			 {
				 x_val=curr.x_pos-2;
				 y_val= curr.y_pos-1;
				 break;
			 }
			 case 1:
			 {
				 x_val=curr.x_pos-2;
				 y_val= curr.y_pos+1;
				 break;
			 }
			 case 2:
			 {
				 x_val=curr.x_pos-1;
				 y_val= curr.y_pos+2;
				 break;
			 }
			 case 3:
			 {
				 x_val=curr.x_pos+1;
				 y_val= curr.y_pos+2;
				 break;
			 }
			 case 4:
			 {
				 x_val=curr.x_pos+2;
				 y_val= curr.y_pos+1;
				 break;
			 }
			 case 5:
			 {
				 x_val=curr.x_pos+2;
				 y_val= curr.y_pos-1;
				 break;
			 }
			 case 6:
			 {
				 x_val=curr.x_pos+1;
				 y_val= curr.y_pos-2;
				 break;
			 }
			 case 7:
			 {
				 x_val=curr.x_pos-1;
				 y_val= curr.y_pos-2;
				 break;
			 }
		 }
		 if(x_val>=0 && x_val<8 && y_val>=0 && y_val<8)
		 {
			 System.out.println(x_val+" "+y_val+"  ");
		 }
	 }
  }
}
