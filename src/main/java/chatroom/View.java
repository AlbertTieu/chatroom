package chatroom;
import com.mrjaffesclass.apcs.messenger.*;
/**
 * MVC Template
 * This is a template of an MVC framework used by APCS for the 
 * LandMine project (and others)
 * @author Roger Jaffe
 * @version 1.0
 * 
 */
public class View extends javax.swing.JFrame implements MessageHandler {

  private final Messenger mvcMessaging;
  
  /**
   * Creates a new view
   * @param messages mvcMessaging object
   */
  public View(Messenger messages) {
    mvcMessaging = messages;   // Save the calling controller instance
    initComponents();           // Create and init the GUI components
  }
  
  /**
   * Initialize the model here and subscribe
   * to any required messages
   */
  public void init() {
    // Subscribe to messages here
    mvcMessaging.subscribe("model:variable1Changed", this);
    mvcMessaging.subscribe("model:variable2Changed", this);
  }
  
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    if (messagePayload != null) {
      System.out.println("MSG: received by view: "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("MSG: received by view: "+messageName+" | No data sent");
    }
    if (messageName.equals("model:variable1Changed")) {
      jLabel8.setText(messagePayload.toString());
    } else {
      jLabel10.setText(messagePayload.toString());      
    }
  }

  /**
   * Instantiate an object with the field number that was clicked (1 or 2) and
   * the direction that the number should go (up or down)
   * @param fieldNumber 1 or 2 for the field being modified
   * @param direction this.UP (1) or this.DOWN (-1), constants defined above
   * @return the HashMap payload to be sent with the message
   */
  private MessagePayload createPayload(int fieldNumber, int direction) {
    MessagePayload payload = new MessagePayload(fieldNumber, direction);
    return payload;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clickMeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        noClickMeButton = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        fillButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        upButton1 = new javax.swing.JButton();
        upButton2 = new javax.swing.JButton();
        downButton1 = new javax.swing.JButton();
        downButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.setBackground(new java.awt.Color(0, 0, 0));
        clickMeButton.setText("Click me!");
        clickMeButton.setToolTipText("Click me to see the View send a message to the Controller to let it know that the button was pushed");
        clickMeButton.setActionCommand("button1Clicked");
        clickMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickMeButtonbuttonClickActionPerformed(evt);
            }
        });

        jLabel1.setText("MVC Framework Template");

        jToggleButton1.setText("Toggle button!");
        jToggleButton1.setActionCommand("toggleButtonClicked");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        noClickMeButton.setText("No, click me!!");
        noClickMeButton.setActionCommand("noClickMeButton!");
        noClickMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noClickMeButtonbuttonClickActionPerformed(evt);
            }
        });

        textField.setText("Empty");
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        fillButton.setText("New text goes here");
        fillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Click the button to move the input text to the button");

        jLabel3.setText("Input text:");

        jLabel4.setText("Button:");

        jLabel5.setText("Clicking these buttons will");
        jLabel5.setMaximumSize(new java.awt.Dimension(45, 60));

        jLabel6.setText("send a message to the console");

        jLabel7.setText("Number 1:");

        jLabel8.setText("jLabel8");

        jLabel9.setText("Number 2:");

        jLabel10.setText("jLabel8");

        jLabel11.setText("Use the buttons to control the numbers");

        upButton1.setText("Up");
        upButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButton1ActionPerformed(evt);
            }
        });

        upButton2.setText("Up");
        upButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButton2ActionPerformed(evt);
            }
        });

        downButton1.setText("Down");
        downButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButton1ActionPerformed(evt);
            }
        });

        downButton2.setText("Down");
        downButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fillButton)
                            .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clickMeButton)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noClickMeButton)
                                .addComponent(jToggleButton1))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downButton2))
                    .addComponent(jLabel11))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clickMeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noClickMeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fillButton)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(upButton1)
                    .addComponent(downButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(upButton2)
                    .addComponent(downButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void clickMeButtonbuttonClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickMeButtonbuttonClickActionPerformed
    // Send a message to the controller!
    mvcMessaging.notify("view:buttonClick", null, true);
  }//GEN-LAST:event_clickMeButtonbuttonClickActionPerformed

  private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    // Send a message to the controller!
    mvcMessaging.notify("view:toggleButtonClick", null, true);
  }//GEN-LAST:event_jToggleButton1ActionPerformed

  private void noClickMeButtonbuttonClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noClickMeButtonbuttonClickActionPerformed
    // Send a message to the controller!
    mvcMessaging.notify("view:buttonClick", null, true);
  }//GEN-LAST:event_noClickMeButtonbuttonClickActionPerformed

  private void fillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtonActionPerformed
    fillButton.setText(textField.getText());
  }//GEN-LAST:event_fillButtonActionPerformed

  /**
   * Handler for the up button for field 1
   * @param evt 
   */
  private void upButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButton1ActionPerformed
    // Increment the 1st data field
    mvcMessaging.notify("view:changeButton", createPayload(1, Constants.UP), true);
  }//GEN-LAST:event_upButton1ActionPerformed

  private void upButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButton2ActionPerformed
    // Increment the 2nd data field
    mvcMessaging.notify("view:changeButton", createPayload(2, Constants.UP), true);
  }//GEN-LAST:event_upButton2ActionPerformed

  private void downButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButton1ActionPerformed
    // Decrement the first data field
    mvcMessaging.notify("view:changeButton", createPayload(1, Constants.DOWN), true);
  }//GEN-LAST:event_downButton1ActionPerformed

  private void downButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButton2ActionPerformed
    // Decrement the second data field
    mvcMessaging.notify("view:changeButton", createPayload(2, Constants.DOWN), true);
  }//GEN-LAST:event_downButton2ActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

  /**
   * @param args the command line arguments
   */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clickMeButton;
    private javax.swing.JButton downButton1;
    private javax.swing.JButton downButton2;
    private javax.swing.JButton fillButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton noClickMeButton;
    private javax.swing.JTextField textField;
    private javax.swing.JButton upButton1;
    private javax.swing.JButton upButton2;
    // End of variables declaration//GEN-END:variables
}
