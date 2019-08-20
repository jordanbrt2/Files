package pratice;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
			for(i=1;i<=5;++i)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.println("i: " + i + ", j: " + j);
				
			}
		}
			System.out.println("-------------------");
			
			int a,b;
			for(a=2;a<=6;++a)
		{
			for(b=1;b<a+1;++b)
			{
				System.out.println("a: " + a + ", b: " + b);
				
			}
		}
			System.out.println("-------------------");
			
			int c,d;
			for(c=1;c<=5;c+=2)
		{
			for(d=1;d<c+1;++d)
			{
				System.out.println("c: " + c + ", d: " + d);
				
			}
		}
			System.out.println("-------------------");
			
			int e,f;
			for(e=1;e<7;e= e+2)
			 
			
		{
			for(f=1;f<e+1;f=f+2)
			{
				System.out.println("e: " + e + ", f: " + f);
				
			}
		}
			
			


	}

}
