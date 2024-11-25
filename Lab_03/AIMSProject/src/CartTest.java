package AIMSProject.src;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
            "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
            "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        
        // Test print cart
        cart.printCart();
        // Test search by ID
        cart.searchById(1);
        cart.searchById(5); // Should show "No match found"
        
        // Test search by title
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("Star"); // Should find "Star Wars"
        cart.searchByTitle("Batman"); // Should show "No match found"
    }
}