package com.graficafx.graficafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private AnchorPane barpane;

    @FXML
    private AnchorPane linepane;

    @FXML
    private AnchorPane piepane;

    @FXML
    private Tab tabbar;

    @FXML
    private Tab tabline;

    @FXML
    private Tab tabpie;

    @FXML
    private BarChart<?, ?> mybarchart;

    @FXML
    private LineChart<?, ?> mylinechart;

    @FXML
    private PieChart mypiechart;




}