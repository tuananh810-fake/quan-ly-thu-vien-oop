module org.example.libraryoop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.libraryoop to javafx.fxml;
    exports org.example.libraryoop;
}