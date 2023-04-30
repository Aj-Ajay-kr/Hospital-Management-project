import .io.*;
class CreatFile
{
	public static void main(String[] args) 
	{
		File f=new File("C:\\Users\\yadaw\\Desktop\\new\\ajay.txt");
	     try 
	     {
            if(f.Create NewFile())
		      {
			     System.out.print("file successfully createted......!");
		      }
		     else 
		      {
			    System.out.print("file Already Exit......!");
		      }
	     }
	     catch(IOException i)
	     {
             System.out.print("Exception Handaled......!");
	     }

	}
}