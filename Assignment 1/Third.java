
public class Third {

	public static void main(String[] args) {
		
		String str =  "Java String pool refers to collection of Strings which are stored in heap";
			
		String strlower=str.toLowerCase();
		String strupper=str.toUpperCase(); 
		String replaceString=str.replace('a','$'); 
		
		System.out.println(strlower);
		System.out.println(strupper);
		System.out.println(replaceString);
		System.out.println(str.contains("java string pool refers to collection of strings which are stored in heap memory"));
		
		
	}

}
