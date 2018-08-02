/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HASHRIN
 */
public class NewJFrame extends javax.swing.JFrame {
        String str, str1;
         Statement stmt;
        Connection conn;
        ResultSet rs;
        ResultSet rsm = null;
        int error=0;
        int correct=0;
        
        public void Disabling()
        {
        jButton1.setEnabled(false);
        jButton27.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton23.setEnabled(false);
        jButton25.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton24.setEnabled(false);
        jButton26.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
                    }
        public void Enabling()
        {
            jButton1.setEnabled(true);
        jButton27.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton23.setEnabled(true);
        jButton25.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton24.setEnabled(true);
        jButton26.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        }
        
        
     
    public void connect()
    {
       try
       {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           String username="system";
           String pass="haaman";
           String url = "jdbc:oracle:thin:@localhost:1521:xe";
           System.out.println("checking");
           conn=DriverManager.getConnection(url,username,pass);
           System.out.println("Valid User");

           }
       catch(ClassNotFoundException e)
       {
          System.out.println("could not find ");
       }
       catch(SQLException e)
       {
           System.out.println("could not connect to database");
       }

   }
    public ResultSet check() throws SQLException{
        
        stmt=conn.createStatement();
        RandomDemo ob = new RandomDemo();
        int a=ob.randomize();
        String q = "select WORD,HINT from HANGMAN1 where SLNO="+a;
        System.out.println(q);
        rs=stmt.executeQuery(q);
        
        
        rs.next();
            
        
        return rs;
        
    }
    public NewJFrame() {
        initComponents();
    win.setVisible(false);
    Error1.setVisible(false);
    Error2.setVisible(false);
    Error3.setVisible(false);
    Error4.setVisible(false);
    Error5.setVisible(false);
    Error6.setVisible(false);
    hint.setBackground(Color.white);
    hint.setForeground(Color.red);
    hint.setVisible(false);
    word.setBackground(Color.white);
    word.setForeground(Color.blue);
    win.setForeground(Color.blue);
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        Error1 = new javax.swing.JLabel();
        Error2 = new javax.swing.JLabel();
        Error3 = new javax.swing.JLabel();
        Error4 = new javax.swing.JLabel();
        Error5 = new javax.swing.JLabel();
        Error6 = new javax.swing.JLabel();
        First = new javax.swing.JLabel();
        Fifth = new javax.swing.JLabel();
        Twelvth = new javax.swing.JLabel();
        Seventh = new javax.swing.JLabel();
        Fourth = new javax.swing.JLabel();
        Sixth = new javax.swing.JLabel();
        Ninth = new javax.swing.JLabel();
        Tenth = new javax.swing.JLabel();
        Eleventh = new javax.swing.JLabel();
        Thirteenth = new javax.swing.JLabel();
        Eighth = new javax.swing.JLabel();
        Third = new javax.swing.JLabel();
        Second = new javax.swing.JLabel();
        win = new javax.swing.JLabel();
        word = new javax.swing.JLabel();
        hint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setText("B");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(181, 28, 43, 23);

        jButton2.setText("New Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 11, 120, 30);

        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(230, 28, 43, 23);

        jButton4.setText("D");
        jButton4.setMaximumSize(new java.awt.Dimension(37, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(37, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(37, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(279, 28, 43, 23);

        jButton5.setText("E");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(328, 28, 43, 23);

        jButton6.setText("F");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(377, 28, 43, 23);

        jButton7.setText("G");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(426, 28, 43, 23);

        jButton8.setText("J");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(573, 28, 43, 23);

        jButton9.setText("K");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(622, 28, 43, 23);

        jButton10.setText("L");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(671, 28, 43, 23);

        jButton11.setText("A");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(132, 28, 43, 23);

        jButton12.setText("I");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(524, 28, 43, 23);

        jButton13.setText("H");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(475, 28, 43, 23);

        jButton14.setText("N");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(132, 57, 43, 23);

        jButton15.setText("Y");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(671, 57, 43, 23);

        jButton16.setText("O");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(181, 57, 43, 23);

        jButton17.setText("P");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(230, 57, 43, 23);

        jButton18.setText("X");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(622, 57, 43, 23);

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jButton19.setText("W");
        jButton19.setMaximumSize(new java.awt.Dimension(39, 23));
        jButton19.setMinimumSize(new java.awt.Dimension(39, 23));
        jButton19.setPreferredSize(new java.awt.Dimension(39, 23));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(573, 57, 43, 23);

        jButton20.setText("V");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(524, 57, 43, 23);

        jButton21.setText("U");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(475, 57, 43, 23);

        jButton22.setText("T");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(426, 57, 43, 23);

        jButton23.setText("S");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(377, 57, 43, 23);

        jButton24.setText("R");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);
        jButton24.setBounds(328, 57, 43, 23);

        jButton25.setText("Q");
        jButton25.setMaximumSize(new java.awt.Dimension(37, 23));
        jButton25.setMinimumSize(new java.awt.Dimension(37, 23));
        jButton25.setPreferredSize(new java.awt.Dimension(37, 23));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);
        jButton25.setBounds(279, 57, 43, 23);

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton26.setText("M");
        jButton26.setMaximumSize(new java.awt.Dimension(37, 23));
        jButton26.setMinimumSize(new java.awt.Dimension(37, 23));
        jButton26.setPreferredSize(new java.awt.Dimension(37, 23));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);
        jButton26.setBounds(720, 28, 43, 23);

        jButton27.setText("Z");
        jButton27.setMaximumSize(new java.awt.Dimension(37, 23));
        jButton27.setMinimumSize(new java.awt.Dimension(37, 23));
        jButton27.setPreferredSize(new java.awt.Dimension(37, 23));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);
        jButton27.setBounds(720, 57, 43, 23);

        Error1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HASHRIN\\Pictures\\man0.png")); // NOI18N
        Error1.setText("5 incorrect attempts remaining");
        Error1.setMaximumSize(new java.awt.Dimension(50, 50));
        Error1.setMinimumSize(new java.awt.Dimension(40, 40));
        Error1.setName(""); // NOI18N
        jPanel1.add(Error1);
        Error1.setBounds(170, 87, 263, 190);
        Error1.getAccessibleContext().setAccessibleName("");

        Error2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HASHRIN\\Pictures\\man1.png")); // NOI18N
        Error2.setText("4 incorrect attempts remaining");
        Error2.setMaximumSize(new java.awt.Dimension(50, 50));
        Error2.setMinimumSize(new java.awt.Dimension(40, 40));
        Error2.setName(""); // NOI18N
        jPanel1.add(Error2);
        Error2.setBounds(170, 87, 271, 193);
        Error2.getAccessibleContext().setAccessibleName("");

        Error3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HASHRIN\\Pictures\\man2.png")); // NOI18N
        Error3.setText("3 incorrect attempts remaining");
        Error3.setMaximumSize(new java.awt.Dimension(50, 50));
        Error3.setMinimumSize(new java.awt.Dimension(40, 40));
        Error3.setName(""); // NOI18N
        jPanel1.add(Error3);
        Error3.setBounds(170, 87, 267, 201);
        Error3.getAccessibleContext().setAccessibleName("");

        Error4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HASHRIN\\Pictures\\man3.png")); // NOI18N
        Error4.setText("2 incorrect attempts remaining");
        Error4.setMaximumSize(new java.awt.Dimension(50, 50));
        Error4.setMinimumSize(new java.awt.Dimension(40, 40));
        Error4.setName(""); // NOI18N
        jPanel1.add(Error4);
        Error4.setBounds(170, 87, 263, 200);
        Error4.getAccessibleContext().setAccessibleName("");

        Error5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HASHRIN\\Pictures\\man4.png")); // NOI18N
        Error5.setText("1 incorrect attempt remaining");
        Error5.setMaximumSize(new java.awt.Dimension(50, 50));
        Error5.setMinimumSize(new java.awt.Dimension(40, 40));
        Error5.setName(""); // NOI18N
        jPanel1.add(Error5);
        Error5.setBounds(170, 87, 264, 201);
        Error5.getAccessibleContext().setAccessibleName("");

        Error6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HASHRIN\\Pictures\\man6.png")); // NOI18N
        Error6.setText("You lose!");
        Error6.setMaximumSize(new java.awt.Dimension(50, 50));
        Error6.setMinimumSize(new java.awt.Dimension(40, 40));
        Error6.setName(""); // NOI18N
        jPanel1.add(Error6);
        Error6.setBounds(170, 87, 134, 199);
        Error6.getAccessibleContext().setAccessibleName("");

        jPanel1.add(First);
        First.setBounds(10, 424, 55, 27);
        jPanel1.add(Fifth);
        Fifth.setBounds(265, 424, 55, 27);
        jPanel1.add(Twelvth);
        Twelvth.setBounds(696, 424, 55, 27);
        jPanel1.add(Seventh);
        Seventh.setBounds(387, 424, 55, 27);
        jPanel1.add(Fourth);
        Fourth.setBounds(204, 424, 55, 27);
        jPanel1.add(Sixth);
        Sixth.setBounds(326, 424, 55, 27);
        jPanel1.add(Ninth);
        Ninth.setBounds(513, 424, 55, 27);
        jPanel1.add(Tenth);
        Tenth.setBounds(574, 424, 55, 27);
        jPanel1.add(Eleventh);
        Eleventh.setBounds(635, 424, 55, 27);
        jPanel1.add(Thirteenth);
        Thirteenth.setBounds(757, 424, 55, 27);
        jPanel1.add(Eighth);
        Eighth.setBounds(448, 424, 55, 27);
        jPanel1.add(Third);
        Third.setBounds(136, 424, 62, 27);
        jPanel1.add(Second);
        Second.setBounds(71, 424, 59, 27);

        win.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        win.setText("Congratulations! You win.");
        jPanel1.add(win);
        win.setBounds(270, 330, 360, 80);

        word.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(word);
        word.setBounds(260, 260, 410, 120);

        hint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(hint);
        hint.setBounds(90, 274, 330, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        char sr = 'B';
            int count=0;
          
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;
                        correct++;
                        switch (i)
                      { case 0: {
                                
                          First.setText("B");
                          break;
                      }
                        case 1: {
                               
                          Second.setText("B");
                          break;
                      }
                        case 2: {
                                
                          Third.setText("B");
                          break;
                      }
                        case 3:{
                               
                          Fourth.setText("B");
                          break;
                      }
                        case 4: {
                                
                          Fifth.setText("B");
                          break;
                      }
                        case 5: {
                          
                          Sixth.setText("B");
                          break;
                      }
                        case 6: {
                         
                          Seventh.setText("B");
                          break;
                      }
                        case 7: {
                               
                          Eighth.setText("B");
                          break;
                      }
                        case 8: {
                                
                          Ninth.setText("B");
                          break;
                      }
                        case 9: {
                                
                          Tenth.setText("B");
                          break;
                      }
                        case 10:{
                                
                          Eleventh.setText("B");
                          break;
                      }
                        case 11:{
                                
                          Twelvth.setText("B");
                          break;
                      }
                        case 12: {
                              
                          Thirteenth.setText("B");
                          break;
                      }
                       }
                        
                    }
                }
                if(count==0)
                {    
                    switch (error)
                    {  
                            
                        case 0: 
                       {   
                           Error1.setVisible(true);
                           error++;
                            break;
                        }
                            case 1: 
                            {  
                            
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                            
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                     
                    }if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }
                if(error==6)
                    {
                        Disabling();
                        word.setText("The correct word is "+str);
                        word.setVisible(true);
                    }
                jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Enabling(); 
       
       correct=0;
       win.setVisible(false);
       word.setVisible(false);
       hint.setVisible(true);
        
        
        
        
        
        
                               error=0; 
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(false);
        First.setText("");
        Second.setText("");
        Third.setText("");
        Fourth.setText("");
        Fifth.setText("");
        Sixth.setText("");
        Seventh.setText("");
        Eighth.setText("");
        Ninth.setText("");
        Tenth.setText("");
        Eleventh.setText("");
        Twelvth.setText("");
        Thirteenth.setText("");
        connect();
             try {
                 
                 rsm=check();
                 
                 str=rsm.getString(1);
                 str1=rsm.getString(2);
                 hint.setText("HINT: "+str1);
                 
                 
                 System.out.println(str);
                 for(int i=0;i<str.length();i++)
                 {  switch (i)
                 {  case 0: First.setText("_");break;
                    case 1: Second.setText("_");break;
                    case 2: Third.setText("_");break;
                    case 3: Fourth.setText("_");break;
                    case 4: Fifth.setText("_");break;
                    case 5: Sixth.setText("_");break;
                    case 6: Seventh.setText("_");break;
                    case 7: Eighth.setText("_");break;
                    case 8: Ninth.setText("_");break;
                    case 9: Tenth.setText("_");break;
                    case 10: Eleventh.setText("_");break;
                    case 11: Twelvth.setText("_");break;
                    case 12: Thirteenth.setText("_");break;
                    default:break;
                 }
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        char sr = 'C';
            int count=0;
            
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: {
                          
                          First.setText("C");
                          break;
                      }
                        case 1: {
                               
                          Second.setText("C");
                          break;
                      }
                        case 2: {
                               
                          Third.setText("C");
                          break;
                      }
                        case 3:{
                               
                          Fourth.setText("C");
                          break;
                      }
                        case 4: {
                               
                          Fifth.setText("C");
                          break;
                      }
                        case 5: {
                                
                          Sixth.setText("C");
                          break;
                      }
                        case 6: {
                              
                          Seventh.setText("C");
                          break;
                      }
                        case 7: {
                              
                          Eighth.setText("C");
                          break;
                      }
                        case 8: {
                               
                          Ninth.setText("C");
                          break;
                      }
                        case 9: {
                               
                          Tenth.setText("C");
                          break;
                      }
                        case 10:{
                                
                          Eleventh.setText("C");
                          break;
                      }
                        case 11:{
                                
                          Twelvth.setText("C");
                          break;
                      }
                        case 12: {
                                
                          Thirteenth.setText("C");
                          break;
                      }
                       }
                    }
                }
                if(count==0)
                {    
                    switch (error)
                    {  
                            
                        case 0: 
                       {   
                           Error1.setVisible(true);
                           error++;
                            break;
                        }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }     
                     if(error==6)
                    {
                        Disabling();
                        word.setText("The correct word is "+str);
                        word.setVisible(true);
                    }
                jButton3.setEnabled(false);     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        char sr = 'D';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("D");break;
                        case 1: Second.setText("D");break;
                        case 2: Third.setText("D");break;
                        case 3: Fourth.setText("D");break;
                        case 4: Fifth.setText("D");break;
                        case 5: Sixth.setText("D");break;
                        case 6: Seventh.setText("D");break;
                        case 7: Eighth.setText("D");break;
                        case 8: Ninth.setText("D");break;
                        case 9: Tenth.setText("D");break;
                        case 10: Eleventh.setText("D");break;
                        case 11: Twelvth.setText("D");break;
                        case 12: Thirteenth.setText("D");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        char sr = 'E';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("E");break;
                        case 1: Second.setText("E");break;
                        case 2: Third.setText("E");break;
                        case 3: Fourth.setText("E");break;
                        case 4: Fifth.setText("E");break;
                        case 5: Sixth.setText("E");break;
                        case 6: Seventh.setText("E");break;
                        case 7: Eighth.setText("E");break;
                        case 8: Ninth.setText("E");break;
                        case 9: Tenth.setText("E");break;
                        case 10: Eleventh.setText("E");break;
                        case 11: Twelvth.setText("E");break;
                        case 12: Thirteenth.setText("E");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    }if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        char sr = 'F';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("F");break;
                        case 1: Second.setText("F");break;
                        case 2: Third.setText("F");break;
                        case 3: Fourth.setText("F");break;
                        case 4: Fifth.setText("F");break;
                        case 5: Sixth.setText("F");break;
                        case 6: Seventh.setText("F");break;
                        case 7: Eighth.setText("F");break;
                        case 8: Ninth.setText("F");break;
                        case 9: Tenth.setText("F");break;
                        case 10: Eleventh.setText("F");break;
                        case 11: Twelvth.setText("F");break;
                        case 12: Thirteenth.setText("F");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {  
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                    if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }    
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        char sr = 'G';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("G");break;
                        case 1: Second.setText("G");break;
                        case 2: Third.setText("G");break;
                        case 3: Fourth.setText("G");break;
                        case 4: Fifth.setText("G");break;
                        case 5: Sixth.setText("G");break;
                        case 6: Seventh.setText("G");break;
                        case 7: Eighth.setText("G");break;
                        case 8: Ninth.setText("G");break;
                        case 9: Tenth.setText("G");break;
                        case 10: Eleventh.setText("G");break;
                        case 11: Twelvth.setText("G");break;
                        case 12: Thirteenth.setText("G");break;
                        default:break;
                       }
                    }
                }
                    if(count==0)
                    {    System.out.println("hai");  
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    }if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        char sr = 'J';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("J");break;
                        case 1: Second.setText("J");break;
                        case 2: Third.setText("J");break;
                        case 3: Fourth.setText("J");break;
                        case 4: Fifth.setText("J");break;
                        case 5: Sixth.setText("J");break;
                        case 6: Seventh.setText("J");break;
                        case 7: Eighth.setText("J");break;
                        case 8: Ninth.setText("J");break;
                        case 90: Tenth.setText("J");break;
                        case 10: Eleventh.setText("J");break;
                        case 11: Twelvth.setText("J");break;
                        case 12: Thirteenth.setText("J");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        char sr = 'K';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                  
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("K");break;
                        case 1: Second.setText("K");break;
                        case 2: Third.setText("K");break;
                        case 3: Fourth.setText("K");break;
                        case 4: Fifth.setText("K");break;
                        case 5: Sixth.setText("K");break;
                        case 6: Seventh.setText("K");break;
                        case 7: Eighth.setText("K");break;
                        case 8: Ninth.setText("K");break;
                        case 9: Tenth.setText("K");break;
                        case 10: Eleventh.setText("K");break;
                        case 11: Twelvth.setText("K");break;
                        case 12: Thirteenth.setText("K");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                      if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        char sr = 'L';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("L");break;
                        case 1: Second.setText("L");break;
                        case 2: Third.setText("L");break;
                        case 3: Fourth.setText("L");break;
                        case 4: Fifth.setText("L");break;
                        case 5: Sixth.setText("L");break;
                        case 6: Seventh.setText("L");break;
                        case 7: Eighth.setText("L");break;
                        case 8: Ninth.setText("L");break;
                        case 9: Tenth.setText("L");break;
                        case 10: Eleventh.setText("L");break;
                        case 11: Twelvth.setText("L");break;
                        case 12: Thirteenth.setText("L");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                            Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                        
                    }
                    if(error<6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }
                    if(error==6)
                    {
                        Disabling();
                        word.setText("The correct word is "+str);
                        word.setVisible(true);
                    }
                    jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            char sr = 'A';
            int count=0; 
           
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;
                        correct++;
                        switch (i)
                      { case 0: {
                               
                          First.setText("A");
                          break;
                      }
                        case 1: {
                                
                          Second.setText("A");
                          break;
                      }
                        case 2: {
                               
                          Third.setText("A");
                          break;
                      }
                        case 3:{
                                
                          Fourth.setText("A");
                          break;
                      }
                        case 4: {
                                
                          Fifth.setText("A");
                          break;
                      }
                        case 5: {
                              
                          Sixth.setText("A");
                          break;
                      }
                        case 6: {
                               
                          Seventh.setText("A");
                          break;
                      }
                        case 7: {
                             
                          Eighth.setText("A");
                          break;
                      }
                        case 8: {
                               
                          Ninth.setText("A");
                          break;
                      }
                        case 9: {
                               
                          Tenth.setText("A");
                          break;
                      }
                        case 10:{
                               
                          Eleventh.setText("A");
                          break;
                      }
                        case 11:{
                                
                          Twelvth.setText("A");
                          break;
                      }
                        case 12: {
                                
                          Thirteenth.setText("A");
                          break;
                      }
                       }
                    }
                }
                if(count==0)
                {    
                    switch (error)
                    {  
                            
                        case 0: 
                       {   
                           Error1.setVisible(true);
                           error++;
                            break;
                        }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                }   if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }
                    if(error==6)
                    {
                        Disabling();
                    }
                       jButton11.setEnabled(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        char sr = 'I';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("I");break;
                        case 1: Second.setText("I");break;
                        case 2: Third.setText("I");break;
                        case 3: Fourth.setText("I");break;
                        case 4: Fifth.setText("I");break;
                        case 5: Sixth.setText("I");break;
                        case 6: Seventh.setText("I");break;
                        case 7: Eighth.setText("I");break;
                        case 8: Ninth.setText("I");break;
                        case 9: Tenth.setText("I");break;
                        case 10: Eleventh.setText("I");break;
                        case 11: Twelvth.setText("I");break;
                        case 12: Thirteenth.setText("I");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                    if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }    
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton12.setEnabled(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        char sr = 'H';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("H");break;
                        case 1: Second.setText("H");break;
                        case 2: Third.setText("H");break;
                        case 3: Fourth.setText("H");break;
                        case 4: Fifth.setText("H");break;
                        case 5: Sixth.setText("H");break;
                        case 6: Seventh.setText("H");break;
                        case 7: Eighth.setText("H");break;
                        case 8: Ninth.setText("H");break;
                        case 9: Tenth.setText("H");break;
                        case 10: Eleventh.setText("H");break;
                        case 11: Twelvth.setText("H");break;
                        case 12: Thirteenth.setText("H");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                    if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }    
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                    jButton13.setEnabled(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        char sr = 'N';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("N");break;
                        case 1: Second.setText("N");break;
                        case 2: Third.setText("N");break;
                        case 3: Fourth.setText("N");break;
                        case 4: Fifth.setText("N");break;
                        case 5: Sixth.setText("N");break;
                        case 6: Seventh.setText("N");break;
                        case 7: Eighth.setText("N");break;
                        case 8: Ninth.setText("N");break;
                        case 9: Tenth.setText("N");break;
                        case 10: Eleventh.setText("N");break;
                        case 11: Twelvth.setText("N");break;
                        case 12: Thirteenth.setText("N");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                    if(error!=6&&correct==(str.length()))
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                    jButton14.setEnabled(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        char sr = 'Y';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                  
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("Y");break;
                        case 1: Second.setText("Y");break;
                        case 2: Third.setText("Y");break;
                        case 3: Fourth.setText("Y");break;
                        case 4: Fifth.setText("Y");break;
                        case 5: Sixth.setText("Y");break;
                        case 6: Seventh.setText("Y");break;
                        case 7: Eighth.setText("Y");break;
                        case 8: Ninth.setText("Y");break;
                        case 9: Tenth.setText("Y");break;
                        case 10: Eleventh.setText("Y");break;
                        case 11: Twelvth.setText("Y");break;
                        case 12: Thirteenth.setText("Y");break;
                       }
                    }
                } if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                       if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    } 
                    if(error==6)
                       {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                jButton15.setEnabled(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        char sr = 'O';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("O");break;
                        case 1: Second.setText("O");break;
                        case 2: Third.setText("O");break;
                        case 3: Fourth.setText("O");break;
                        case 4: Fifth.setText("O");break;
                        case 5: Sixth.setText("");break;
                        case 6: Seventh.setText("O");break;
                        case 7: Eighth.setText("O");break;
                        case 8: Ninth.setText("O");break;
                        case 9: Tenth.setText("O");break;
                        case 10: Eleventh.setText("O");break;
                        case 11: Twelvth.setText("O");break;
                        case 12: Thirteenth.setText("O");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                      {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                    jButton16.setEnabled(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        char sr = 'P';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("P");break;
                        case 1: Second.setText("P");break;
                        case 2: Third.setText("P");break;
                        case 3: Fourth.setText("P");break;
                        case 4: Fifth.setText("P");break;
                        case 5: Sixth.setText("P");break;
                        case 6: Seventh.setText("P");break;
                        case 7: Eighth.setText("P");break;
                        case 8: Ninth.setText("P");break;
                        case 9: Tenth.setText("P");break;
                        case 10: Eleventh.setText("P");break;
                        case 11: Twelvth.setText("P");break;
                        case 12: Thirteenth.setText("P");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                    jButton17.setEnabled(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        char sr = 'X';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("X");break;
                        case 1: Second.setText("X");break;
                        case 2: Third.setText("X");break;
                        case 3: Fourth.setText("X");break;
                        case 4: Fifth.setText("X");break;
                        case 5: Sixth.setText("X");break;
                        case 6: Seventh.setText("X");break;
                        case 7: Eighth.setText("X");break;
                        case 8: Ninth.setText("X");break;
                        case 9: Tenth.setText("X");break;
                        case 10: Eleventh.setText("X");break;
                        case 11: Twelvth.setText("X");break;
                        case 12: Thirteenth.setText("X");break;
                       }
                    }
                } if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                      if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    if(error==6)
                      {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    } 
                jButton18.setEnabled(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        char sr = 'W';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                  
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("W");break;
                        case 1: Second.setText("W");break;
                        case 2: Third.setText("W");break;
                        case 3: Fourth.setText("W");break;
                        case 4: Fifth.setText("W");break;
                        case 5: Sixth.setText("W");break;
                        case 6: Seventh.setText("W");break;
                        case 7: Eighth.setText("W");break;
                        case 8: Ninth.setText("W");break;
                        case 9: Tenth.setText("W");break;
                        case 10: Eleventh.setText("W");break;
                        case 11: Twelvth.setText("W");break;
                        case 12: Thirteenth.setText("W");break;
                       }
                    }
                } if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                       if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }
                    if(error==6)
                       {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    } 
                jButton19.setEnabled(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        char sr = 'V';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("V");break;
                        case 1: Second.setText("V");break;
                        case 2: Third.setText("V");break;
                        case 3: Fourth.setText("V");break;
                        case 4: Fifth.setText("V");break;
                        case 5: Sixth.setText("V");break;
                        case 6: Seventh.setText("V");break;
                        case 7: Eighth.setText("V");break;
                        case 8: Ninth.setText("V");break;
                        case 9: Tenth.setText("V");break;
                        case 10: Eleventh.setText("V");break;
                        case 11: Twelvth.setText("V");break;
                        case 12: Thirteenth.setText("V");break;
                       }
                    }
                } if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                      if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    if(error==6)
                      {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                jButton20.setEnabled(false);
               
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        char sr = 'U';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("U");break;
                        case 1: Second.setText("U");break;
                        case 2: Third.setText("U");break;
                        case 3: Fourth.setText("U");break;
                        case 4: Fifth.setText("U");break;
                        case 5: Sixth.setText("U");break;
                        case 6: Seventh.setText("U");break;
                        case 7: Eighth.setText("U");break;
                        case 8: Ninth.setText("U");break;
                        case 9: Tenth.setText("U");break;
                        case 10: Eleventh.setText("U");break;
                        case 11: Twelvth.setText("U");break;
                        case 12: Thirteenth.setText("U");break;
                       }
                    }
                } if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                      if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    if(error==6)
                      {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                jButton21.setEnabled(false);
                
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        char sr = 'T';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("T");break;
                        case 1: Second.setText("T");break;
                        case 2: Third.setText("T");break;
                        case 3: Fourth.setText("T");break;
                        case 4: Fifth.setText("T");break;
                        case 5: Sixth.setText("T");break;
                        case 6: Seventh.setText("T");break;
                        case 7: Eighth.setText("T");break;
                        case 8: Ninth.setText("T");break;
                        case 9: Tenth.setText("T");break;
                        case 10: Eleventh.setText("T");break;
                        case 11: Twelvth.setText("T");break;
                        case 12: Thirteenth.setText("T");break;
                       }
                    }
                } if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                       {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                jButton22.setEnabled(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        char sr = 'S';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {  
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("S");break;
                        case 1: Second.setText("S");break;
                        case 2: Third.setText("S");break;
                        case 3: Fourth.setText("S");break;
                        case 4: Fifth.setText("S");break;
                        case 5: Sixth.setText("S");break;
                        case 6: Seventh.setText("S");break;
                        case 7: Eighth.setText("S");break;
                        case 8: Ninth.setText("S");break;
                        case 9: Tenth.setText("S");break;
                        case 10: Eleventh.setText("S");break;
                        case 11: Twelvth.setText("S");break;
                        case 12: Thirteenth.setText("S");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {  
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                      if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }  
                    if(error==6)
                      {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                    jButton23.setEnabled(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        char sr = 'R';
            int count=0;  
            for(int i=0;i<str.length();i++)
                { 
                     
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("R");break;
                        case 1: Second.setText("R");break;
                        case 2: Third.setText("R");break;
                        case 3: Fourth.setText("R");break;
                        case 4: Fifth.setText("R");break;
                        case 5: Sixth.setText("R");break;
                        case 6: Seventh.setText("R");break;
                        case 7: Eighth.setText("R");break;
                        case 8: Ninth.setText("R");break;
                        case 9: Tenth.setText("R");break;
                        case 10: Eleventh.setText("R");break;
                        case 11: Twelvth.setText("R");break;
                        case 12: Thirteenth.setText("R");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {  
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                     {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    } 
                    jButton24.setEnabled(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        char sr = 'Q';
            int count=0;  
            for(int i=0;i<str.length();i++)
                { 
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("Q");break;
                        case 1: Second.setText("Q");break;
                        case 2: Third.setText("Q");break;
                        case 3: Fourth.setText("Q");break;
                        case 4: Fifth.setText("Q");break;
                        case 5: Sixth.setText("Q");break;
                        case 6: Seventh.setText("Q");break;
                        case 7: Eighth.setText("Q");break;
                        case 8: Ninth.setText("Q");break;
                        case 9: Tenth.setText("Q");break;
                        case 10: Eleventh.setText("Q");break;
                        case 11: Twelvth.setText("Q");break;
                        case 12: Thirteenth.setText("Q");break;
                       }
                    }
                }
                    if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {  
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                     {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    }
                    jButton25.setEnabled(false);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        char sr = 'M';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                  
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("M");break;
                        case 1: Second.setText("M");break;
                        case 2: Third.setText("M");break;
                        case 3: Fourth.setText("M");break;
                        case 4: Fifth.setText("M");break;
                        case 5: Sixth.setText("M");break;
                        case 6: Seventh.setText("M");break;
                        case 7: Eighth.setText("M");break;
                        case 8: Ninth.setText("M");break;
                        case 9: Tenth.setText("M");break;
                        case 10: Eleventh.setText("M");break;
                        case 11: Twelvth.setText("M");break;
                        case 12: Thirteenth.setText("M");break;
                       }
                    }
                }
                        if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                     if(error!=6&&correct==str.length())
                    {Disabling();
                        win.setVisible(true);
                        
                    }   
                    if(error==6)
                    {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                    }
                        jButton26.setEnabled(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        char sr = 'Z';
            int count=0;  
            for(int i=0;i<str.length();i++)
                {   
                   
                    char a = str.charAt(i);
                    if(a==sr)
                    {   count++;correct++;
                        switch (i)
                      { case 0: First.setText("Z");break;
                        case 1: Second.setText("Z");break;
                        case 2: Third.setText("Z");break;
                        case 3: Fourth.setText("Z");break;
                        case 4: Fifth.setText("Z");break;
                        case 5: Sixth.setText("Z");break;
                        case 6: Seventh.setText("Z");break;
                        case 7: Eighth.setText("Z");break;
                        case 8: Ninth.setText("Z");break;
                        case 9: Tenth.setText("Z");break;
                        case 10: Eleventh.setText("Z");break;
                        case 11: Twelvth.setText("Z");break;
                        case 12: Thirteenth.setText("Z");break;
                       }
                    }
                }
            if(count==0)
                    {      
                         switch (error)
                         {  case 0: 
                            {   
                                Error1.setVisible(true);
                                error++;
                                break;
                            }
                            case 1: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(true);
                                error++;
                                break;
                            }
                            case 2: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(true);
                                error++;
                                break;
                            }
                            case 3: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(true);
                                error++;
                                break;
                            }
                            case 4: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(true);
                                error++;
                                break;
                            }
                            case 5: 
                            {   
                                Error1.setVisible(false);
                                Error2.setVisible(false);
                                Error3.setVisible(false);
                                Error4.setVisible(false);
                                Error5.setVisible(false);
                                Error6.setVisible(true);
                                error++;
                                break;
                            }
                            default:break;
                         }
                    }
                    if(error!=6&&correct==str.length())
                    {
                        win.setVisible(true);
                        Disabling();
                        
                    }    
                    if(error==6)
                      {word.setText("The correct word is "+str);
                        word.setVisible(true);
                        Disabling();
                        
                    } 
            jButton27.setEnabled(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eighth;
    private javax.swing.JLabel Eleventh;
    private javax.swing.JLabel Error1;
    private javax.swing.JLabel Error2;
    private javax.swing.JLabel Error3;
    private javax.swing.JLabel Error4;
    private javax.swing.JLabel Error5;
    private javax.swing.JLabel Error6;
    private javax.swing.JLabel Fifth;
    private javax.swing.JLabel First;
    private javax.swing.JLabel Fourth;
    private javax.swing.JLabel Ninth;
    private javax.swing.JLabel Second;
    private javax.swing.JLabel Seventh;
    private javax.swing.JLabel Sixth;
    private javax.swing.JLabel Tenth;
    private javax.swing.JLabel Third;
    private javax.swing.JLabel Thirteenth;
    private javax.swing.JLabel Twelvth;
    private javax.swing.JLabel hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel win;
    private javax.swing.JLabel word;
    // End of variables declaration//GEN-END:variables
}
