package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer comp01 = new Computer(); // default constructor initialized.
		Computer comp02 = new Computer("Apple", "MacBook Air", "MacOSMojave", 800, 'A', false); // parameterized
																								// constructor01
																								// initialized.
		Computer comp03 = new Computer("Dell", "XPS", "Windows", 799, 'B', false);

	}
}
