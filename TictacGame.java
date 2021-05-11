import java.awt.*;
import java.awt.event.*;
class FDemo23 extends Frame implements ActionListener
{
Button ngame;
Button  b[]=new Button[9];
Label lab1;
int c=0; 
int x=100;
int y=100;
int w=50;
int h=50;
int k=0;
FDemo23()
{
	Font f = new Font("Fold",Font.ITALIC,30);
			setFont(f);
	setLayout(null);
	//setTitle("O-X Game");
	
	
	for(int i=1;i<=3;i++)
		{for(int j=1;j<=3;j++)
			{
			b[k]=new Button("");
			b[k].setSize(w,h);
			b[k].setLocation(x,y);
			add(b[k]);
		    b[k].addActionListener(this); 
			x=x+50;
			k++;
			}y=y+50;
			x=100;
		}
	 
	
	
	ngame=new Button("new");
	ngame.setSize(100,50);
    ngame.setLocation(400,100);
	ngame.addActionListener(this);
	add(ngame);
	
	
	lab1=new Label();
	lab1.setSize(200,50);
	lab1.setLocation(250,300);
	add(lab1);
 

}
public void actionPerformed(ActionEvent e)
{
	//for clear and new....
	
	if(e.getSource()==ngame)
	 {
		 for(int i=0;i<9;i++)
		 {
		 b[i].addActionListener(this);
		 b[i].setLabel(""); 
		 //b[i].setBackground(new Button().getBackground());
		 // b[i].setBackground(null);
		//b[i].setBackground(UIManager.getColor("Button.background"));
		b[i].setBackground(new Color(235,235,235));
		 
		 }
		 lab1.setText("");
	 }
	
	else{
	//for O and X
 
Button x= new Button();
	x=(Button)e.getSource();
	 
	 
	if(c==0){
		
	x.setLabel("X");
	x.setBackground(Color.blue);
	x.removeActionListener(this);
	 
	c++;
    }
	else
	{ x.setLabel("O");
      x.setBackground(Color.red);
       x.removeActionListener(this);
	  c--;
	}
	 
	  
	 if((b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X") || 
	 (b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X") ||
	 (b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X") ||
	 (b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X") ||
	 (b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X") ||
	 (b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X") ||
	 (b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X") ||
	 (b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X") )  
	 {
		 lab1.setText("X you win");
		  for(int i=0;i<9;i++)
		 { 
		 b[i].removeActionListener(this);
		 } 
		 c=0;
	 }  
	   
	 if((b[0].getLabel()=="O" && b[1].getLabel()=="O" && b[2].getLabel()=="O") || 
	 (b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O") ||
	 (b[6].getLabel()=="O" && b[7].getLabel()=="O" && b[8].getLabel()=="O") ||
	 (b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O") ||
	 (b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[7].getLabel()=="O") ||
	 (b[2].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O") ||
	 (b[0].getLabel()=="O" && b[4].getLabel()=="O" && b[8].getLabel()=="O") ||
	 (b[2].getLabel()=="O" && b[4].getLabel()=="O" && b[6].getLabel()=="O") )    
	 {
		 lab1.setText("O you win");
		 for(int i=0;i<9;i++)
		 { 
		 b[i].removeActionListener(this);
		 } c=0;
	 }  
	}
	 
} 
  
}
class TictacGame
{
public static void main(String args[])
{
	FDemo23 f=new FDemo23();
	f.setSize(700,400);
	f.setLocation(600,250);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{System.exit(0);}
});
	
}


}