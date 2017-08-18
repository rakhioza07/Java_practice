package com.corejava.collection;
class Banner
{
	public static void showBanner() {
		StringBuffer s1=new StringBuffer("**  Welcome to Chit Chat Room  **");
		while(true)
		{
			System.out.print("\t\t"+s1+"\r");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			char c=s1.charAt(0);
			s1.deleteCharAt(0);
			s1.insert(s1.length(),""+c+"");
			
		}
	}	
}