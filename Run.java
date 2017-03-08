import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Run {

	//A whole bunch of tests and practice
	
	public static void main(String[] args) {	
		Paper[] noteBook = new Paper[100];
		for(int i =0; i<100;i++)
		{
			noteBook[i]=new Paper(i);			
		}
		int[] add= new int[0];
		for(int i=0; i<noteBook.length;i++)
		{
			add=merge(mergeSort(noteBook[i].getData()),add);//combining all the papers		
		}
		ReportCard r = new ReportCard(0,new ArrayList<Double>());
		r.addData(1);
		r.addData(2);
		r.addData(3);
		try{
		doingExceptionStuff();
		}
		catch(ArrayIndexOutOfBoundsException E)
		{
			System.out.println("Array issue");
		}
		catch(Exception E)
		{
			System.out.println("I don't even know what you're trying to do...");
		}
		
	}
	
	public static void doingExceptionStuff() throws Exception
	{
		ArrayList<Integer> a = new ArrayList<>();
		int[] b= new int[0];
		b[0]=8;
		int x = 1/0;	
	}
	
	
	public static int[] mergeSort(int[] data)
	{
		if(data.length>1)
		{
			return merge(mergeSort(Arrays.copyOfRange(data, 0, data.length/2)),mergeSort(Arrays.copyOfRange(data,data.length/2,data.length)));
		}
		else
		{
			return data;
		}
	}
	
	public static int[] merge(int[] data1, int[] data2)
	{
		int[] mergedList= new int[data1.length+data2.length];
		int idx1=0;
		int idx2=0;
		int elem1;
		int elem2;
		while((idx1+idx2)<mergedList.length) //error check for index
		{
			if(idx1>=data1.length)
			{
				elem2=data2[idx2];
				mergedList[idx1+idx2]=elem2;
				idx2++;
			}
			else if(idx2>=data2.length)
			{
				elem1=data1[idx1];
				mergedList[idx1+idx2]=elem1;
				idx1++;				
			}
			else
			{
				elem1=data1[idx1];
				elem2=data2[idx2];
				if(elem1<elem2&&idx1<data1.length)
				{
					mergedList[idx1+idx2]=elem1;
					idx1++;
				}
				else if(idx2<data2.length)
				{
					mergedList[idx1+idx2]=elem2;
					idx2++;
				}
			}
		}
		return mergedList;
	}	
}