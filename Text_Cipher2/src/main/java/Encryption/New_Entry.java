package Encryption;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;

/**
 * Servlet implementation class New_Entry
 */
@WebServlet("/New_Entry")
public class New_Entry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String FName = request.getParameter("fname");
		String LName = request.getParameter("lname");
		String SAP = request.getParameter("sap");
		String Course = request.getParameter("course");
		
		final String secretKey = "ssshhhhhhhhhhh!!!!";
		
		String encryptedString_FName = AES.encrypt(FName, secretKey) ;
		String encryptedString_LName = AES.encrypt(LName, secretKey) ;
		String encryptedString_SAP = AES.encrypt(SAP, secretKey) ;
		String encryptedString_Course = AES.encrypt(Course, secretKey) ;
		
		try {
			File FileObje = new File("C:\\Users\\Dell\\Desktop\\java_project\\" + FName + "_" + LName + ".txt");
			
			if(FileObje.createNewFile())
			{
				System.out.println("File created : " + FileObje.getName());
				
				try {
					
					FileWriter WriterObje = new FileWriter("C:\\Users\\Dell\\Desktop\\java_project\\" + FName + "_" + LName + ".txt");	
				    WriterObje.write("First Name :" + encryptedString_FName + "\n");
				    WriterObje.write("last Name  :" + encryptedString_LName + "\n");
				    WriterObje.write("SAP ID     :" + encryptedString_SAP + "\n");
				    WriterObje.write("Course     :" + encryptedString_Course + "\n");
				
				    WriterObje.close();
				    
				    System.out.println("Successfully wrote to the file.");
				}
				
				catch (IOException e) {
				      System.out.println("An error occurred during writing a file.");
				      e.printStackTrace();
				    }
			}
			
			else
			{
				System.out.println("File already exists.");
			}
		}
		
		catch(IOException e)
		{
			System.out.println("An error occured during creating a file.");
			e.printStackTrace();
			
			/*
			 It is a method of Java's throwable class which prints the throwable along with
			 other details like the line number and class name where the exception occurred.
		     printStackTrace() is very useful in diagnosing exceptions.
			 */
		}
		
		request.getSession().setAttribute("fname", encryptedString_FName);
		request.getSession().setAttribute("lname", encryptedString_LName);
		request.getSession().setAttribute("sap", encryptedString_SAP);
		request.getSession().setAttribute("course", encryptedString_Course);
		
		response.sendRedirect("jsp/OutPut.jsp");
	}

}


