package hust.soict.hedspi.test.store.StoreTest;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store.*;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", 20.0);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "John", 15.7);

        store.addMedia(dvd1); // Thêm DVD vào cửa hàng
        store.addMedia(dvd2); // Thêm DVD vào cửa hàng
        store.removeMedia(dvd1); // Xóa DVD khỏi cửa hàng
        store.removeMedia(dvd2); // Xóa DVD khỏi cửa hàng
    }
} 