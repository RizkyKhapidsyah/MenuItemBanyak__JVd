package com.rk.mib;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JMenu IndukMenu;
    JMenuBar PenampungMenu;

    int i;

    public FormUtama() {
        super("Menu Dengan Pilihan Banyak");
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        aturMenu();
        setPreferredSize(new Dimension(400, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void aturMenu() {
        IndukMenu = new JMenu("File");
        IndukMenu.getPopupMenu().setLayout(new GridLayout(0, 4));

        for (i = 0; i < 30; i++) {
            IndukMenu.add(new JMenuItem("File " + (i + 1)));
        }

        PenampungMenu = new JMenuBar();
        PenampungMenu.add(IndukMenu);
        setJMenuBar(PenampungMenu);
    }

}
