package class5;

public class this5 {
	int a ;
	int b ;

   void	add(int a , int b)
	{
	      this.a=a;
	      this.b=b;
	}
   void	add1()
   {
	   System.out.println("this is very good"+(a+b));
   }
	 public static void main(String[] args) {
			this5 ff = new this5();
		   ff.add(2, 3);
		   ff.add1();
		}
	}

