module com.boroosku.toast {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires javafx.media;


    opens com.boroosku.toast to javafx.fxml;
    exports com.boroosku.toast;
}