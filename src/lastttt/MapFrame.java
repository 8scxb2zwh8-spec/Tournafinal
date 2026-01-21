package lastttt;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.function.BiConsumer;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

public class MapFrame extends JFrame {

    private JFXPanel mapPanel;
    private WebView webView;
    private WebEngine engine;
    private JButton pinButton;

    private double selectedLat = Double.NaN;
    private double selectedLon = Double.NaN;

    private BiConsumer<Double, Double> callback;

    // ===== PICKER MODE =====
    public MapFrame(BiConsumer<Double, Double> callback) {
        super("Pick Location");
        this.callback = callback;
        initUI();
        Platform.runLater(this::initPickerMap);
    }

    // ===== VIEWER MODE =====
    public MapFrame(double lat, double lon) {
        super("View Location");
        this.callback = null;
        this.selectedLat = lat;
        this.selectedLon = lon;
        initUI();
        Platform.runLater(() -> initViewerMap(lat, lon));
    }

    private void initUI() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        mapPanel = new JFXPanel();
        add(mapPanel, BorderLayout.CENTER);

        pinButton = new JButton("Pin Location");
        pinButton.setEnabled(false);
        pinButton.addActionListener(e -> {
            if (!Double.isNaN(selectedLat) && !Double.isNaN(selectedLon) && callback != null) {
                callback.accept(selectedLat, selectedLon);
                dispose();
            }
        });

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.add(pinButton);
        add(bottom, BorderLayout.SOUTH);

        setVisible(true);
    }

    // ==========================
    // PICKER MAP
    // ==========================
    private void initPickerMap() {
        webView = new WebView();
        engine = webView.getEngine();

        mapPanel.setScene(new Scene(webView));

        URL url = getClass().getResource("/resources/map.html");
        if (url == null) {
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(this,
                        "map.html not found in /resources folder",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                dispose();
            });
            return;
        }

        engine.load(url.toExternalForm());

        engine.getLoadWorker().stateProperty().addListener((obs, o, n) -> {
            if (n == javafx.concurrent.Worker.State.SUCCEEDED) {
                JSObject window = (JSObject) engine.executeScript("window");
                window.setMember("javaConnector", new JSBridge());
                engine.executeScript("enablePicker();");
            }
        });
    }

    // ==========================
    // VIEWER MAP
    // ==========================
    private void initViewerMap(double lat, double lon) {
        webView = new WebView();
        engine = webView.getEngine();

        mapPanel.setScene(new Scene(webView));

        URL url = getClass().getResource("/resources/map.html");
        if (url == null) {
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(this,
                        "map.html not found in /resources folder",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                dispose();
            });
            return;
        }

        engine.load(url.toExternalForm());

        engine.getLoadWorker().stateProperty().addListener((obs, o, n) -> {
            if (n == javafx.concurrent.Worker.State.SUCCEEDED) {
                engine.executeScript("showLocation(" + lat + "," + lon + ");");
            }
        });
    }

    // ==========================
    // JS BRIDGE
    // ==========================
    public class JSBridge {
        public void onMapClicked(double lat, double lon) {
            selectedLat = lat;
            selectedLon = lon;
            SwingUtilities.invokeLater(() -> pinButton.setEnabled(true));
        }
    }
}
