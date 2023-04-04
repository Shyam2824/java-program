class Cirlce{
     double radius;
     Cirlce(double radius) {
        this.radius= radius;
     }
}

public class Constructur {
    
    public static void main(String arg []) {
        
         Cirlce c= new Cirlce(58);
         Cirlce c2= new Cirlce(96);
       
        System.out.println("radius :" +c.radius);
        System.out.println("radius :" +c2.radius);
    }
}
