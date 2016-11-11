/*Answer: 
 * Thread A begins
Thread B begins
Thread A ends
Thread B ends
shared =1
shared =2
shared =3
shared =4
shared =5
shared =6
shared =7
shared =8
shared =9
shared =10
shared =11
shared =12
shared =13
shared =14
shared =15
shared =16
shared =17
shared =18
shared =19
shared =20
shared =19
shared =18
shared =17
shared =16
shared =15
shared =14
shared =13
shared =12
shared =11
shared =10
shared =9
shared =8
shared =7
shared =6
shared =5
shared =4
shared =3
shared =2
shared =1
shared =0
Thread Ti finished, the value of shared is now <value>.*/

//Comment: change the codes provided to java codes.








public class ThreadTwo {
	
	public static void main(String args[]) throws InterruptedException{
		
		int shared=0;
		int local_1;
		int local_2;
		int amount_1=1;
		int amount_2=-1;

		ThreadEx T1 = new ThreadEx("A");
		

		ThreadEx T2 = new ThreadEx("B");
		
		T1.start();
		T2.start();

		T1.join();
		T2.join();
		
		
		for (int i=0;i<20;i++){
			
			local_1=shared;
			
			T1.sleep((long)(Math.random()*500));
			shared=local_1+amount_1;
			System.out.println("shared =" + shared);
			T1.sleep((long)(Math.random()*500));
			
		}
		for (int i=0;i<20;i++){
			
			local_2=shared;
			
			T2.sleep((long)(Math.random()*500));
			shared=local_2+amount_2;
			System.out.println("shared ="+shared);
			T2.sleep((long)(Math.random()*500));
			
		}
		System.out.println("Thread Ti finished, the value of shared is now <value>.");

		
	}
	
	
	
	

}





