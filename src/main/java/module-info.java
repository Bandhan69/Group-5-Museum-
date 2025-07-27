module com.oop.groupfive.summer25_section1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.groupfive.summer25_section1 to javafx.fxml;
    exports com.oop.groupfive.summer25_section1;
}