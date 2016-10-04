//import java.applet.*;
import java.awt.*;
 class mymenu extends Frame
{
            
	private static final long serialVersionUID = 1L;
			MenuBar mb;
            Menu filemenu,editmenu,viewmenu;
            MenuItem open,newmi,save,cut,copy;
            CheckboxMenuItem toolbar,layer;

public mymenu()
{
            mb=new MenuBar();
            setMenuBar(mb);
           
            filemenu=new Menu("File");
            editmenu=new Menu("Edit");
            viewmenu=new Menu("View");

            open=new MenuItem("Open");
            newmi=new MenuItem("New");
            save=new MenuItem("Save");
            cut=new MenuItem("Cut");
            copy=new MenuItem("Copy");

            toolbar=new CheckboxMenuItem("Toolbar",true);
            layer=new CheckboxMenuItem("Layer Window",false);

            filemenu.add(open);
            filemenu.add(newmi);
            filemenu.add(save);

            editmenu.add(cut);
            editmenu.add(copy);

            viewmenu.add(toolbar);
            viewmenu.add(layer);

            mb.add(filemenu);
            mb.add(editmenu);
            mb.add(viewmenu);
}

public static void main(String s[])
{
            mymenu mn=new mymenu();
             mn.setSize(new Dimension(500,500));
            mn.setTitle("Menu Bar");
            mn.setVisible(true);
}
}
