import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;


public class ShoeDetails extends Applet{
	Graphics g;
	
	
	private static final long serialVersionUID = 1L;
	TextField name[];
	TextField password[];
	int WIDTH=0;
	int HEIGHT=0;
	int xcoords=0;
	int ycoords=0;
	
	JDBCExample je=new JDBCExample();
	public void init()
	{
		je.method();
		name=new TextField[je.name.size()];
		password=new TextField[je.password.size()];
		
		for(int i=0;i<je.name.size() || i<je.password.size();i++)
		{
			name[i]=new TextField(10);
			add(name[i]);
			name[i].setLocation(xcoords, ycoords);
			ycoords+=20;
			name[i].setText((String) je.name.get(i));
			
			password[i]=new TextField(10);
			add(password[i]);
			password[i].setLocation(xcoords, ycoords);
			xcoords+=20;
			password[i].setText((String) je.password.get(i));
			
		}
		
		
		JDBCExample je=new JDBCExample();
		je.method();
	
		this.setBackground(Color.yellow);
		
	}
	public void paint(Graphics g)
	{
		
		for(int i=0;i<je.name.size() || i<je.password.size();i++)
		{
			
			name[i].getText();
			
			password[i].getText();
			
		}
		g.drawString("Khush", 500, 500);
		
	}	
	
}
