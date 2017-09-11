//Author: Ovidio Castillo
//@TicTacToe
//Purpose: To display a completed TicTacToe board with a line across XXX
// License:@GNU

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JApplet;
public class TicTac extends JApplet {
    public void paint(Graphics canvas){
       canvas.drawLine(450, 0, 0, 0);  //Left to right line
       canvas.drawLine(0, 0,0,450);    //up and down left side
       canvas.drawLine(450,450,0,450); //Bottom left to right
       canvas.drawLine(450,0,450,450); //Right up and down line
       canvas.drawLine(150,450,150,0);  //first line down
       canvas.drawLine(300,450,300,0);   //second line down
       canvas.drawLine(450,150,0,150);   //first line sideways
       canvas.drawLine(450,300,0,300);   //second line sideways
       canvas.drawLine(400,75,50,75);    //strike on x line
       canvas.drawLine(150,150,0,0);  //right line of x on first square
       canvas.drawLine(0,150,150,0); //left line of first x
       canvas.drawLine(150,0,300,150); //middle x left to right
       canvas.drawLine(150,150,300,0); //middle x right to left
       canvas.drawLine(300,150,450,0); //last x on right right to left
       canvas.drawLine(300,0,450,150); //last x left to right
       canvas.drawLine(150,450,300,300); //middle bottom x left to right
       canvas.drawLine(150,300,300,450); //middle x right to left
       canvas.drawOval(180,180,100,100); //center circle
       canvas.drawOval(320,320,100,100); //Right bottom corner circle
       canvas.drawOval(320,180, 100,100);  //middle right circle
       canvas.drawOval(20,180,100, 100);  //middle circle left
       canvas.drawOval(20, 320,100,100);   //left bottom corner circle
   }

}

