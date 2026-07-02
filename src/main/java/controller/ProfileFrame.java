package controller;
import javax.swing.*;import util.JapandiTheme;import java.awt.*;
public class ProfileFrame extends BaseFrame{
 public ProfileFrame(){super("我的帳戶 v2.5",460,720);JPanel p=root();p.add(header("我的帳戶"));p.add(sub("使用者、語言與緊急聯絡設定",48,88,360));
  JPanel card=JapandiTheme.card();card.setLayout(null);card.setBounds(48,140,360,180);JLabel name=JapandiTheme.label("王小美 / 家屬端",Font.BOLD,22);name.setBounds(24,24,250,30);card.add(name);JLabel lang=JapandiTheme.label("主要語言：中文 ⇄ 越南文 / 印尼文 / 菲律賓文",Font.PLAIN,13);lang.setForeground(JapandiTheme.MUTED);lang.setBounds(24,68,300,22);card.add(lang);JLabel phone=JapandiTheme.label("緊急聯絡：0912-345-678",Font.PLAIN,13);phone.setForeground(JapandiTheme.MUTED);phone.setBounds(24,100,300,22);card.add(phone);p.add(card);
  String[] options={"語言設定","照護對象設定","緊急聯絡人","登出"};for(int i=0;i<options.length;i++){JButton b=JapandiTheme.button(options[i]);b.setBounds(48,350+i*64,360,48);p.add(b);}p.add(bottomNav());}
}
