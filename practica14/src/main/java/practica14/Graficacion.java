package practica14;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.XChartSeriesColors;
import org.knowm.xchart.SwingWrapper;

public class Graficacion {

    public static void main(String[] args) {
        XYChart chart = new XYChartBuilder()
                            .title("Regresión lineal")
                            .width(800)
                            .height(600)
                            .xAxisTitle("X")
                            .yAxisTitle("Y")
                            .theme(ChartTheme.Matlab)
                            .build();
     
        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.GREY));
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.getStyler().setMarkerSize(6);

         try {

         	List <String []> xy = LectorCSV.leer("src/main/resources/315255531.csv");

         	xy = LectorCSV.leer("src/main/resources/315255531.csv");

         }

         catch(Exception e) {
         	System.out.prinln(e);

         	return;
         }

        double[] xData = new double [xy.size()];
        double[] yData = new double [xy.size()];

        int i = 0;

        for(String[] linea: xy) {
        	xData[i] = (double) Double.parseDouble(linea[0]);
        	yData[i] = (double) Double.parseDouble(linea[1]);
        	i ++;

        }

        double sum1 = 0 , sum2 = 0, sum3 = 0, sum4 = 0;

        for (int i = 0;i < xData.length ;i ++ ) {

        	sum1 += xData[i] * yData[i];
        	sum2 += xData[i];
        	sum3 += yData[i];
        	sum4 += xData[i] * xData[i];	
        }

        double m = (xData.length * sum1 - (sum2 * sum3)) / ((xData.length * sum4) - (sum2 * sum2));
        double b = (sum3 - (m * sum2)) / (xData.length);



        XYSeries sampleSeries = chart.addSeries("Observaciones", xData, yData);
        sampleSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
        sampleSeries.setMarkerColor(XChartSeriesColors.RED);

        XYSeries lineSeries = chart.addSeries(
            "Línea", new double[]{18.9, 20.9}, new double[]{84.6, 92.6});
        lineSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Line);
        lineSeries.setLineColor(XChartSeriesColors.BLUE);
        lineSeries.setLineWidth(3);

        new SwingWrapper<XYChart>(chart).displayChart();
    }

}