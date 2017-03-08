import java.util.Random;

public class Paper {
	
	private int[] data;
	private int ID;
	
	public Paper(int ID)
	{
		this.ID=ID;
		generateData();
	}
	
	public int getID()
	{
		return ID;
	}
	
	private void generateData()
	{
		data=new int[100];
		Random rand = new Random();
		for(int i=0; i<100;i++)
		{
			data[i]=rand.nextInt(1000);
		}
	}
	
	public void overWriteData(int[] data)
	{
		this.data=data;
	}
	
	public int getSize()
	{
		return data.length;
	}
	
	public int[] getData()
	{
		return data;
	}
	
	public void showData()
	{
		for(int i =0; i<data.length;i++)
		{
			System.out.println(data[i]);
		}
	}

}
