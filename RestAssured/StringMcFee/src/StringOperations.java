
public class StringOperations {

	public static void main(String[] args) {
		String data = "jitendra.kumar2@gmail.com";

		StringBuffer sb = new StringBuffer();

		char[] emailArray = data.toCharArray();

		for (int i = 0; i < emailArray.length; i++) {
			if (emailArray[i] == '.') {
				sb.append("dot");
				i++;
			}
			sb.append(emailArray[i]);
		}

		System.out.println("Converted String is :" + sb);
	}
}
