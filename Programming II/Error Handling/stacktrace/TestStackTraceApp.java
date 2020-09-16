package stacktrace;

public class TestStackTraceApp
{
	public static void main(String [] args)
	{
		new TestStackTrace();
	}
}

/* STACK TRACE
Exception in thread "main" java.lang.ArithmeticException: / by zero
at stacktrace.TestStackTrace.divideByZero(TestStackTrace.java:11)
at stacktrace.TestStackTrace.<init>(TestStackTrace.java:7)
at stacktrace.TestStackTraceApp.main(TestStackTraceApp.java:7)
*/