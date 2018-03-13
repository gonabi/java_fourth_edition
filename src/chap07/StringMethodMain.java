/*
문자열 메서드의 사용
*/
//package chap07;

import static java.lang.System.out;


public class StringMethodMain {

	public static void main(String[] args) {
		String str1 = new String("www.na.org");
		String str2 = new String("www.na.org");
		
		out.println("str1의 길이:"+str1.length());
		out.println("str2의 길이:"+str2.length());
		
		out.println("str1.equals(str2): " + str1.equals(str2));
		out.println("str1.compareTo(str2) :" +str1.compareTo(str2));
		
		out.println("str1.concat(str2): "+str1.concat(str2));
		out.println("str1+str2: "+str1+str2);
		
		
		out.println("str1.indexOf(\"na\"): "+str1.indexOf("na"));
		out.println("str1.lastIndexOf(\"o\") : "+str1.lastIndexOf("o"));
		
		out.println("str1.substring(4,10): "+str1.substring(4,10));

		out.println("str1.replace(\"o\",\"t\"): "+str1.replace("o","t"));
		
		
	}// end main()

}

/*
str1의 길이:10
str2의 길이:10
str1.equals(str2): true
str1.compareTo(str2) :0
str1.concat(str2): www.na.orgwww.na.org
str1+str2: www.na.orgwww.na.org
str1.indexOf("na"): 4
str1.lastIndexOf("o") : 7
str1.substring(4,10): na.org
str1.replace("o","t"): www.na.trg
*/