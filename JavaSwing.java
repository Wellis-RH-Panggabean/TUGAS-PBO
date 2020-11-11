package javaswing;
import javax.swing.*;
import java.awt. *;



public class JavaSwing {
    public static void main(String[] args) {
      GUI g = new GUI ();
      JFrame frame = new JFrame();
      
      
      
      
    }
}
    

  class GUI extends JFrame{
    
    final JTextField fnama = new JTextField(10);
    final JTextField dnim = new JTextField(10);
    final JTextField bjurusan = new JTextField(10);
    final JTextField DrnoHP = new JTextField(10);
    
    
    
    JLabel lnama =  new JLabel("Nama Lengkap ");
    JLabel lnim = new JLabel("Nim ");
    JLabel ljurusan = new JLabel ("Jurusan");
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki  = new JRadioButton ("Laki-laki");
    JRadioButton rbperempuan = new JRadioButton ("Perempuan");
    
    JLabel lnoHP = new JLabel ("Nomor HP");
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = {"Islam","Kristen","Katolik","Hindu","Budha","Konghucu"};
    JComboBox cmagama = new JComboBox (namaAgama);
    
    JLabel lhobi = new JLabel("Hobi");
    JCheckBox cbsepakbola = new JCheckBox ("Sepakbola");
    JCheckBox cbbasket = new JCheckBox ("Basket");
    JCheckBox cbtouring = new JCheckBox ("Touring");
    
    
    
    JButton bsave =  new JButton("Save");
    
  

    public GUI(){
        
        setTitle("FORM INPUT DATA MAHASISWA");
        setSize(600,200);
        
        ButtonGroup group = new ButtonGroup ();
        group.add(rblaki);
        group.add(rbperempuan);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lnim);
        add(dnim);
        add(ljurusan);
        add(bjurusan);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lnoHP);
        add(DrnoHP);
        add(lagama);
        add(cmagama);
        add(lhobi);
        add(cbsepakbola);
        add(cbbasket);
        add(cbtouring);
        add(bsave);
        
        
        
        
        lnama.setBounds(10,10,120,20);
        fnama.setBounds(130,10,150,20);
        //lnim.setBounds(10,10,140,20);
        //dnim.setBounds(130,10,150,20);
        //ljurusan.setBounds(10,10,130,20);
        //bjurusan.setBounds(130,10,150,20);
        ljeniskelamin.setBounds(10,35,120,20);
        rblaki.setBounds(130,35,100,20);
        rbperempuan.setBounds(230,35,100,20);
        lnoHP.setBounds(130,40,250,20);
        lagama.setBounds(10,60,150,20);
        cmagama.setBounds(130,60,150,20);
        lhobi.setBounds(10,80,120,20);
        cbsepakbola.setBounds(130,85,100,20);
        cbbasket.setBounds(230,85,150,20);
        cbtouring.setBounds(130,85,100,20);
        bsave.setBounds(190,130,160,25);
       
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    

}
}

