module com.mycompany.mavenjavafx {
    requires javafx.base;
    requires javafx.controls;

    requires transitive javafx.fxml;
    requires transitive javafx.graphics;

    exports com.mycompany.mavenjavafx;
    opens  com.mycompany.mavenjavafx to javafx.fxml;
}
