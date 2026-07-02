package controller;
import javax.swing.*;import util.JapandiTheme;import java.awt.*;
public class NotificationFrame extends BaseFrame{
 public NotificationFrame(){super("通知中心 v2.5",460,720);JPanel p=root();p.add(header("通知中心"));p.add(sub("照護提醒、SOS 與走失定位事件",48,88,360));
  String[][] rows={{"用藥提醒","18:00 晚餐後用藥尚未確認","待確認"},{"SOS 紀錄","今日無緊急求助紀錄","正常"},{"走失定位","最後定位：新店區北新路三段 205 號","已更新"}};
  for(int i=0;i<rows.length;i++){JPanel c=JapandiTheme.card();c.setLayout(null);c.setBounds(48,145+i*120,360,88);JLabel t=JapandiTheme.label(rows[i][0],Font.BOLD,17);t.setBounds(20,14,180,24);c.add(t);JLabel d=JapandiTheme.label(rows[i][1],Font.PLAIN,13);d.setForeground(JapandiTheme.MUTED);d.setBounds(20,42,300,22);c.add(d);JLabel s=JapandiTheme.label(rows[i][2],Font.PLAIN,12);s.setForeground(JapandiTheme.TAUPE);s.setBounds(275,14,70,22);c.add(s);p.add(c);}p.add(bottomNav());}
}
