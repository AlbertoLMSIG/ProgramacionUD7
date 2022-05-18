module es.albertomarquez.empresaropa {
    
    requires javafx.controls;
    requires javafx.fxml;

    requires java.instrument;
    requires java.persistence;
    requires java.sql;
    
    opens es.albertomarquez.empresaropa.entities;
    opens es.albertomarquez.empresaropa to javafx.fxml;
    exports es.albertomarquez.empresaropa;
}
