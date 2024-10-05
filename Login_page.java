package login_page;

import javax.swing.*;
import java.awt.*;

public class Login_page {

    public static void main(String[] args) {
        JFrame muraran = new JFrame(" Login Page??🎶 ");
        JScrollBar scr = new JScrollBar();

        JLabel hg = new JLabel("Username ");
        JLabel yu = new JLabel("Pin ");
        JLabel ho = new JLabel("Hostels ");
        JLabel ct = new JLabel("City ");
        JLabel eu = new JLabel("University");
        JLabel st = new JLabel("Maseno Estates");
        JLabel ge = new JLabel("Gender");
        JTextArea pk = new JTextArea();
        JPasswordField gf = new JPasswordField();
        JFileChooser ch = new JFileChooser();
        JColorChooser col = new JColorChooser();
        
        
        String hostels[] = {"Nyabundi", "Elgon", "Kilinjaro", "Mbakali", "Luanda", "Nyawita", "Diaspora"
        };
        JComboBox ht = new JComboBox(hostels);
        String city[] = {"Kisumu", "Nakuru", "Nairobi", "Eldoret"
        };
        JList oo = new JList(city);
        String university [] ={"Maseno University ","Kenyatta University ","Egerton University ","Dedan Kimathi University ","Multimedia University ","Kirinyaga University "
                               ,"University Of Nairobi","Jommo Kenyatta University ","Moi University ","Masinde Muliro University ","Karatina University "
                               ,"Rongo University ","Kibabii University ","Kaimosi University ","Garissa University ","Kisii University ","Maasai Mara University "
        };
        JComboBox un = new JComboBox(university);
        
        JCheckBox smk = new JCheckBox("Mbwakali ");
        JCheckBox sml = new JCheckBox("Milimani");
        JCheckBox sll = new JCheckBox("Lela");
        JCheckBox sii = new JCheckBox("Paka Kali");
        JCheckBox spp = new JCheckBox("Market");
        JCheckBox sng = new JCheckBox("Mabungo");
        JCheckBox svt = new JCheckBox("Vet");
        JCheckBox snl = new JCheckBox("Niles");
        JCheckBox sri = new JCheckBox("Kefri");
        JCheckBox sny = new JCheckBox("Nyawita");
        
        JRadioButton m = new JRadioButton("Male");
        JRadioButton f = new JRadioButton("Female");
        JRadioButton tg = new JRadioButton("TransGender");
        
        
        hg.setBounds(50, 318, 100, 30);
        yu.setBounds(50, 350, 100, 30);
        pk.setBounds(200, 318, 100, 20);
        gf.setBounds(200, 350, 100, 30);
        ho.setBounds(50, 450, 100, 30);
        ht.setBounds(200, 450, 100, 30);
        ct.setBounds(50, 550, 100, 30);
        oo.setBounds(200, 550, 100, 80);
        eu.setBounds(50, 700, 100, 30);
        un.setBounds(200, 700, 170, 30);
        st.setBounds(50, 800, 100, 30);
        smk.setBounds(200, 800, 100, 30);
        sml.setBounds(300, 800, 100, 30);
        sll.setBounds(200, 830, 100, 30);
        sii.setBounds(300, 830, 100, 30);
        spp.setBounds(200, 860, 100, 30);
        sng.setBounds(300, 860, 100, 30);
        svt.setBounds(200, 890, 100, 30);
        snl.setBounds(300, 890, 100, 30);
        sri.setBounds(200, 920, 100, 30);
        sny.setBounds(300, 920, 100, 30);
        ge.setBounds(50, 970, 100, 30);
        m.setBounds(200, 970, 100, 30);
        f.setBounds(300, 970, 100, 30);
        tg.setBounds(400, 970, 100, 30);
        col.setBounds(400, 350, 500, 400);
        ch.showDialog(ch, null);
        scr.setSize(20,1500);
        
        
        muraran.add(hg);
        muraran.add(yu);
        muraran.add(pk);
        muraran.add(gf);
        muraran.add(ho);
        muraran.add(ht);
        muraran.add(ct);
        muraran.add(oo);
        muraran.add(eu);
        muraran.add(un);
        muraran.add(st);
        muraran.add(smk);
        muraran.add(sml);
        muraran.add(sll);
        muraran.add(sii);
        muraran.add(spp);
        muraran.add(sng);
        muraran.add(svt);
        muraran.add(snl);
        muraran.add(sri);
        muraran.add(sny);
        muraran.add(ge);
        muraran.add(m);
        muraran.add(f);
        muraran.add(tg);
        muraran.add(ch);
        muraran.add(col);
        muraran.add(scr);
      
        muraran.setSize(1000, 1500);
        muraran.setLayout(null);
        muraran.setVisible(true);
        muraran.setLocationRelativeTo(null);
        muraran.setResizable(true);
        muraran.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }
}