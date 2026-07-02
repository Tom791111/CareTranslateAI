package controller;
import javax.swing.*;import javax.swing.table.DefaultTableModel;import util.JapandiTheme;import java.awt.*;

public class AdminSosManagerFrame extends BaseFrame{
 public AdminSosManagerFrame(){
  super("SOS 緊急事件管理 v2.5",820,620);JPanel p=root();p.add(header("SOS 緊急事件管理"));
  p.add(sub("管理 SOS 顯示電話、事件類型與處理狀態；本版不會真的撥打電話",50,86,620));
  JPanel card=JapandiTheme.card();card.setLayout(null);card.setBounds(50,130,720,380);
  String[] cols={"事件","顯示電話","狀態","備註"};
  Object[][] data={{"跌倒","119 / 家屬 0912-345-678","待確認","顯示電話不撥號"},{"走失","110 / 最近警局","通報中","需提供定位資訊"},{"呼吸困難","119","緊急","建議立即求助"},{"聯絡家屬","0912-345-678","已通知","APP 顯示資訊"}};
  JTable table=new JTable(new DefaultTableModel(data,cols));table.setRowHeight(36);table.setFont(JapandiTheme.body());
  JScrollPane sp=new JScrollPane(table);sp.setBounds(18,18,684,230);card.add(sp);
  JTextField type=new JTextField("血壓異常");type.setBounds(20,280,150,38);card.add(type);
  JTextField phone=new JTextField("119 / 家屬電話");phone.setBounds(185,280,180,38);card.add(phone);
  JComboBox<String> status=new JComboBox<>(new String[]{"待確認","通報中","已處理","緊急"});status.setBounds(380,280,110,38);card.add(status);
  JButton add=JapandiTheme.primary("新增事件");add.setBounds(510,280,110,38);card.add(add);
  JButton remove=JapandiTheme.button("刪除");remove.setBounds(635,280,70,38);card.add(remove);
  add.addActionListener(e->((DefaultTableModel)table.getModel()).addRow(new Object[]{type.getText(),phone.getText(),status.getSelectedItem(),"後台新增"}));
  remove.addActionListener(e->{int r=table.getSelectedRow();if(r>=0)((DefaultTableModel)table.getModel()).removeRow(r);});
  p.add(card);p.add(bottomNav());
 }
}
