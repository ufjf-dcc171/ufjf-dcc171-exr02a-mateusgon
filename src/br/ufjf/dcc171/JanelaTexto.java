package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaTexto extends JFrame {
        private final JLabel etiqueta;
        private final JLabel etiqueta2;
        private final JLabel etiqueta3;
        private final JTextField texto;
        private final JTextField texto2;
        private int n1;
        private int n2;
        
        public JanelaTexto () throws HeadlessException
        {
            super("Soma de dois números");
            setLayout (new FlowLayout(FlowLayout.CENTER));
            
            etiqueta = new JLabel ("Valor 1: ");
            texto = new JTextField(10);
            
            etiqueta2 = new JLabel ("Valor 2: ");
            texto2 = new JTextField(10);
            
            add(etiqueta);
            add(texto);
            add(etiqueta2);
            add(texto2);
            
            etiqueta3 = new JLabel("");
            add(etiqueta3);    
            
            texto.addActionListener(new Numero1Enter());
            texto2.addActionListener(new Numero2Enter());
            
                    
            
            
        }

    private class Numero2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(texto2.getText());
            etiqueta3.setText ("O resultado é: "+ (n1 + n2));
        }
    }

    private class Numero1Enter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(texto.getText());
            texto2.requestFocus();
            
        }
    }
        
}
