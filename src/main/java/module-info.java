module com.oop.groupfive.summer25_section1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.jfr;


    opens com.oop.groupfive.summer25_section1 to javafx.fxml;

    opens mainpkg.com.oop.groupfive.summer25_section1.Bandhan to javafx.fxml, java.base;
    opens mainpkg.com.oop.groupfive.summer25_section1.Nishat to javafx.fxml, java.base;
    opens mainpks.mainpkg.com.oop.groupfive.summer25_section1.Shemanto to javafx.fxml, java.base;
    opens mainsmainpkg.com.oop.groupfive.summer25_section1.Shishir to javafx.fxml, java.base;

    exports com.oop.groupfive.summer25_section1;
}