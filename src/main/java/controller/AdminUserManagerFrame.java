package controller;
import javax.swing.*;import javax.swing.table.DefaultTableModel;import util.JapandiTheme;import java.awt.*;

public class AdminUserManagerFrame extends BaseFrame{
 public AdminUserManagerFrame(){
  super("使用者管理 v2.5",820,620);JPanel p=root();p.add(header("使用者管理"));
  p.add(sub("管理家屬、外籍照護員、被照顧者與管理者角色",50,86,520));
  JPanel card=JapandiTheme.card();card.setLayout(null);card.setBounds(50,130,720,370);
  String[] cols={"ID","姓名","角色","語言","狀態","備註"};
  Object[][] data={{"1","小美","家屬","中文","啟用","主要聯絡人"},{"2","Lina","外籍照護員","印尼文","啟用","日班"},{"3","阿公","被照顧者","中文","啟用","需走失提醒"},{"4","Admin","管理者","中文","啟用","後台維護"}};
  JTable table=new JTable(new DefaultTableModel(data,cols));table.setRowHeight(34);table.setFont(JapandiTheme.body());table.getTableHeader().setFont(JapandiTheme.body());
  JScrollPane sp=new JScrollPane(table);sp.setBounds(18,18,684,235);card.add(sp);
  JTextField name=new JTextField();name.setBounds(20,280,150,38);card.add(name);
  JComboBox<String> role=new JComboBox<>(new String[]{"家屬","外籍照護員","被照顧者","管理者"});role.setBounds(185,280,135,38);card.add(role);
  JComboBox<String> lang=new JComboBox<>(new String[]{"中文","越南文","印尼文","菲律賓文"});lang.setBounds(335,280,135,38);card.add(lang);
  JButton add=JapandiTheme.primary("新增使用者");add.setBounds(490,280,120,38);card.add(add);
  JButton del=JapandiTheme.button("停用/刪除");del.setBounds(620,280,90,38);card.add(del);
  add.addActionListener(e->((DefaultTableModel)table.getModel()).addRow(new Object[]{table.getRowCount()+1,name.getText(),role.getSelectedItem(),lang.getSelectedItem(),"啟用","手動新增"}));
  del.addActionListener(e->{int r=table.getSelectedRow();if(r>=0)((DefaultTableModel)table.getModel()).removeRow(r);});
  p.add(card);p.add(bottomNav());
 }
}
