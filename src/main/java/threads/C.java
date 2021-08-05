package threads;

public class C {
	 private volatile int COUNTER=0;

	    public static void main(String... q)
	    {
	        new C().call();
	    }

	    public void call()
	    {
	        new A().start();
	        new B().start();
	    }

	    class A extends Thread
	    {
	        public void run()
	        {
	            int i =0;
	            while(i<100)
	            {
	                COUNTER++;
	                System.out.println(" A COUNTER : "+COUNTER+" *** "+"i : "+i);
	                try{
	                    Thread.sleep(50);
	                }
	                catch(Exception e)
	                {

	                }
	                i++;
	            }
	        }
	    }

	    class B extends Thread
	    {
	        public void run()
	        {
	            int i =0;
	            while(i<100)
	            {
	                COUNTER++;
	                 System.out.println(" B COUNTER : "+COUNTER+" *** "+"i : "+i);
	                   try{
	                    Thread.sleep(50);
	                }
	                catch(Exception e)
	                {

	                }
	                i++;
	            } 
	        }
	    }

}
