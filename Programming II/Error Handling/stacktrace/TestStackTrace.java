package stacktrace;

public class TestStackTrace
{
	TestStackTrace()
	{
		divideByZero();
	}
	int divideByZero()
	{
		return 25/0;
	}
}
