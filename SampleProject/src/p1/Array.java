package p1;

public class Array {
	
	int arr1[],arr2[],arr3[];

		public void showArraySample()
		
		{
			int i,j,k; 
			arr1=new int[10];
			arr2=new int[10];
			arr3=new int[10];
			System.out.println("Array of i");

			for(i=0;i<10;i++)
			{
				arr1[i]=i+0;
				System.out.print(arr1[i]+"\t");
			}
			
			for(j=0;j<10;j++)
			{
				arr2[j]=j+0;
				System.out.print(arr2[j]+"\t");
			}
			for(i=0;i<10;i++)
			{
				for(i=j=k=0;k<10;i++,j++,k++)
				{
					arr3[k]=arr1[i]+arr2[j];
					System.out.println(arr3[k]);

				}
			}
		}

		public static void main(String[] args)
		{
			Array a1=new Array();
			a1.showArraySample();
		}
	}


