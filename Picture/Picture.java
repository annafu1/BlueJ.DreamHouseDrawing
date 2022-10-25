
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square wall3;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square door;
    private Square door2;
    private Square door3;
    private Square door4;
    private Square mat;
    private Square mat2;
    private Triangle roof;
    private Triangle tree;
    private Triangle tree2;
    private Square stump;
    private Square stump2;
    private Circle sun;
    private Circle half;
    private Circle knob;
    private Circle snow;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(100);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(100);
        wall2.changeSize(200);
        wall2.makeVisible();
        
        wall3 = new Square();
        wall3.moveVertical(100);
        wall3.changeSize(230);
        wall3.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(150);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(40);
        window2.moveVertical(150);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("white");
        window3.moveHorizontal(150);
        window3.moveVertical(150);
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeColor("white");
        window4.moveHorizontal(170);
        window4.moveVertical(150);
        window4.makeVisible();
        
        door = new Square();
        door.changeColor("brown");
        door.moveHorizontal(90);
        door.moveVertical(300);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("brown");
        door2.moveHorizontal(100);
        door2.moveVertical(280);
        door2.makeVisible();
        
        door3 = new Square();
        door3.changeColor("brown");
        door3.moveHorizontal(100);
        door3.moveVertical(300);
        door3.makeVisible();
        
        door4 = new Square();
        door4.changeColor("brown");
        door4.moveHorizontal(120);
        door4.moveVertical(300);
        door4.makeVisible();

        roof = new Triangle();
        roof.changeSize(100, 350);
        roof.moveHorizontal(100);
        roof.moveVertical(90);
        roof.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(200, 50);
        tree.moveHorizontal(430);
        tree.moveVertical(170);
        tree.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeColor("green");
        tree2.changeSize(200, 50);
        tree2.moveHorizontal(370);
        tree2.moveVertical(170);
        tree2.makeVisible();
        
        stump = new Square();
        stump.changeColor("brown");
        stump.moveHorizontal(425);
        stump.moveVertical(295);
        stump.makeVisible();
        
        stump2 = new Square();
        stump2.changeColor("brown");
        stump2.moveHorizontal(365);
        stump2.moveVertical(295);
        stump2.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(350);
        sun.moveVertical(0);
        sun.changeSize(100);
        sun.makeVisible();
        
        
        half = new Circle();
        half.changeColor("brown");
        half.moveHorizontal(120);
        half.moveVertical(299);
        half.changeSize(50);
        half.makeVisible();
        
        half = new Circle();
        half.changeColor("brown");
        half.moveHorizontal(110);
        half.moveVertical(299);
        half.changeSize(50);
        half.makeVisible();
        
        knob = new Circle();
        knob.changeColor("yellow");
        knob.moveHorizontal(120);
        knob.moveVertical(320);
        knob.changeSize(10);
        knob.makeVisible();
        
        mat = new Square();
        mat.changeColor("yellow");
        mat.moveHorizontal(90);
        mat.moveVertical(330);
        mat.makeVisible();
        
        mat2 = new Square();
        mat2.changeColor("yellow");
        mat2.moveHorizontal(120);
        mat2.moveVertical(330);
        mat2.makeVisible();
        
        snow = new Circle();
        snow.changeColor("white");
        snow.moveHorizontal(320);
        snow.moveVertical(290);
        snow.changeSize(40);
        snow.makeVisible();
        
        snow = new Circle();
        snow.changeColor("black");
        snow.moveHorizontal(320);
        snow.moveVertical(300);
        snow.changeSize(10);
        snow.makeVisible();
        
        snow = new Circle();
        snow.changeColor("black");
        snow.moveHorizontal(340);
        snow.moveVertical(300);
        snow.changeSize(10);
        snow.makeVisible();
        
        snow = new Circle();
        snow.changeColor("white");
        snow.moveHorizontal(310);
        snow.moveVertical(320);
        snow.changeSize(60);
        snow.makeVisible();
        
        snow = new Circle();
        snow.changeColor("white");
        snow.moveHorizontal(300);
        snow.moveVertical(360);
        snow.changeSize(80);
        snow.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("orange");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("white");
            sun.changeColor("yellow");
        }
    }

}
