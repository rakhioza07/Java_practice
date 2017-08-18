package com.corejava.annotation;
import java.lang.reflect.*;

public class CustomAnnotationTest {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
			Car car=new Car();
			Class<?> cls=car.getClass();
			Method []methods=cls.getMethods();
			for(Method method: methods)
			{
				Getter get=method.getDeclaredAnnotation(Getter.class);
				if(get!= null)
				{
					String name=method.getName();
					if(name.matches("^get[A-Z].*"))
					{
						String fieldName=name.substring(3,4).toLowerCase()+name.substring(4);
						Field f=null;
						try
						{
							f=cls.getDeclaredField(fieldName);
						}
						catch(java.lang.NoSuchFieldException e)
						{}
						if(f!=null)
						{
							Class<?> type=method.getReturnType();
							if(type==f.getType() && method.getParameters().length==0)
							{
								System.out.println("Correct annotation : "+method);
							}
							else
							{
								System.out.println("Incorrect annotation (unmatching type or parameters): "+ method);
								continue;
							}
						}
						else
						{
							System.out.println("Incorrect annotation (no such field):"+ method);
							continue;
						}
					}
					else
					{
						System.out.println("Incorrect annotation (incorrect name): "+ method);
					}
				}
			}
	}

}

class Car
{
	 int modelNo;
	 @Getter
		public int getModelNo()
		{
			return modelNo;
		}
	 @Getter
		public int getmodelNo()
		{
			return 0;
		}
	 @Getter
		public int getNo()
		{
			return modelNo;
		}
	
}