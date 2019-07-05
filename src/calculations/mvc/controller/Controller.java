package calculations.mvc.controller;

import calculations.mvc.model.Data;
import calculations.mvc.model.DataHolder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Controller {
    private static Controller instance = new Controller();

    private Controller() {
    }

    public static Controller getInstance() {
        return instance;
    }

    public ObservableList<Data> getObservableData() {
        return FXCollections.observableList(DataHolder.getInstance().getData());
    }
}
