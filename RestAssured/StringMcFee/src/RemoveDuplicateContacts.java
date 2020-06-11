import java.util.*;

public class RemoveDuplicateContacts {

	private String name;
	private Long number;
	private Map<String, Long> contacts = new LinkedHashMap();
	private Set<String> uniqueNames = new LinkedHashSet();

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Map addContacts(String name, Long number) {
		contacts.put(name, number);
		return contacts;
	}

	public void printContacts() {

	}

	public static void main(String[] args) {

		RemoveDuplicateContacts rdcs = new RemoveDuplicateContacts();

		String name = null;
		Long number = 0L;
		Map log = null;

		System.out.println("Enter contact details:");

		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			name = sc.nextLine();
			number = sc.nextLong();
			sc.close();
			log = rdcs.addContacts(name, number);
		}

		Set entrySet = log.entrySet();

		// Obtain an Iterator for the entries Set

		Iterator it = entrySet.iterator();

		// Iterate through LinkedHashMap entries

		System.out.println("LinkedHashMap entries : ");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
