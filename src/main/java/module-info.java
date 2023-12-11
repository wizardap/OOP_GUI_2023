module uet.gui.messageui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens uet.gui.messageui to javafx.fxml;
    exports uet.gui.messageui;
}