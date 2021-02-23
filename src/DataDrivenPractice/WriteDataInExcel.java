package DataDrivenPractice;

public class WriteDataInExcel {

	public static void main(String[] args) throws Throwable {
		Filelib flib = new Filelib();
	    int rc = flib.getRowCount("./data/Book0.xlsx", "invalidlogintest");
		System.out.println(rc);

	}

}
