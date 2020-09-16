import java.util.*;

public class maxHourglassSumProblemOriginal 
{

	public static void main(String[] args) 
	{
		IllegalArgumentException except = new IllegalArgumentException("No Hourglass");
		
		try{
		int[][] a = {{4, 4, 9, 3},
					{10, 3, 5, 1},
					{15, 8, 6, 5}};
		int[][] b = {{20, 2, 4}, //To test just input b into the S.O.Pln statement below
					{4, 11, 5},
					{15, 0, 3},
					{17, 5, 12}};
		int[][] c = {{0,9},  //To test just input c into the S.O.Pln statement below
					{4, 10},
					{1, 8}};
		int[][] d = {{6, 19, 2},  //To test just input d into the S.O.Pln statement below
					{14, 5, 3}};
		int[][] e = {{8, 1, 0, 15},  //To test just input e into the S.O.Pln statement below
					{4, 17, 3, 6},
					{1, 7, 12, 9},
					{0, 20, 2, 13}};
		System.out.println(maxHourglassSum(c));
		
		}
		catch(Exception ex)
		{
			throw except;
		}

	}
	
	public static int maxHourglassSum(int[][] arr) throws Exception
	{
		
		int i = 0;
		int j= 0;
		int max = 0;
		for(i = 0; i < arr.length - 2; i++)
		{
			for(j = 0; j < arr[0].length - 2; j++)
			{
				int v1 = arr[i][j]; 
				int v2 = arr[i][j+1];
				int v3 = arr[i][j+2];
				int v4 = arr[i+1][j+1];
				int v5 = arr[i+2][j];
				int v6 = arr[i+2][j+1];
				int v7 = arr[i+2][j+2];
		
				int sum = v1 + v2 + v3 + v4 + v5 + v6 + v7;
			
				if(sum > max)
				{
					max = sum;
				}
			}
		}
		if(max == 0)
		{
			throw new Exception();
		}
		
		return max;
	}

}
