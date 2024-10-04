package string;

public class P25 {

	public static void main(String[] args) {

		String s1 = "hello WORLD";
		String s2 = "	Java Programming	";
		String s3 = "heLlo wOrld";
		String s4 = "     ";
		String s5 = "";
		
		System.out.println("charAt: " + s1.charAt(9));
		
		System.out.println("length: " + s2.length());
		
		System.out.println("equals: " + s1.equals(s3));
		
		System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s3));
		
		System.out.println("trim: "+ s2.trim());
		
		System.out.print("toCharArray: " );
		char[] str = s3.toCharArray();
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
				
		System.out.println();
		System.out.println("toLowerCase: " + s1.toLowerCase());

		System.out.println("toUpperCase: " + s1.toUpperCase());
		
		System.out.print("split: ");
		String[] str2 = s2.split(" ");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i] + " ");
		}
		
		System.out.println();
		System.out.println("replace: " +s2.replace('a', '@'));
		
		System.out.println("replace: " + s2.replace("Java","Basic Java"));
		
		System.out.println("indexOf: " + s3.indexOf('l'));
		
		System.out.println("indexOf: " + s3.indexOf('l', 4));
		
		System.out.println("lastIndexOf: " + s3.lastIndexOf('o'));
		
		System.out.println("lastIndexOf: " + s3.lastIndexOf('l', 5));
		
		System.out.println("substring: " + s1.substring(3));
		
		System.out.println("substring: " + s2.substring(3, 8));
		
		System.out.println("startsWith: " + s1.startsWith("he"));
		
		System.out.println("endsWith: " + s1.endsWith("RLD"));
		
		System.out.println("contains: " + s2.contains("Java"));
		
		System.out.println("isBlank: " + s4.isBlank());
		
		System.out.println("isEmpty: " + s4.isEmpty() );
		
		System.out.println("compareTo: " + s1.compareTo(s3));
		
		System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s3));
		
		System.out.println("concat: " + s1.concat(s2));
		
		System.out.println("strip: " + s2.strip());
		
		System.out.println("repeat: " + s3.repeat(3));
	}

}
