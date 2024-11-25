package AIMSProject.src;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", 20.0);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "John", 15.7);

        store.addDVD(dvd1); // Thêm DVD vào cửa hàng
        store.addDVD(dvd2); // Thêm DVD vào cửa hàng
        store.removeDVD(dvd1); // Xóa DVD khỏi cửa hàng
        store.removeDVD(dvd2); // Xóa DVD khỏi cửa hàng
    }
} 