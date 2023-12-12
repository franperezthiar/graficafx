package com.graficafx.graficafx;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private AnchorPane pane;

    @FXML
    private PieChart mypiechart;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Java",23),
                        new PieChart.Data("JavaScript", 34),
                        new PieChart.Data("C#",43));
        pieChartData.forEach(data -> data.nameProperty().bind(
                Bindings.concat(
                        data.getName(),"Cantidad",data.pieValueProperty()
                )
        ));
        mypiechart.getData().addAll(pieChartData);
    }
}