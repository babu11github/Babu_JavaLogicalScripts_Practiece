package com.java.controlstmts;

public class NestedLabeledLoop {

	public static void main(String[] args) {
	 l1:
     for(int i=0;i<=3;i++)
     {
    	l2:
    	for(int j=0;j<=0;j++)
    	{
    		if(i==4&&j==4);
    		{
    		break l2;
    		}
      }

	}

}
}