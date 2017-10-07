package vollyball;

import java.io.*;
import javax.swing.*;
import java.util.*;

public class ChangePlayer extends javax.swing.JFrame {

    public ChangePlayer() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("更改球員資料");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField8.setName("jTextField8"); // NOI18N

        jLabel6.setText("攻擊：");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel9.setText("球員種類：");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel7.setText("被攔網：");
        jLabel7.setName("jLabel7"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "攻擊手", "舉球員", "攔中" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("確認");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("犯規：");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel1.setText("球員背號：");
        jLabel1.setName("jLabel1"); // NOI18N

        jButton2.setText("取消");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setName("jTextField3"); // NOI18N

        jTextField4.setName("jTextField4"); // NOI18N

        jLabel8.setText("出界：");
        jLabel8.setName("jLabel8"); // NOI18N

        jTextField2.setName("jTextField2"); // NOI18N

        jTextField7.setName("jTextField7"); // NOI18N

        jTextField5.setName("jTextField5"); // NOI18N

        jTextField6.setName("jTextField6"); // NOI18N

        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText("得分：");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("失誤：");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("攔網");
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(115, 115, 115)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel9, jTextField1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //取消
         setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // 下拉式選單更改內容
        if(jComboBox1.getSelectedIndex() == 0) {
        jLabel6.setText("攻擊：");
        jLabel7.setText("被攔網：");
        jLabel8.setText("出界：");
      } else if(jComboBox1.getSelectedIndex()==1) {
        jLabel6.setText("快攻：");
        jLabel7.setText("舉球：");
        jLabel8.setText("釣球：");
      }else {
        jLabel6.setText("快攻：");
        jLabel7.setText("被攔網：");
        jLabel8.setText("出界：");
      }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 更改資料
         StringTokenizer st;
         FileReader openfile = null;
         String temp;
        //開啟檔案
        try{
            openfile = new FileReader("data.txt");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "無法開啟檔案");
            System.exit(-1);
        }
         // 讀取檔案
         BufferedReader p = new BufferedReader( openfile);
         // 建立 TreeMap
         TreeMap< String,Player> database = new TreeMap< String ,Player>();
        // 將檔案放入 TreeMap
         try {
             String datain = p.readLine();
             while(datain != null){
                 st = new StringTokenizer(datain);
                 temp = st.nextToken();
                 if(temp.equals("a")){
                     String num = st.nextToken();
                     Player put = database.put(num, new AttackPlayer(st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
                 }
                 else if(temp.equals("s")){
                     String num = st.nextToken();
                     Player put = database.put(num, new SetterPlayer(st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
                 }
                 else{
                     String num = st.nextToken();
                     Player put = database.put(num, new BlockerPlayer(st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
                 }
             datain = p.readLine();
             }
         }catch(IOException e){
             JOptionPane.showMessageDialog(null, "資料讀取錯誤");
             System.exit(-1);
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "數字轉換錯誤");
            System.exit(-1);
         }
         //關閉檔案
         try{
             openfile.close();
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null,"檔案無法關閉");
        }
         
         Player w = (Player) database.get(jTextField1.getText());
         String name = w.getName();
         if(w != null){
             if(jComboBox1.getSelectedIndex() == 0){
                 database.put(jTextField1.getText(), new AttackPlayer(w.getName() ,Integer.parseInt(jTextField2.getText()),Integer.parseInt(jTextField3.getText()),Integer.parseInt(jTextField4.getText()),Integer.parseInt(jTextField5.getText()),Integer.parseInt(jTextField7.getText()),Integer.parseInt(jTextField6.getText()),Integer.parseInt(jTextField8.getText())));
                w.setBlocked(Integer.parseInt(jTextField2.getText()));
             }else if(jComboBox1.getSelectedIndex() == 1){
                 database.put(jTextField1.getText(),new SetterPlayer( w.getName(),Integer.parseInt(jTextField2.getText()),Integer.parseInt(jTextField3.getText()),Integer.parseInt(jTextField4.getText()),Integer.parseInt(jTextField5.getText()),Integer.parseInt(jTextField6.getText()),Integer.parseInt(jTextField7.getText()),Integer.parseInt(jTextField8.getText())));
            }else{
                  database.put(jTextField1.getText(),new BlockerPlayer( w.getName(),Integer.parseInt(jTextField2.getText()),Integer.parseInt(jTextField3.getText()),Integer.parseInt(jTextField4.getText()),Integer.parseInt(jTextField5.getText()),Integer.parseInt(jTextField6.getText()),Integer.parseInt(jTextField7.getText()),Integer.parseInt(jTextField8.getText())));
            }
        }

         // 輸出資料
         FileWriter writefile = null;
         try
         {
             writefile = new FileWriter("data.txt");
        }catch(IOException e ) {
            JOptionPane.showMessageDialog(null, "檔案開啟錯誤");
            System.exit(-1);
        }
         PrintWriter printfile = new PrintWriter(writefile);
         int num=0;
         for(num=0; num<100; num++){
             String stringnum = Integer.toString(num);
             if(database.get(stringnum) != null)
             {
                if(database.get(stringnum) instanceof AttackPlayer) {
                     printfile.print("a"+ " ");
                     printfile.print( num + " ");
                     printfile.print(database.get(stringnum).getName() + " ");
                     printfile.print(database.get(stringnum).getGoal() + " ");
                     printfile.print(database.get(stringnum).getMiss() + " ");
                     printfile.print(database.get(stringnum).getBlock() + " ");
                     printfile.print(database.get(stringnum).getFoul() + " ");
                     printfile.print(database.get(stringnum).getBlocked() + " ");
                     printfile.print(database.get(stringnum).getAttack() + " ");
                     printfile.println(database.get(stringnum).getOut() + " ");
                 }else if (database.get(stringnum) instanceof SetterPlayer) {
                     printfile.print("s"+ " ");
                     printfile.print( num + " ");
                     printfile.print(database.get(stringnum).getName() + " ");
                     printfile.print(database.get(stringnum).getGoal() + " ");
                     printfile.print(database.get(stringnum).getMiss() + " ");
                     printfile.print(database.get(stringnum).getBlock() + " ");
                     printfile.print(database.get(stringnum).getFoul() + " ");
                     printfile.print(database.get(stringnum).getRaise() + " ");
                     printfile.print(database.get(stringnum).getDrop() + " ");
                     printfile.println(database.get(stringnum).getFast() + " ");

                 }else {
                     printfile.print("b"+ " ");
                     printfile.print( num + " ");
                     printfile.print(database.get(stringnum).getName() + " ");
                     printfile.print(database.get(stringnum).getGoal() + " ");
                     printfile.print(database.get(stringnum).getMiss() + " ");
                     printfile.print(database.get(stringnum).getBlock() + " ");
                     printfile.print(database.get(stringnum).getFoul() + " ");
                     printfile.print(database.get(stringnum).getBlocked() + " ");
                     printfile.print(database.get(stringnum).getOut() + " ");
                     printfile.println(database.get(stringnum).getFast() + " ");
                 }
             }else{
             }
         }
         //關閉檔案
         printfile.close();
         // 關閉畫面
         setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
