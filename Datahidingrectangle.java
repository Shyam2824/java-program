
class Rectangle{
    private int length;
    private int breadth;
   
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
    public void setlength(int l){
        length=l;
    }
    public void setbreadth(int b){
        breadth=b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if (length==breadth)
        return true;
        else return false;
    }

}

public class Datahidingrectangle {
    public static void main(String arg[]) {
        
    
    Rectangle r= new Rectangle();
    r.setlength(58);
    r.setbreadth(85);
    System.out.println("area: "+ r.area() );
    System.out.println("perimeter: "+ r.perimeter() );
    System.out.println("Square: "+ r.isSquare() );
    System.out.println("length: " + r.getlength());
    System.out.println("breadth: " + r.getbreadth());

    }
}
