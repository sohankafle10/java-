public class Calcu
 {
    public int cube(int n)
 {
        
            return n*n*n;
    
         
    }

    public static void main(String[] args) 
{
  Calcu c = new Calcu();
  c.cube(3);

  System.out.println(c.cube(3));
    }
}