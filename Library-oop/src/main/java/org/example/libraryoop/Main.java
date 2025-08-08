package org.example.libraryoop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Tải file FXML (giao diện)
            // Lưu ý đường dẫn đến file .fxml của bạn trong thư mục resources
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            // Tạo một Scene với nội dung từ file FXML
            Scene scene = new Scene(root);

            // Thiết lập tiêu đề cho cửa sổ
            primaryStage.setTitle("Quản Lý Thư Viện");
            primaryStage.setScene(scene);

            // Hiển thị cửa sổ
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Khởi chạy ứng dụng JavaFX
        launch(args);
    }
}