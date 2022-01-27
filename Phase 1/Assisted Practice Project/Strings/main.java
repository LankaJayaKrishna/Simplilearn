public class main {

	public static void main(String[] args) {
		String sl=new String("vijayawada");
		System.out.println("lenght of the string"+" " + sl.length());

		//substring
		String sub=new String("jaya krishna");
		System.out.println("substring of jaya krishna="+" "+sub.substring(5));

		//String Comparison
		String s1="ja";
		String s2="java";
		System.out.println("comparison between ja and java  "+s1.compareTo(s2));

		//IsEmpty
		String s4="abc";
		System.out.println("empty or not   " +s4.isEmpty());

		//toLowerCase
		String s5="INDIA";
		System.out.println("into lowercase= "+s5.toLowerCase());
		
		//replace
		String s6="jova";
		String replace=s6.replace('o', 'a');
		System.out.println("replacing jova into "+(replace));

		//equals
		String x="HoPe";
		String y="hope";
		System.out.println(x.equals(y));
 
		System.out.println("\n");

		System.out.println("StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to the Project, ");
		s.append("good luck!");
		System.out.println(s);

		//insert method
		s.insert(0, "Hello,");
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 5, "Hlo");
		System.out.println(sb);

		//delete method
		sb.delete(1, 3);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("StringBuilder");
		StringBuilder sb1=new StringBuilder("jaya ");
		sb1.append("krishna");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 5));

		System.out.println(sb1.insert(7, "lanka"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		String str = "java"; 
		
        // conversion from String object to StringBuffer 
		System.out.println("Conversion of Strings to StringBuffer");
		StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
        
		
        // conversion from String object to StringBuilder 
        
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("program"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}
