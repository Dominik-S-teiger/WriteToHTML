package cz.spsejecna.steiger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String HTML = "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>Page Title</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<ul>\r\n" + 
				"		<li>A1\r\n" + 
				"			<ol type=\"I\">\r\n" + 
				"				<li>A2\r\n" + 
				"			</ol>\r\n" + 
				"					<ul style=\"list-style-type:square;\">\r\n" + 
				"						<li>A3\r\n" + 
				"					</ul>\r\n" + 
				"		</li>	\r\n" + 
				"		<li>B1\r\n" + 
				"			<ol type=\"I\">\r\n" + 
				"				<li>B2\r\n" + 
				"				<li>B2.1\r\n" + 
				"					<ul style=\"list-style-type:square;\">\r\n" + 
				"						<li>B3\r\n" + 
				"					</ul>\r\n" + 
				"			</ol>		\r\n" + 
				"		</li>	\r\n" + 
				"		<li>C1\r\n" + 
				"			<ol type=\"I\">\r\n" + 
				"				<li>C2\r\n" + 
				"			</ol>\r\n" + 
				"		</li>	\r\n" + 
				"		<li>D1\r\n" + 
				"	</ul>	\r\n" + 
				"	\r\n" + 
				"</body>	\r\n" + 
				"</html>	";
		
		File fil = new File("C:\\Program Files\\eclipse\\WorkSpace\\WriteToHTML\\test.html");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fil));
			bw.write(HTML);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(HTML);
	}

}
