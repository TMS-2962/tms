package Utiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {

	/**
	 * This method initializes the Properties object by loading values from a
	 * configuration file. The configuration file contains key-value pairs that
	 * provide settings for the application.
	 * 
	 * @return prop The Properties object containing the loaded values from the
	 *         config file.
	 */
	public static Properties intailzeProperties() {
		// Create a Properties object to hold configuration key-value pairs
		Properties prop = new Properties();
		// Define the file path for the config file based on the current project
		// directory
		// The config file is expected to be at:
		// /src/test/resources/TMSConfig/config.properties
		File profile = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TMSConfig\\config.properties");

		try {
			// Open the config file for reading using a FileInputStream
						FileInputStream fis = new FileInputStream(profile);

			// Load the contents of the config file into the Properties object
			prop.load(fis);
		} catch (Throwable e) {
			// If an error occurs while reading the config file, print the stack trace
			e.printStackTrace();
		}

		// Return the Properties object containing the loaded configuration
		return prop;
	}
}
