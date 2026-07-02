package controller;
import util.JapandiTheme;
import javax.swing.*;import java.awt.*;

public class BaseFrame extends JFrame{
 public BaseFrame(String title,int w,int h){
  super(title);setSize(w,h);setLocationRelativeTo(null);JapandiTheme.apply(this);setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }
 protected JPanel root(){
  JPanel p=new JPanel(null){protected void paintComponent(Graphics g){
   Graphics2D g2=(Graphics2D)g.create();g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
   GradientPaint gp=new GradientPaint(0,0,JapandiTheme.BG,getWidth(),getHeight(),JapandiTheme.BG_2);g2.setPaint(gp);g2.fillRect(0,0,getWidth(),getHeight());
   g2.setColor(new Color(255,255,255,80));g2.fillOval(-70,-70,220,220);g2.setColor(new Color(211,185,154,42));g2.fillOval(getWidth()-150,80,210,210);g2.dispose();super.paintComponent(g);
  }};p.setOpaque(false);setContentPane(p);return p;
 }
 protected JLabel title(String s,int x,int y,int w){JLabel l=JapandiTheme.label(s,Font.BOLD,30);l.setBounds(x,y,w,42);return l;}
 protected JLabel sub(String s,int x,int y,int w){JLabel l=JapandiTheme.label(s,Font.PLAIN,14);l.setForeground(JapandiTheme.MUTED);l.setBounds(x,y,w,25);return l;}
 protected JButton navButton(String icon,String text,int x,int y,int w,int h){
  JButton b=JapandiTheme.button(text);b.setLayout(null);b.setText("");b.setBounds(x,y,w,h);
  JPanel ic=JapandiTheme.iconBadge(icon);ic.setBounds(18,16,50,50);b.add(ic);
  JLabel label=JapandiTheme.label(text,Font.BOLD,15);label.setBounds(80,20,w-96,24);b.add(label);
  JLabel arrow=JapandiTheme.label("›",Font.PLAIN,22);arrow.setForeground(JapandiTheme.MUTED);arrow.setBounds(w-34,28,20,24);b.add(arrow);
  return b;
 }
 protected JPanel header(String pageTitle){
  JPanel h=new JPanel(null);h.setOpaque(false);h.setBounds(0,0,getWidth(),92);
  JButton back=JapandiTheme.ghost("← 回上一頁");back.setBounds(26,28,120,36);back.addActionListener(e->dispose());h.add(back);
  JLabel t=JapandiTheme.label(pageTitle,Font.BOLD,23);t.setHorizontalAlignment(SwingConstants.CENTER);t.setBounds(0,27,getWidth(),38);h.add(t);
  return h;
 }
 protected JPanel bottomNav(){
  JPanel b=JapandiTheme.card();b.setLayout(new GridLayout(1,5,8,0));b.setBounds(18,getHeight()-102,getWidth()-50,76);
  String[] tabs={"首頁","翻譯","紀錄","通知","我的"};
  for(String tab:tabs){JButton btn=JapandiTheme.ghost(tab);
   if(tab.equals("首頁"))btn.addActionListener(e->{new HomeFrame("家屬").setVisible(true);dispose();});
   if(tab.equals("翻譯"))btn.addActionListener(e->{new TextTranslateFrame().setVisible(true);dispose();});
   if(tab.equals("紀錄"))btn.addActionListener(e->{new CareRecordListFrame().setVisible(true);dispose();});
   if(tab.equals("通知"))btn.addActionListener(e->{new NotificationFrame().setVisible(true);dispose();});
   if(tab.equals("我的"))btn.addActionListener(e->{new ProfileFrame().setVisible(true);dispose();});
   b.add(btn);}return b;
 }
 protected JPanel sectionCard(String title,String desc,int x,int y,int w,int h){
  JPanel c=JapandiTheme.card();c.setLayout(null);c.setBounds(x,y,w,h);
  JLabel t=JapandiTheme.label(title,Font.BOLD,18);t.setBounds(22,16,w-44,26);c.add(t);
  if(desc!=null){JLabel d=JapandiTheme.label(desc,Font.PLAIN,13);d.setForeground(JapandiTheme.MUTED);d.setBounds(22,44,w-44,22);c.add(d);}return c;
 }
}
