public class Factori
 {
    public int fact(int n)
 {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) 
{
  Factori f = new Factori();
  

  System.out.println(f.fact(5));
    }
}