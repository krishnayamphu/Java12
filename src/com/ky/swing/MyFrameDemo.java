package com.ky.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class MyFrameDemo extends JFrame {
    public MyFrameDemo() {
        initComponents();
    }

    private void initComponents() {
        JProgressBar pgbar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
        pgbar.setValue(50);
        pgbar.setStringPainted(true);
        add(pgbar);

        JTextField tbox = new JTextField(10);
        add(tbox);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                tbox.setText(String.valueOf(slider.getValue()));
                pgbar.setValue(slider.getValue());
            }
        });
        add(slider);

        JSpinner spinner = new JSpinner();
        spinner.setPreferredSize(new Dimension(100, 25));
        add(spinner);

        JFormattedTextField tfbox = new JFormattedTextField();
        try {
            tfbox.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###-####-###")));
            tfbox.setPreferredSize(new Dimension(100, 25));
            add(tfbox);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.HORIZONTAL);
        separator.setPreferredSize(new Dimension(300, 10));
        add(separator);

        JScrollPane scrollPane = new JScrollPane();
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {"Ram", "Ktm"},
                        {"Ram", "Ktm"},
                        {"Ram", "Ktm"},
                        {"Ram", "Ktm"}

                },
                new String[]{
                        "Name", "Address"
                }
        ));
        scrollPane.setViewportView(table);
        scrollPane.setPreferredSize(new Dimension(300,100));
        add(scrollPane);

        JLabel lbl=new JLabel();
        lbl.setIcon(new ImageIcon("./src/com/ky/swing/icon.png"));
        lbl.setPreferredSize(new Dimension(50,50));
        add(lbl);

        pack();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }

        new MyFrameDemo();
    }
}
