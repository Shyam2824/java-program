class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public boolean issquare(){
        if(length==breadth){
            return true;
        }else{
            return false;
        }
    }
}
public class Rectangles {
    public static void main(String arg []){
        Rectangle r= new Rectangle();
          r.length=45;
        r.breadth=78;
        
         
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.issquare());
    }
    
}
