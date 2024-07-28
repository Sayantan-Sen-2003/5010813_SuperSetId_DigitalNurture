public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Load and display image1
        System.out.println("First call to display image1:");
        image1.display();
        System.out.println();

        // Display image1 again (should be faster)
        System.out.println("Second call to display image1:");
        image1.display();
        System.out.println();

        // Load and display image2
        System.out.println("First call to display image2:");
        image2.display();
        System.out.println();

        // Display image2 again (should be faster)
        System.out.println("Second call to display image2:");
        image2.display();
    }
}

// output:
// First call to display image1:
// Loading image from disk: image1.jpg
// Displaying image: image1.jpg

// Second call to display image1:
// Displaying image: image1.jpg

// First call to display image2:
// Loading image from disk: image2.jpg
// Displaying image: image2.jpg

// Second call to display image2:
// Displaying image: image2.jpg