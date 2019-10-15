
public class Triangulo
{
  Punto p1,p2,p3;
  Color lineas,relleno;
  
   public Triangulo(){ 
   Punto p1 = new Punto();
   Punto p2 = new Punto();
   Punto p3 = new Punto();
   
   Color lineas = new Color();
   Color relleno = new Color();
}
    public Punto darPunto1(){
    return p1;
    }
    
    public Punto darPunto2(){
    return p2;
    }
    
    public Punto darPunto3(){
    return p3;
    }
    
    public Color darLineas(){
    return lineas;
    }
    public Color darRelleno(){
    return relleno;
    }
    
}