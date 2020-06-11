
public class HashCodeGenerator {
	public static void main(String[] args) throws Exception {
		/* Calculate hashcode
		 * s[0]*31^n-1+s[1]*31^n-2..........s[n]31*^n
		 */
		
		String name = "ABC";
		System.out.println("name: " + name + " & hashcode is : " + name.hashCode());

		int len = 0;
		char[] array = name.toCharArray();
		for (int i = 0; i < array.length; i++) {
			len++;
			if (array[i] == '\0') {
				throw new Exception("String terminator found & strig length is " + len);
			}
		}
	}
}

