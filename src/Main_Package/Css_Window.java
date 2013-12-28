/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main_Package;

import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Trevor
 */
public class Css_Window extends javax.swing.JFrame {
    static String CssList = "";
    static Main_Window Main = new Main_Window();
    static DefaultListModel DLM = new DefaultListModel();

    /**
     * Creates new form Css_Window
     */
    public Css_Window() {
         Css_Window.super.setIconImage((Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Main_Package/Css3.png"))));
        initComponents();
        DLM.removeAllElements();
        DLM.addElement("Pargraph");
        DLM.addElement("Body");
        DLM.addElement("Html");
        DLM.addElement("Title");
        DLM.addElement("Head");
        DLM.addElement("Header 1");
        DLM.addElement("Header 2");
        DLM.addElement("Header 3");
        DLM.addElement("Header 4");
        DLM.addElement("Header 5");
        DLM.addElement("Header 6");
       
        
        
    }
    public static void Run(String List){
        
        CssList = List;
        System.out.println("Css: "+CssList);
       new Css_Window().setVisible(true);
    }
    public void Update(){
       String CssText = Main.Css_Textarea.getText();
       Final_Code.setText(CssText);
       if(List1.getSelectedValue().equals("Pargraph")){
               CssTags.setText("p{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Body")){
               CssTags.setText("body{\n\n\n\n\n\n\n\n}");
               
           }
             if(List1.getSelectedValue().equals("Html")){
               CssTags.setText("html{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Title")){
               CssTags.setText("title{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Head")){
               CssTags.setText("head{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Header 1")){
               CssTags.setText("h1{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Header 2")){
               CssTags.setText("h2{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Header 3")){
               CssTags.setText("h3{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Header 4")){
               CssTags.setText("h4{\n\n\n\n\n\n\n\n}");
               
           }
            if(List1.getSelectedValue().equals("Header 5")){
               CssTags.setText("h5{\n\n\n\n\n\n\n\n}");
               
           }
              if(List1.getSelectedValue().equals("Header 6")){
               CssTags.setText("h6{\n\n\n\n\n\n\n\n}");
               
           }
       if(CssText.length()==0){
           //Has no Text in it
           
           if(CssList.contentEquals("Css Font")){//Start
               Final_Code.setText("font-family:\"Times New Roman\";");
               
           }//End
           if(CssList.contentEquals("Css Text")){
               Final_Code.setText("font-size:20px;");
               
               
           }
            if(CssList.contentEquals("Css Color")){
               Final_Code.setText("color:Color here;");
               
               
           }
            if(CssList.contentEquals("Css BackRound Color")){
               Final_Code.setText("background-color:Color Here;");
               
               
           }
             if(CssList.contentEquals("Css BackRound Img")){
               Final_Code.setText("background-image:url('File Here');");
               
               
           }
              if(CssList.contentEquals("Css Backround Box Model")){
               Final_Code.setText("width:220px;\n" +" padding:10px;\n" +" border:5px Color here;\n" +" margin:0px; ");
               
               
           }
           
           
       }else{
           //Has Text in it
           Final_Code.setText(CssText);
           if(CssList.contentEquals("Css Font")){
               Tag_Code.setText("font-family:\"Times New Roman\";");
               
               
           }
           if(CssList.contentEquals("Css Text")){
               Tag_Code.setText("font-size:20px;");
               
               
           }
           if(CssList.contentEquals("Css Color")){
               Tag_Code.setText("color:Color here;");
               
               
           }
                if(CssList.contentEquals("Css BackRound Color")){
               Tag_Code.setText("background-color:Color Here;");
               
               
           }
             if(CssList.contentEquals("Css BackRound Img")){
               Tag_Code.setText("background-image:url('File Here');");
               
               
           }
           if(CssList.contentEquals("Css Backround Box Model")){
               Tag_Code.setText("width:220px;\n" +" padding:10px;\n" +" border:5px Color here;\n" +" margin:0px; ");
               
               
           }
           
           
           
       }
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Final_Code = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tag_Code = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        CssTags = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Css Tag Editer");

        Final_Code.setColumns(20);
        Final_Code.setRows(5);
        jScrollPane1.setViewportView(Final_Code);

        Tag_Code.setColumns(20);
        Tag_Code.setRows(5);
        jScrollPane2.setViewportView(Tag_Code);

        jLabel1.setText("Final Code");

        jLabel2.setText("Code for Tag");

        Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Package/Ok.png"))); // NOI18N
        Ok.setContentAreaFilled(false);
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Package/View.png"))); // NOI18N
        Update.setContentAreaFilled(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        List1.setModel(DLM);
        List1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(List1);

        CssTags.setColumns(20);
        CssTags.setLineWrap(true);
        CssTags.setRows(5);
        CssTags.setWrapStyleWord(true);
        jScrollPane4.setViewportView(CssTags);

        jLabel3.setText("Css Main Tags");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ok))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_UpdateActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        // TODO add your handling code here:
        if(Final_Code.getText().length() == 0){
            
            if(CssTags.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "You Need to Have Text In the Final Code Text box"); 
                
            }else{
              Main.SetTextCss(CssTags.getText());
            Css_Window.super.dispose();
            
        }
            
           
        }else{
            Main.SetTextCss(Final_Code.getText());
            Css_Window.super.dispose();
            
        }
    }//GEN-LAST:event_OkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Css_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Css_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Css_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Css_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Css_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CssTags;
    public static javax.swing.JTextArea Final_Code;
    private javax.swing.JList List1;
    private javax.swing.JButton Ok;
    public static javax.swing.JTextArea Tag_Code;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
