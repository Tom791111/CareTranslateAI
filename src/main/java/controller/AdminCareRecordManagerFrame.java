package controller;
import javax.swing.*;import javax.swing.table.DefaultTableModel;import util.JapandiTheme;import service.impl.CareRecordServiceImpl;import model.CareRecord;import java.util.*;

public class AdminCareRecordManagerFrame extends BaseFrame{
 public AdminCareRecordManagerFrame(){
  super("照護紀錄管理 v2.5",860,640);JPanel p=root();p.add(header("照護紀錄管理"));
  p.add(sub("後台可查詢與維護每日照護紀錄，支援 MySQL / 記憶體備援",50,86,620));
  JPanel card=JapandiTheme.card();card.setLayout(null);card.setBounds(50,130,760,400);
  String[] cols={"ID","類型","日期","時間","內容","備註"};DefaultTableModel model=new DefaultTableModel(cols,0);
  try{for(CareRecord r:new CareRecordServiceImpl().list())model.addRow(new Object[]{r.getId(),r.getType(),r.getDate(),r.getTime(),r.getContent(),r.getNote()});}catch(Exception ex){}
  JTable table=new JTable(model);table.setRowHeight(34);table.setFont(JapandiTheme.body());JScrollPane sp=new JScrollPane(table);sp.setBounds(18,18,724,260);card.add(sp);
  JButton refresh=JapandiTheme.primary("重新整理");refresh.setBounds(18,305,110,38);card.add(refresh);
  JButton export=JapandiTheme.button("匯出報表示範");export.setBounds(142,305,130,38);card.add(export);
  JButton delete=JapandiTheme.button("刪除選取");delete.setBounds(286,305,110,38);card.add(delete);
  JLabel hint=JapandiTheme.label("v2.5 後台：可作為畢業專題 Demo 的照護資料審核頁。",java.awt.Font.PLAIN,13);hint.setForeground(JapandiTheme.MUTED);hint.setBounds(420,310,330,28);card.add(hint);
  delete.addActionListener(e->{int r=table.getSelectedRow();if(r>=0)model.removeRow(r);});
  export.addActionListener(e->JOptionPane.showMessageDialog(this,"報表匯出可於 v2.6 擴充 PDF / CSV。"));
  p.add(card);p.add(bottomNav());
 }
}
