package vollyball;

import java.io.*;
import javax.swing.*;
import java.util.*;
public class DeletePlayer extends javax.swing.JFrame {

    public DeletePlayer() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("刪除球員資料");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("刪除");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("球員背號：");
        jLabel1.setName("jLabel1"); // NOI18N

        jButton2.setText("取消");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setName("jTextField1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 取消
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 刪除
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
         BufferedReader p = new BufferedReader( openfile);
         //宣告 TreeMap
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
         // 關閉檔案
         try{
             openfile.close();
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null,"檔案無法關閉");
        }
        
         // 刪除資料
         if(database.remove(jTextField1.getText()) != null){
             JOptionPane.showMessageDialog(null,"資料刪除！");
         }else {
             JOptionPane.showMessageDialog(null,"查無此資料");
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
         // 關閉檔案
         printfile.close();
         //關閉畫面
         setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePlayer().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
