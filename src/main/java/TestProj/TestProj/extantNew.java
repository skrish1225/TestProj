/*package TestProj.TestProj;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;



public class extantNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("pehalaReport.html");
		//ExtentAventReporter avent = new ExtentAventReporter("C:\\Users\\krishnas5\\eclipse-workspace\\TestProj");
		//ExtentKlovReporter klov = new ExtentKlovReporter("TestProj", "build");
		htmlReporter.loadXMLConfig("html-config.xml");

		ExtentReports extent = new ExtentReports();
		
		//klov.initMongoDbConnection("localhost",27017);
		//klov.setProjectName("Krishna Project");
		//klov.setReportName("My First Klov Report");
		//klov.initKlovServerConnection(url)
		
		//extent.attachReporter(avent);
		//extent.attachReporter(klov);

		extent.setAnalysisStrategy(AnalysisStrategy.TEST);


		extent.attachReporter(htmlReporter);
		extent.setAnalysisStrategy(AnalysisStrategy.TEST);
	//	extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
		//http://extentreports.com/docs/versions/4/java/spark-reporter.html
		
		//https://www.youtube.com/watch?v=xmEOE87cABs
		//https://www.swtestacademy.com/klov-extentreports-test-reporting/

		ExtentTest test = extent.createTest("My First Test","Sample Description");
		test.assignCategory("MYCATEGORY");
		test.log(Status.PASS, "Step 1");
		
		//test.pass("<table><tr><td>First</td><td>desc</td></tr></table>");
		
		test.fail("Step 3 - failure");
		test.info("Completed");
		//ExtentTest node = test.createNode("Node");  // level = 1
		
		//node.pass("details");
		
		test = extent.createTest("My second Test","Sample Description");
		test.log(Status.PASS, "Step 1");
		//test.log(Status.PASS, "Step 1");
		test.log(Status.PASS, "Step 1");
		test.log(Status.PASS, "<H1>The DIV element is a block element, and will start on a new line.</H1>");

		extent.flush();
		
	}

}
*/