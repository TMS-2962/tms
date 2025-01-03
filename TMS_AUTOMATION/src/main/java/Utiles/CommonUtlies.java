package Utiles;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CommonUtlies {
	public static final int IMPLICIT_WAIT_TIME = 10;
	public static final int PAGE_LOAD_TIME = 15;
	public static final int EXPLICIT_WAIT_BASIC_TIME = 60;
	String apiKey = "b6sxJfWcsDWs5lw9l0CYd31ZdqD74LRQ";
	String serverId = "61xg8nhr";
	String serverDomain = "61xg8nhr.mailosaur.net";

	public String getRandomEmailForPrivateSeactor() {
		return "TMSuyog" + System.currentTimeMillis() + "@" + serverDomain;

	}

	public String generateRandomArabicNameForRegistration() {
		// Lists of sample first, middle, and last names in Arabic (Arabic script)
		String[] firstNames = { "أحمد", "فاطمة", "علي", "أمينة", "محمد", "ليلى", "عمر", "ياسمين", "حسن", "نورة" };
		String[] middleNames = { "محمد", "أمينة", "علي", "إبراهيم", "عبدالله", "زينب", "حسن", "خالد", "سامي", "رانية" };
		String[] lastNames = { "الفارسي", "السيد", "المنصور", "الزهراني", "الحربي", "الرشيد", "الشمري", "الجابري",
				"القاضي", "النعيمي" };

		// Initialize Random object
		Random random = new Random();

		// Generate random indices for first, middle, and last names
		String firstName = firstNames[random.nextInt(firstNames.length)];
		String middleName = middleNames[random.nextInt(middleNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];

		return firstName + " " + middleName + " " + lastName;
	}

	public String generateRandomEnglishNameForRegistraion() {
		// Lists of sample first, middle, and last names
		String[] firstNames = { "John", "Jane", "Robert", "Alice", "Michael", "Emily", "James", "Sarah", "David",
				"Laura" };
		String[] middleNames = { "William", "Grace", "James", "Marie", "Elizabeth", "Michael", "Ann", "Eve", "Thomas",
				"Louise" };
		String[] lastNames = { "Smith", "Doe", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Taylor", "Anderson",
				"Thomas" };

		// Initialize Random object
		Random random = new Random();

		// Generate random indices for first, middle, and last names
		String firstName = firstNames[random.nextInt(firstNames.length)];
		String middleName = middleNames[random.nextInt(middleNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];

		return firstName + " " + middleName + " " + lastName;
	}

	public String generate10DigitNumber() {
		Random rand = new Random();
		// Generate a 10-digit number between 1000000000 and 9999999999
		long number = 1000000000L + (long) (rand.nextDouble() * 9000000000L);
		// Convert the number to a String and return
		return Long.toString(number);
	}

	public String getTextForAddTargetGroupName() {
		Random random = new Random();
		int randomNumber = 10 + random.nextInt(90); // Generates a random number between 10 and 99
		return "TestTMSSuyog" + randomNumber;
	}

	// Method to generate a new unique email
	public String generateEmail() {
		Random random = new Random();
		int randomNumber = 1000 + random.nextInt(9000); // Generates a random number between 1000 and 9999
		return "TestUser" + randomNumber + "@cpt-it.com";
	}

	public String getTextForAddCategoryGroupName() {
		Random random = new Random();
		int randomNumber = 10 + random.nextInt(90); // Generates a random number between 10 and 99
		return "TestTMSSuyog" + randomNumber;
	}

	public String generateRandomThreeDigitNumberForCode() {
		Random random = new Random();
		int randomNumber = 100 + random.nextInt(900); // Generates a random number between 100 and 999
		return "TestCourseIDSuyog" + randomNumber; // Concatenate the random number with the string
	}

	public String generateRandomEnglishName() {
		Random random = new Random();
		int randomNumber = 100 + random.nextInt(900); // Generates a random number between 100 and 999
		return "TestCourseEnglishSuyog" + randomNumber; // Concatenate the random number with the string
	}

	public String generateRandomArabicName() {
		Random random = new Random();
		StringBuilder name = new StringBuilder(10);

		// List of Arabic letters (using their Unicode range or actual Arabic
		// characters)
		String arabicAlphabet = "ا ب ت ث ج ح خ د ذ ر ز س ش ص ض ط ظ ع غ ف ق ك ل م ن ه و ي";

		// Generate 5 random Arabic characters
		for (int i = 0; i < 5; i++) {
			int randomIndex = random.nextInt(arabicAlphabet.length()); // Random index for Arabic letters
			name.append(arabicAlphabet.charAt(randomIndex)); // Append random Arabic letter
		}

		return name.toString();
	}

	public String generateRandomSingleDigitNumber() {
		Random random = new Random();
		int randomNumber = 1 + random.nextInt(9); // Generates a random number between 1 and 9
		return String.valueOf(randomNumber); // Convert the number to a string and return it
	}

	public static String generateRandomStringWithNumber() {
		// Define the prefix
		String prefix = "TMSTestSuyog";

		// Generate a random 2-digit number
		Random random = new Random();
		int randomNumber = random.nextInt(90) + 10; // Random number between 10 and 99

		// Combine the prefix with the random number
		return prefix + randomNumber;
	}

	public static String generateRandomStringforCourseCode() {
		// Generate a random alphanumeric string of length 8
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder randomString = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(characters.length());
			randomString.append(characters.charAt(index));
		}

		// Get the current datetime
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		String datetime = sdf.format(new Date());

		// Return the final formatted string: TestSuyog<datetime>
		return "TestSuyog" + datetime;
	}
}
