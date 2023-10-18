public class testgarbage
{
	public void finalize(){System.out.println("Jai shree Ram !!  ");}
	public static void main(String[] args)
	{
		testgarbage s1=new testgarbage();
		testgarbage s2=new testgarbage();
		s1=null;
		s2.finalize();
		System.gc();
		System.out.println("shubham");
	}
}