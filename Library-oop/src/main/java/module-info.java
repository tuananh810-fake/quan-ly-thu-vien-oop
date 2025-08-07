module com.example.libary {
    // Khai báo rằng module này cần dùng thư viện javafx.controls
    requires javafx.controls;

    // Khai báo rằng module này cần dùng thư viện javafx.fxml
    requires javafx.fxml;

    // Mở package của bạn cho thư viện javafx.fxml để nó có thể truy cập vào HelloController
    opens com.example.libary to javafx.fxml;

    // Xuất khẩu (exports) package chính để JavaFX có thể khởi chạy ứng dụng
    exports com.example.libary;
}