import java.text.DecimalFormat;

public class DecimalFormatExample
{
	public static void main(String[] args)
	{
		double value = 7.10/5.03;
		
		System.out.println(value);
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println(formatter.format(value));
		
	}
}