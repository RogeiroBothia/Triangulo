import java.awt.*;
import javax.swing.*;

public class Dibujar extends JFrame
{
    // instance variables - replace the example below with your own
    public Triangulo triangulo;

    /**
     * Constructor for objects of class Dibujar
     */
    public Dibujar()
    {
        // initialise instance variables
        super( "Drawing Polygons" );
        setSize( 275, 230 );
        setVisible( true );

    }
    
    public Dibujar(Triangulo triangulo)
    {
        // initialise instance variables

        super( "Drawing Polygons" );
        this.triangulo = triangulo;
        setSize( 275, 230 );
        setVisible( true );

    }

    public void paint( Graphics g )
    {
        super.paint( g ); 

        Polygon polygon1 = new Polygon();
        
        polygon1.addPoint( triangulo.darPunto1().getX(), triangulo.darPunto1().getY() );
        polygon1.addPoint( triangulo.darPunto2().getX(), triangulo.darPunto2().getY() );
        polygon1.addPoint( triangulo.darPunto3().getX(), triangulo.darPunto3().getY() );
        
        
        g.setColor(new java.awt.Color(triangulo.darLineas().getRojo(), triangulo.darLineas().getVerde(), triangulo.darLineas().getAzul()));
        g.drawLine(triangulo.darPunto1().getX(), triangulo.darPunto1().getY(), triangulo.darPunto2().getX(), triangulo.darPunto2().getY());
        g.drawLine(triangulo.darPunto1().getX(), triangulo.darPunto1().getY(), triangulo.darPunto3().getX(), triangulo.darPunto3().getY());
        g.drawLine(triangulo.darPunto3().getX(), triangulo.darPunto3().getY(), triangulo.darPunto2().getX(), triangulo.darPunto2().getY());
        
        g.setColor(new java.awt.Color(triangulo.darRelleno().getRojo(), triangulo.darRelleno().getVerde(), triangulo.darRelleno().getAzul()));
        
        g.fillPolygon(polygon1); 
        
    }
    
    public void repintar(){
        repaint();
    }
    
    /**Metodo de acceso a la propiedad triangulo*/
    public Triangulo getTriangulo(){
        return this.triangulo;
    }//end method getTriangulo

    /**Metodo de modificación a la propiedad triangulo*/
    public void setTriangulo(Triangulo triangulo){
        this.triangulo = triangulo;
    }//end method setTriangulo

}