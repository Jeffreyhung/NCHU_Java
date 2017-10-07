package vollyball;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class DisplayPlayer extends javax.swing.JFrame {

    public DisplayPlayer() {
        initComponents();
        setStarted();
        setLocationRelativeTo(null);
        setTitle("查詢球員資料");
    }
    private void setStarted(){
        jRadioButton1.setVisible(true);
        jRadioButton2.setVisible(true);
        jComboBox1.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jRadioButton5.setEnabled(false);
        jRadioButton6.setEnabled(false);
        jRadioButton7.setEnabled(false);
        jTextField1.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jLabel2.setVisible(false);
        jLabel2.setEnabled(false);
        jPanel5.setVisible(false);
        jPanel5.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();

        jCheckBox8.setText("jCheckBox8");
        jCheckBox8.setName("jCheckBox8"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setName("jLayeredPane1"); // NOI18N

        jButton2.setText("確定");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(140, 410, 80, 40);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("離開");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(380, 410, 80, 40);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setName("jPanel5"); // NOI18N

        jButton3.setText("返回");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea2.setColumns(80);
        jTextArea2.setRows(100);
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBounds(0, 0, 600, 460);
        jLayeredPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setName("jPanel1"); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("顯示全部資料");
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("自訂");
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(64, 64, 64)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBounds(40, 20, 520, 66);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setName("jPanel3"); // NOI18N

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("顯示所有資料");
        jRadioButton5.setName("jRadioButton5"); // NOI18N
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("自訂");
        jRadioButton6.setName("jRadioButton6"); // NOI18N
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("得分");
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jCheckBox2.setText("失誤");
        jCheckBox2.setName("jCheckBox2"); // NOI18N

        jCheckBox3.setText("攔網");
        jCheckBox3.setName("jCheckBox3"); // NOI18N

        jCheckBox5.setText("被攔網 / 舉球 / 被攔網");
        jCheckBox5.setName("jCheckBox5"); // NOI18N

        jCheckBox6.setText("攻擊 / 釣球 / 出界");
        jCheckBox6.setName("jCheckBox6"); // NOI18N

        jCheckBox7.setText("出界 / 快攻 / 快攻");
        jCheckBox7.setName("jCheckBox7"); // NOI18N

        jLabel2.setText("提示：攻擊手 / 舉球員 / 攔中");
        jLabel2.setName("jLabel2"); // NOI18N

        jCheckBox4.setText("犯規");
        jCheckBox4.setName("jCheckBox4"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jRadioButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox5)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jRadioButton6))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBounds(40, 240, 520, 160);
        jLayeredPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setName("jPanel2"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "攻擊手", "舉球員", "攔中" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("顯示所有球員");
        jRadioButton3.setName("jRadioButton3"); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("顯示指定球員");
        jRadioButton4.setName("jRadioButton4"); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("顯示指定種類");
        jRadioButton7.setName("jRadioButton7"); // NOI18N
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jTextField1.setName("jTextField1"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBounds(40, 110, 520, 100);
        jLayeredPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 取消
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jRadioButton5.setEnabled(false);
        jRadioButton6.setEnabled(false);
        jRadioButton7.setEnabled(false);
        jTextField1.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setEnabled(false);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jRadioButton5.setEnabled(true);
        jRadioButton6.setEnabled(true);
        jRadioButton7.setEnabled(true);
        jTextField1.setEnabled(false);
        jLabel2.setVisible(true);
        if(jRadioButton6.isSelected()==true)
        {
            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(true);
            jCheckBox3.setEnabled(true);
            jCheckBox4.setEnabled(true);
            jCheckBox5.setEnabled(true);
            jCheckBox6.setEnabled(true);
            jCheckBox7.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEnabled(false);
        jComboBox1.setEnabled(false);
        jCheckBox5.setText("被攔網 / 舉球 / 被攔網");
        jCheckBox6.setText("攻擊 / 釣球 / 出界");
        jCheckBox7.setText(" 出界 / 快攻 / 快攻");
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEnabled(true);
        jComboBox1.setEnabled(false);
        jCheckBox5.setText("被攔網 / 舉球 / 被攔網");
        jCheckBox6.setText("攻擊 / 釣球 / 出界");
        jCheckBox7.setText("出界 / 快攻 / 快攻");
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jLabel2.setEnabled(true);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jLabel2.setEnabled(false);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex() == 0) {
			jCheckBox5.setText("被攔網");
			jCheckBox6.setText("攻擊");
			jCheckBox7.setText("出界");
		} else if(jComboBox1.getSelectedIndex()==1) {
			jCheckBox5.setText("舉球");
			jCheckBox6.setText("釣球");
			jCheckBox7.setText("快攻");
		}else {
			jCheckBox5.setText("被攔網");
			jCheckBox6.setText("出界");
			jCheckBox7.setText("快攻");
		}
	}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        jCheckBox5.setText("被攔網");
        jCheckBox6.setText("攻擊");
        jCheckBox7.setText("出界");
        jComboBox1.setEnabled(true);
        jTextField1.setEnabled(false);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel5.setEnabled(false);
        jTextArea2.setText("");
        jButton1.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel5.setEnabled(true);
        //讀取資料
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

        boolean selected;
        int num;
        for(num=0; num<100; num++){
            String stringnum = Integer.toString(num);
            if(database.get(stringnum) != null){ //有資料
                if(jRadioButton1.isSelected() == true){ //顯示全部資料
                    if(database.get(stringnum) instanceof AttackPlayer) {
                        jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攻擊手\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t攻擊：" + database.get(stringnum).getAttack() + "\t出界：" + database.get(stringnum).getOut() + "\n");
                    }else if (database.get(stringnum) instanceof SetterPlayer) {
                        jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t舉球員\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t舉球：" + database.get(stringnum).getRaise() + "\t釣球：" + database.get(stringnum).getDrop() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
                    }else {
                        jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攔中\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t出界：" + database.get(stringnum).getOut() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
                    }
                }else{ //自訂
                    if(jRadioButton3.isSelected() == true ){ //自訂-顯示所有球員
                        if(jRadioButton5.isSelected() == true){ // 自訂-顯示所有球員-顯示所有資料
                            if(database.get(stringnum) instanceof AttackPlayer) { // 攻擊手
                                jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攻擊手\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t攻擊：" + database.get(stringnum).getAttack() + "\t出界：" + database.get(stringnum).getOut() + "\n");
                            }else if (database.get(stringnum) instanceof SetterPlayer) { //舉球員
                                jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t舉球員\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t舉球：" + database.get(stringnum).getRaise() + "\t釣球：" + database.get(stringnum).getDrop() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
                            }else { //攔中
                                jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攔中\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t出界：" + database.get(stringnum).getOut() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
                            }
                        }else{ //自訂-顯示所有球員-自訂
                            if(database.get(stringnum) instanceof AttackPlayer){ //攻擊手
                                jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t攻擊手");
                                if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
				if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
				if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
				if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
				if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t被攔網："  + database.get(stringnum).getBlocked());
				if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t攻擊："  + database.get(stringnum).getAttack());
				if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t出界：" + database.get(stringnum).getOut());
				jTextArea2.append("\n");
                            }else if (database.get(stringnum) instanceof SetterPlayer) { //舉球員
				jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t舉球員");
				if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
				if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
				if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
				if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
				if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t舉球："  + database.get(stringnum).getRaise());
				if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t釣球："  + database.get(stringnum).getDrop());
				if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t快攻："  + database.get(stringnum).getFast());
				jTextArea2.append("\n");
                            }else{ //攔中
                                jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t攔中");
				if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
				if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
				if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
				if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
				if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t被攔網："  + database.get(stringnum).getBlocked());
				if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t出界："  + database.get(stringnum).getOut());
				if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t快攻："  + database.get(stringnum).getFast());
				jTextArea2.append("\n");
                            }
			}
                    }else if( jRadioButton7.isSelected() ==true){ //自訂-顯示特定種類
			if(jComboBox1.getSelectedIndex() == 0){ //攻擊手
                            if(jRadioButton5.isSelected() == true){ //自訂-顯示攻擊手-顯示所有資料
				if(database.get(stringnum) instanceof AttackPlayer) {
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攻擊手\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t攻擊：" + database.get(stringnum).getAttack() + "\t出界：" + database.get(stringnum).getOut() + "\n");
                                }else{
                                }
                            }else{ //自訂-顯示攻擊手-自訂
				if(database.get(stringnum) instanceof AttackPlayer){
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t攻擊手");
                                    if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
                                    if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
                                    if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
                                    if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
                                    if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t被攔網："  + database.get(stringnum).getBlocked());
                                    if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t攻擊："  + database.get(stringnum).getAttack());
                                    if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t出界：" + database.get(stringnum).getOut());
                                    jTextArea2.append("\n");
				}else{
				}
                            }
                        }else if(jComboBox1.getSelectedIndex() == 1){ //自訂-顯示舉球員
                            if(jRadioButton5.isSelected() == true){ //自訂-顯示舉球員-顯示所有資料
				if(database.get(stringnum) instanceof SetterPlayer) { //舉球員
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t舉球員\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t舉球：" + database.get(stringnum).getRaise() + "\t釣球：" + database.get(stringnum).getDrop() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
				}else{
				}
                            }else{ //自訂-顯示舉球員-自訂
                                if(database.get(stringnum) instanceof SetterPlayer){//舉球員
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t舉球員");
                                    if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
                                    if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
                                    if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
                                    if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
                                    if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t舉球："  + database.get(stringnum).getRaise());
                                    if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t釣球："  + database.get(stringnum).getDrop());
                                    if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t快攻："  + database.get(stringnum).getFast());
                                    jTextArea2.append("\n");
				}else{
				}
                            }
                        }else{ // 自訂-顯示攔中
                            if(jRadioButton5.isSelected() == true){ //自訂-顯示攔中-顯示所有資料
				if(database.get(stringnum) instanceof BlockerPlayer) { //攔中
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攔中\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t出界：" + database.get(stringnum).getOut() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
				}else{
				}
                            }else{ //自訂-顯示攔中-自訂
                                if(database.get(stringnum) instanceof BlockerPlayer){//攔中
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t攔中");
                                    if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
                                    if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
                                    if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
                                    if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
                                    if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t被攔網："  + database.get(stringnum).getBlocked());
                                    if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t出界："  + database.get(stringnum).getOut());
                                    if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t快攻："  + database.get(stringnum).getFast());
                                    jTextArea2.append("\n");
                                }else{
                                }
                            }
                        }
                    }else{ //自訂-顯示指定球員
			if(jTextField1.getText().equals(stringnum)){
                            if(jRadioButton5.isSelected() == true){ //自訂-顯示指定球員-顯示所有資料
                                if(database.get(stringnum) instanceof AttackPlayer) {
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攻擊手\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t攻擊：" + database.get(stringnum).getAttack() + "\t出界：" + database.get(stringnum).getOut() + "\n");
				}else if (database.get(stringnum) instanceof SetterPlayer) {
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t舉球員\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t舉球：" + database.get(stringnum).getRaise() + "\t釣球：" + database.get(stringnum).getDrop() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
				}else {
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() +"\t攔中\t得分：" + database.get(stringnum).getGoal() + "\t失誤：" + database.get(stringnum).getMiss() +"\t攔網：" + database.get(stringnum).getBlock() + "\t犯規：" + database.get(stringnum).getFoul() + "\t被攔網：" + database.get(stringnum).getBlocked() + "\t出界：" + database.get(stringnum).getOut() + "\t快攻：" + database.get(stringnum).getFast() + "\n");
                                }
                            }else {//自訂-顯示指定球員-自訂
				if(database.get(stringnum) instanceof AttackPlayer){ //攻擊手
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t攻擊手");
                                    if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
                                    if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
                                    if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
                                    if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
                                    if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t被攔網："  + database.get(stringnum).getBlocked());
                                    if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t攻擊："  + database.get(stringnum).getAttack());
                                    if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t出界：" + database.get(stringnum).getOut());
                                    jTextArea2.append("\n");
				}else if (database.get(stringnum) instanceof SetterPlayer) { //舉球員
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t舉球員");
                                    if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
                                    if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
                                    if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
                                    if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
                                    if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t舉球："  + database.get(stringnum).getRaise());
                                    if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t釣球："  + database.get(stringnum).getDrop());
                                    if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t快攻："  + database.get(stringnum).getFast());
                                    jTextArea2.append("\n");
				}else{ //攔中
                                    jTextArea2.append("背號：" + num + "\t球員：" + database.get(stringnum).getName() + "\t攔中");
                                    if( jCheckBox1.isSelected() == true)  jTextArea2.append("\t得分："  + database.get(stringnum).getGoal());
                                    if( jCheckBox2.isSelected() == true)  jTextArea2.append("\t失誤："  + database.get(stringnum).getMiss());
                                    if( jCheckBox3.isSelected() == true)  jTextArea2.append("\t攔網："  + database.get(stringnum).getBlock());
                                    if( jCheckBox4.isSelected() == true)  jTextArea2.append("\t犯規："  + database.get(stringnum).getFoul());
                                    if( jCheckBox5.isSelected() == true)  jTextArea2.append("\t被攔網："  + database.get(stringnum).getBlocked());
                                    if( jCheckBox6.isSelected() == true)  jTextArea2.append("\t出界："  + database.get(stringnum).getOut());
                                    if( jCheckBox7.isSelected() == true)  jTextArea2.append("\t快攻："  + database.get(stringnum).getFast());
                                    jTextArea2.append("\n");
				}
                            }
			}else{
			}
                    }
		}
            }
        }
        jButton1.setVisible(false);
        jButton2.setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
