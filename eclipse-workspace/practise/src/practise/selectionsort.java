package practise;

public class selectionsort {
	public static void selctionsort(int input[]){
		  for(int i=0;i<input.length-1;i++)
		  {
			  int min=input[i];
			  int index=i;
			  for(int j=i+1;j<input.length;j++)
			  {
				  if(input[j]<min)
				  {
					  min = input[j];
					  index=j;
					  
					  
				  }
			  }if(index!=i)
			  {
				  input[index]=input[i];
				  input[i]=min;
			  }
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,6,7,3,9,11,4,1,1,6,7,22,3,45,34,556};
		selctionsort(input);
		for(int i=0;i<input.length;i++)
		{
				System.out.println(input[i]+" ");
		}

	}

}
