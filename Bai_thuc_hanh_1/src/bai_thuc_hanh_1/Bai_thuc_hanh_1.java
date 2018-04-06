package bai_thuc_hanh_1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Bai_thuc_hanh_1 extends Frame{
    Button btnCong,btnTru,btnNhan,btnChia;
    Label lblA, lblB,lblkq,lblCong,lblTru,lblNhan,lblChia;
    TextField txtA, txtB,txtkq;
    public Bai_thuc_hanh_1() {
        setTitle("Bai 1");
        setSize(400,200);
        FlowLayout lay =  new FlowLayout();
        setLayout(lay);
    
        //GAN VAO FRAME 
        lblA = new Label("A");
        add(lblA);
        txtA = new TextField(20);
        add(txtA);
        
        lblB = new Label("B");
        add(lblB);
        txtB = new TextField(20);
        add(txtB);
        
        btnCong = new Button("+");
        btnCong.addActionListener(new LangNgheCong());
        add(btnCong);
        
        btnTru = new Button("-");
        btnTru.addActionListener(new LangNgheTru());
        add(btnTru);
        
        btnNhan = new Button("*");
        btnNhan.addActionListener(new LangNgheNhan());
        add(btnNhan);
        
        btnChia = new Button("/");
        btnChia.addActionListener(new LangNgheChia());
        add(btnChia);
        
        lblkq = new Label("Ket qua");
        add(lblkq);
        txtkq = new TextField(20);
        add(txtkq);
        
        Sukiencuaso BoLangNghe = new  Sukiencuaso();
        addWindowListener(BoLangNghe);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Bai_thuc_hanh_1();
    }
    
    //Xay dung lop noi xu li cac su kien cua so
    class Sukiencuaso implements WindowListener{

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
        }

        @Override
        public void windowOpened(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | emplates
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
     class LangNgheCong  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính tổng
           int Cong = a+b;
           // Xuất
           txtkq.setText(String.valueOf(Cong));
       }
    }
     
     class LangNgheTru  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính tổng
           int Tru = a-b;
           // Xuất
           txtkq.setText(String.valueOf(Tru));
       }
    }
     class LangNgheNhan  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính tổng
           int Nhan = a*b;
           // Xuất
           txtkq.setText(String.valueOf(Nhan));
       }
    }
    
     class LangNgheChia  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính tổng
           int Chia = a/b;
           // Xuất
           txtkq.setText(String.valueOf(Chia));
       }
    }
}
