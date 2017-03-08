import java.util.*;
public class ReportCard extends PersonReport implements Report<ArrayList<Double>>{
	//Thjs isn't actually supposed to look like a report card.
	//A real one would obviously include student objects and course objects
	//This file only serves to showcase implementing an interface
	
	private int GPA;
	private ArrayList<Double> grades;
	
	public ReportCard(int ID, ArrayList<Double> grades)
	{
		super(ID);
		this.grades=grades;
	}
	
	
	private void findGPA()
	{
		GPA=0;
		if(grades.size()>0)
		{
			for(int i =0; i<grades.size();i++)
			{
				GPA+=grades.get(i);
			}
			GPA/=grades.size();
		}
	}
	
	public boolean isValid()
	{
		findGPA();
		return GPA>2;
	}
	
	public void addData(double data)
	{
		grades.add(data);
	}
	

	public ArrayList<Double> getData()
	{
		return grades;
	}
	
	public void deleteData(double data)
	{
		grades.remove(data);
	}

}
