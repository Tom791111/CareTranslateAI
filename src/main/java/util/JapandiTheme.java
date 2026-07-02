package util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class JapandiTheme {
    public static final Color BG = new Color(246, 241, 232);
    public static final Color BG_2 = new Color(239, 231, 218);
    public static final Color CARD = new Color(255, 252, 246);
    public static final Color CARD_ALT = new Color(248, 242, 232);
    public static final Color INK = new Color(52, 43, 36);
    public static final Color MUTED = new Color(132, 118, 102);
    public static final Color LINE = new Color(224, 212, 195);
    public static final Color TAUPE = new Color(151, 118, 88);
    public static final Color CLAY = new Color(194, 126, 92);
    public static final Color SAGE = new Color(126, 137, 113);
    public static final Color CREAM = new Color(250, 246, 239);
    public static final Color SHADOW = new Color(80, 55, 35, 24);

    public static Font title(){return font(Font.BOLD, 30);} 
    public static Font h2(){return font(Font.BOLD, 21);} 
    public static Font body(){return font(Font.PLAIN, 14);} 
    public static Font small(){return font(Font.PLAIN, 12);} 
    public static Font font(int style, int size){return new Font("Microsoft JhengHei", style, size);} 

    public static void apply(JFrame f){
        f.getContentPane().setBackground(BG);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        UIManager.put("TextField.font", body());
        UIManager.put("TextArea.font", body());
        UIManager.put("ComboBox.font", body());
        UIManager.put("Table.font", body());
        UIManager.put("Table.rowHeight", 34);
        UIManager.put("TableHeader.font", font(Font.BOLD, 13));
    }

    public static JPanel card(){
        JPanel p = new JPanel(){
            protected void paintComponent(Graphics g){
                Graphics2D g2=(Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(SHADOW);
                g2.fillRoundRect(4,6,getWidth()-10,getHeight()-10,28,28);
                g2.setColor(CARD);
                g2.fillRoundRect(0,0,getWidth()-8,getHeight()-10,28,28);
                g2.setColor(new Color(255,255,255,80));
                g2.drawRoundRect(0,0,getWidth()-9,getHeight()-11,28,28);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        p.setOpaque(false);
        p.setBorder(new EmptyBorder(18,18,18,18));
        return p;
    }

    public static JPanel softCard(){
        JPanel p = card();
        p.setBackground(CARD_ALT);
        return p;
    }

    public static JButton button(String text){return roundedButton(text, CARD, INK, LINE);} 
    public static JButton primary(String text){return roundedButton(text, TAUPE, Color.WHITE, TAUPE);} 
    public static JButton accent(String text){return roundedButton(text, CLAY, Color.WHITE, CLAY);} 
    public static JButton sage(String text){return roundedButton(text, SAGE, Color.WHITE, SAGE);} 
    public static JButton ghost(String text){
        JButton b = new JButton(text);
        b.setFont(body()); b.setForeground(TAUPE); b.setFocusPainted(false);
        b.setContentAreaFilled(false); b.setOpaque(false); b.setBorder(new EmptyBorder(8,10,8,10));
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return b;
    }

    private static JButton roundedButton(String text, Color bg, Color fg, Color stroke){
        JButton b = new JButton(text){
            private boolean hover=false;
            { addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseEntered(java.awt.event.MouseEvent e){hover=true; repaint();}
                public void mouseExited(java.awt.event.MouseEvent e){hover=false; repaint();}
            });}
            protected void paintComponent(Graphics g){
                Graphics2D g2=(Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                Color fill = hover ? lighten(bg, 10) : bg;
                g2.setColor(fill);
                g2.fillRoundRect(0,0,getWidth(),getHeight(),20,20);
                g2.setColor(stroke);
                g2.drawRoundRect(0,0,getWidth()-1,getHeight()-1,20,20);
                g2.dispose();
                super.paintComponent(g);
            }
            protected void paintBorder(Graphics g){}
            public boolean contains(int x,int y){return new RoundRectangle2D.Float(0,0,getWidth(),getHeight(),20,20).contains(x,y);} 
        };
        b.setFont(body()); b.setForeground(fg); b.setFocusPainted(false); b.setContentAreaFilled(false); b.setOpaque(false);
        b.setBorder(new EmptyBorder(8,14,8,14)); b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return b;
    }

    public static JLabel label(String s,int style,int size){JLabel l=new JLabel(s);l.setFont(font(style,size));l.setForeground(INK);return l;}

    public static JTextField textField(String text){
        JTextField t = new JTextField(text); t.setFont(body()); t.setForeground(INK); t.setBackground(CARD); t.setBorder(new EmptyBorder(8,14,8,14)); return t;
    }
    public static JTextArea textArea(String text){
        JTextArea a = new JTextArea(text); a.setFont(body()); a.setForeground(INK); a.setBackground(CARD); a.setBorder(new EmptyBorder(12,14,12,14)); a.setLineWrap(true); a.setWrapStyleWord(true); return a;
    }

    public static JPanel iconBadge(String type){
        JPanel p = new JPanel(){
            protected void paintComponent(Graphics g){
                Graphics2D g2=(Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new Color(238, 225, 208));
                g2.fillRoundRect(0,0,getWidth(),getHeight(),18,18);
                g2.setColor(TAUPE);
                g2.setStroke(new BasicStroke(2.2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                int w=getWidth(), h=getHeight(), cx=w/2, cy=h/2;
                if("voice".equals(type)){g2.drawOval(cx-8,cy-12,16,24);g2.drawLine(cx,cy+12,cx,cy+19);g2.drawArc(cx-17,cy-1,34,28,200,140);}
                else if("text".equals(type)){g2.drawRoundRect(cx-17,cy-12,34,24,8,8);g2.drawLine(cx-10,cy-4,cx+10,cy-4);g2.drawLine(cx-10,cy+4,cx+4,cy+4);}
                else if("phrase".equals(type)){g2.drawRoundRect(cx-15,cy-17,30,34,8,8);g2.drawLine(cx-7,cy-6,cx+7,cy-6);g2.drawLine(cx-7,cy+2,cx+7,cy+2);}
                else if("record".equals(type)){g2.drawRoundRect(cx-15,cy-15,30,30,8,8);g2.drawLine(cx-6,cy-3,cx+8,cy-3);g2.drawLine(cx-6,cy+6,cx+5,cy+6);}
                else if("history".equals(type)){g2.drawOval(cx-16,cy-16,32,32);g2.drawLine(cx,cy,cx,cy-10);g2.drawLine(cx,cy,cx+9,cy+4);}
                else if("sos".equals(type)){g2.drawOval(cx-16,cy-16,32,32);g2.drawLine(cx,cy-9,cx,cy+3);g2.fillOval(cx-2,cy+9,4,4);}
                else if("lost".equals(type)){g2.drawOval(cx-12,cy-15,24,24);g2.drawLine(cx,cy+9,cx,cy+18);g2.drawLine(cx-8,cy+18,cx+8,cy+18);}
                else if("police".equals(type)){g2.drawRoundRect(cx-14,cy-12,28,26,6,6);g2.drawLine(cx-9,cy-12,cx,cy-19);g2.drawLine(cx+9,cy-12,cx,cy-19);}
                else if("notify".equals(type)){g2.drawArc(cx-13,cy-12,26,30,0,180);g2.drawLine(cx-13,cy+4,cx+13,cy+4);g2.drawOval(cx-3,cy+10,6,6);}
                else if("profile".equals(type)){g2.drawOval(cx-8,cy-16,16,16);g2.drawArc(cx-16,cy-1,32,26,0,180);}
                else {g2.drawRoundRect(cx-14,cy-14,28,28,8,8);} 
                g2.dispose();
            }
        };
        p.setOpaque(false); return p;
    }

    public static String icon(String type){return "";}
    private static Color lighten(Color c, int amount){return new Color(Math.min(255,c.getRed()+amount),Math.min(255,c.getGreen()+amount),Math.min(255,c.getBlue()+amount),c.getAlpha());}
}
