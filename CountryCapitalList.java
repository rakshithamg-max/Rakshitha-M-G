 package prog5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private JLabel resultLabel;

    public CountryCapitalList() {

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Singapore");

        countryList = new JList<>(listModel);

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Singapore", "Singapore");

        resultLabel = new JLabel("Select a country");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    String capital = capitalMap.get(selectedCountry);

                    resultLabel.setText("Capital: " + capital);
                }
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(countryList), BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);

        setTitle("Country and Capital");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
