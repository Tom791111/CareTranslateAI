package controller; import javax.swing.*; import util.JapandiTheme; import java.awt.*;
public class HomeFrame extends BaseFrame{ String role; public HomeFrame(String role){
 super("CareTranslate AI - v2.5 Japandi UI",620,840);this.role=role;JPanel p=root();
 JLabel brand=JapandiTheme.label("CareTranslate AI",Font.BOLD,24);brand.setBounds(38,30,240,34);p.add(brand);
 JLabel subtitle=JapandiTheme.label("智慧長照跨語言照護平台",Font.PLAIN,13);subtitle.setForeground(JapandiTheme.MUTED);subtitle.setBounds(38,62,240,24);p.add(subtitle);
 JButton admin=JapandiTheme.button("後台");admin.setBounds(488,34,88,38);admin.addActionListener(e->new AdminDashboardFrame().setVisible(true));p.add(admin);
 JPanel hero=JapandiTheme.card();hero.setLayout(null);hero.setBounds(38,105,540,150);p.add(hero);
 JLabel h1=JapandiTheme.label("早安，小美",Font.BOLD,26);h1.setBounds(24,20,220,34);hero.add(h1);
 JLabel h2=JapandiTheme.label("今天適合用簡單清楚的翻譯，陪伴照護更安心。",Font.PLAIN,14);h2.setForeground(JapandiTheme.MUTED);h2.setBounds(24,58,360,24);hero.add(h2);
 hero.add(metric("翻譯", "18", "今日次數", 24, 98));hero.add(metric("紀錄", "4", "照護筆數", 188, 98));hero.add(metric("SOS", "0", "今日事件", 352, 98));
 JLabel sec=JapandiTheme.label("主要功能",Font.BOLD,20);sec.setBounds(38,282,180,30);p.add(sec);
 JLabel hint=JapandiTheme.label("依長照現場流程設計：翻譯、紀錄、緊急協助。",Font.PLAIN,13);hint.setForeground(JapandiTheme.MUTED);hint.setBounds(38,312,360,22);p.add(hint);
 int x=38,y=350,w=256,h=78,g=18;String[][] items={{"voice","語音翻譯"},{"text","打字翻譯"},{"phrase","常用照護語"},{"record","照護紀錄"},{"history","翻譯歷史"},{"sos","SOS 緊急求助"},{"lost","走失定位"},{"police","警局通報"},{"notify","通知中心"},{"profile","我的帳戶"}};
 for(int i=0;i<items.length;i++){JButton b=navButton(items[i][0],items[i][1],x+(i%2)*(w+g),y+(i/2)*(h+g),w,h);final String key=items[i][0];b.addActionListener(e->open(key));p.add(b);} 
 }
 private JPanel metric(String label,String value,String note,int x,int y){JPanel m=new JPanel(null);m.setOpaque(false);m.setBounds(x,y,130,40);JLabel v=JapandiTheme.label(value,Font.BOLD,24);v.setBounds(0,0,48,32);m.add(v);JLabel l=JapandiTheme.label(label,Font.BOLD,13);l.setBounds(48,0,80,18);m.add(l);JLabel n=JapandiTheme.label(note,Font.PLAIN,11);n.setForeground(JapandiTheme.MUTED);n.setBounds(48,18,82,18);m.add(n);return m;}
 private void open(String key){switch(key){case "voice":new VoiceTranslateFrame().setVisible(true);break;case "text":new TextTranslateFrame().setVisible(true);break;case "phrase":new PhraseLibraryFrame().setVisible(true);break;case "record":new CareRecordListFrame().setVisible(true);break;case "history":new TranslationHistoryFrame().setVisible(true);break;case "sos":new SosFrame().setVisible(true);break;case "lost":new LostLocationFrame().setVisible(true);break;case "police":new PoliceReportFrame().setVisible(true);break;case "notify":new NotificationFrame().setVisible(true);break;case "profile":new ProfileFrame().setVisible(true);break;}}
}
