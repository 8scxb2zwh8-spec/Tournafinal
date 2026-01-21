package lastttt;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Date;

public class CreateTournamentFrame extends JFrame {

    private double chosenLat = Double.NaN;
    private double chosenLon = Double.NaN;

    // NORMAL CREATE MODE
    public CreateTournamentFrame(MainFrame parent) {
        this(parent, Double.NaN, Double.NaN);
    }

    // EDIT / VIEW MODE WITH EXISTING LOCATION
    public CreateTournamentFrame(MainFrame parent, double lat, double lon) {
        this.chosenLat = lat;
        this.chosenLon = lon;

        setTitle("Host a Tournament");
        setSize(460, 650);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel root = new JPanel();
        root.setBackground(new Color(255, 248, 240));
        root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));
        root.setBorder(new EmptyBorder(20, 40, 20, 40));
        add(root);

        // ===== TITLE =====
        JLabel title = new JLabel("Host a Tournament", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        root.add(title);
        root.add(Box.createVerticalStrut(25));

        // ===== FORM WRAPPER =====
        JPanel form = new JPanel();
        form.setOpaque(false);
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        form.setAlignmentX(Component.CENTER_ALIGNMENT);
        root.add(form);

        // ===== TOURNAMENT NAME =====
        form.add(centerLabel("Tournament Name"));
        JTextField nameField = field();
        form.add(nameField);

        // ===== DATE + TIME =====
        form.add(Box.createVerticalStrut(15));
        JPanel datePanel = verticalPanel();
        datePanel.add(centerLabel("Date"));

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("MM/dd/yyyy");
        dateChooser.setDate(new Date());
        dateChooser.setMaximumSize(new Dimension(200, 36));
        dateChooser.setAlignmentX(Component.CENTER_ALIGNMENT);
        datePanel.add(dateChooser);

        datePanel.add(Box.createVerticalStrut(8));
        datePanel.add(centerLabel("Time"));

        JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
        timeSpinner.setEditor(new JSpinner.DateEditor(timeSpinner, "hh:mm"));
        timeSpinner.setMaximumSize(new Dimension(90, 36));

        JComboBox<String> ampmBox = new JComboBox<>(new String[]{"AM", "PM"});
        ampmBox.setMaximumSize(new Dimension(70, 36));

        JPanel timeRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 6, 0));
        timeRow.setOpaque(false);
        timeRow.add(timeSpinner);
        timeRow.add(ampmBox);

        datePanel.add(timeRow);
        form.add(datePanel);

        // ===== SPORT =====
        form.add(Box.createVerticalStrut(15));
        form.add(centerLabel("Sport"));

        String[] sports = {
                "Volleyball", "Basketball", "Table Tennis", "Badminton",
                "Cycling", "Tennis", "Baseball", "Swimming", "Arnis"
        };

        JComboBox<String> sportBox = new JComboBox<>(sports);
        sportBox.setMaximumSize(new Dimension(320, 36));
        sportBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        form.add(sportBox);

        // ===== LOCATION NAME =====
        form.add(Box.createVerticalStrut(15));
        form.add(centerLabel("Location Name"));
        JTextField locationField = field();
        form.add(locationField);

        JButton pickLocationBtn = new JButton("Pick Location on Map");
        pickLocationBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

        pickLocationBtn.addActionListener(e -> {
            if (!Double.isNaN(chosenLat) && !Double.isNaN(chosenLon)) {
                new MapFrame(chosenLat, chosenLon);
            } else {
                new MapFrame((lat2, lon2) -> {
                    chosenLat = lat2;
                    chosenLon = lon2;
                });
            }
        });

        form.add(Box.createVerticalStrut(8));
        form.add(pickLocationBtn);

        // ===== DESCRIPTION =====
        form.add(Box.createVerticalStrut(15));
        form.add(centerLabel("Description"));
        JTextArea descArea = new JTextArea(5, 22);
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(descArea);
        scroll.setMaximumSize(new Dimension(320, 140));
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        form.add(scroll);

        // ===== CREATE BUTTON =====
        root.add(Box.createVerticalStrut(30));
        JButton createBtn = new JButton("Create Tournament");
        createBtn.setBackground(new Color(255, 122, 0));
        createBtn.setForeground(Color.WHITE);
        createBtn.setFocusPainted(false);
        createBtn.setFont(new Font("Arial", Font.BOLD, 15));
        createBtn.setPreferredSize(new Dimension(260, 48));
        createBtn.setMaximumSize(new Dimension(260, 48));
        createBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

        createBtn.addActionListener(e -> {
            Date date = dateChooser.getDate();
            String dateStr = (date != null) ? date.toString() : "No Date";

            parent.addTournament(
                    nameField.getText(),
                    dateStr,
                    timeSpinner.getValue().toString() + " " + ampmBox.getSelectedItem(),
                    "All Ages",
                    sportBox.getSelectedItem().toString(),
                    chosenLat,
                    chosenLon
            );
            dispose();
        });

        root.add(createBtn);
        setVisible(true);
    }

    // ===== HELPERS =====

    private JTextField field() {
        JTextField f = new JTextField();
        f.setMaximumSize(new Dimension(320, 36));
        f.setFont(new Font("Arial", Font.PLAIN, 14));
        f.setAlignmentX(Component.CENTER_ALIGNMENT);
        return f;
    }

    private JLabel centerLabel(String text) {
        JLabel l = new JLabel(text, SwingConstants.CENTER);
        l.setFont(new Font("Arial", Font.BOLD, 13));
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        return l;
    }

    private JPanel verticalPanel() {
        JPanel p = new JPanel();
        p.setOpaque(false);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setAlignmentX(Component.CENTER_ALIGNMENT);
        return p;
    }
}
