package com.java.controlstmts;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		//1.simple for loop
		
		/*for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}

	}

}*/
      //Enhanced for loop(for each loop)
  List<String> l=new ArrayList<String>();
  l.add("babu");
  l.add("siva");
  for(String s:l)
  {
	  System.out.println(s);
  }
	
	
 }
}
