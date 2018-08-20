package project_peter_client;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.net.www.http.ChunkedOutputStream;
import javax.swing.*;
import sun.audio.*;
import java.awt.event.*;
import java.io.*;

public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama(Socket socket) {
        this.socket = socket;
    }

    Socket socket;
    BufferedReader input;
    PrintStream output;
    private String username;
    Music lagu = new Music();

    public MenuUtama() {
        initComponents();
        this.getRootPane().setDefaultButton(btnKirimPesan);
    }
    

    public MenuUtama(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboLobby = new javax.swing.JComboBox<String>();
        lblNamaPilih = new javax.swing.JLabel();
        profil = new javax.swing.JLabel();
        btnScore = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        txtPesan = new javax.swing.JTextField();
        btnKirimPesan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarPublicChat = new javax.swing.JTextArea();
        lblUsername = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnTambahSoal = new javax.swing.JButton();
        btnCreateLobby = new javax.swing.JButton();
        txtNamaLobby = new javax.swing.JTextField();
        btnTambahLobby = new javax.swing.JButton();
        lblPilih = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lobby");
        setLocation(new java.awt.Point(50, 50));
        setPreferredSize(new java.awt.Dimension(905, 625));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        cboLobby.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(cboLobby);
        cboLobby.setBounds(240, 190, 250, 40);

        lblNamaPilih.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNamaPilih.setText("Pilih Lobby :");
        getContentPane().add(lblNamaPilih);
        lblNamaPilih.setBounds(120, 190, 140, 40);

        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profil_128.png"))); // NOI18N
        getContentPane().add(profil);
        profil.setBounds(640, 190, 130, 130);

        btnScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnScore.setText("Skor");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnScore);
        btnScore.setBounds(640, 360, 128, 30);

        btnPlay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlay.setText("Masuk");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay);
        btnPlay.setBounds(640, 400, 128, 30);

        txtPesan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtPesan);
        txtPesan.setBounds(120, 480, 410, 30);

        btnKirimPesan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKirimPesan.setText("Kirim");
        btnKirimPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimPesanActionPerformed(evt);
            }
        });
        getContentPane().add(btnKirimPesan);
        btnKirimPesan.setBounds(540, 480, 80, 30);

        tarPublicChat.setEditable(false);
        tarPublicChat.setColumns(20);
        tarPublicChat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tarPublicChat.setRows(5);
        jScrollPane2.setViewportView(tarPublicChat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(119, 245, 500, 220);

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Nama Player");
        getContentPane().add(lblUsername);
        lblUsername.setBounds(640, 330, 130, 17);

        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(640, 480, 128, 30);

        btnTambahSoal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTambahSoal.setText("Tambah Soal");
        btnTambahSoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahSoalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambahSoal);
        btnTambahSoal.setBounds(640, 440, 128, 30);

        btnCreateLobby.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreateLobby.setText("Buat Lobby");
        btnCreateLobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLobbyActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateLobby);
        btnCreateLobby.setBounds(500, 190, 120, 40);

        txtNamaLobby.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNamaLobby);
        txtNamaLobby.setBounds(250, 190, 240, 40);

        btnTambahLobby.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTambahLobby.setText("Tambah Lobby");
        btnTambahLobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahLobbyActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambahLobby);
        btnTambahLobby.setBounds(500, 190, 120, 40);

        lblPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        getContentPane().add(lblPilih);
        lblPilih.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        
        try {
            output = new PrintStream(socket.getOutputStream());
            lagu.stop();
            output.println("/enterLobby "+(cboLobby.getSelectedIndex()+1));
        } catch (IOException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnKirimPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimPesanActionPerformed
        String pesan =txtPesan.getText();
        if(!pesan.isEmpty()){
            try {
                output = new PrintStream(socket.getOutputStream());
                output.println("/chat public "+getUsername()+"; "+pesan);
                tarPublicChat.append("saya : "+pesan+"\n");
                txtPesan.setText("");
            } catch (IOException ex) {
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            

    }//GEN-LAST:event_btnKirimPesanActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            output = new PrintStream(socket.getOutputStream());
            output.println("/keluar");
        } catch (IOException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lagu.menu();
        lblUsername.setText(getUsername());
        String pesan =txtPesan.getText();
        try {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintStream(socket.getOutputStream());
            output.println("/nama lobby");
            new Thread(new Runnable(){
                @Override
                public void run() {
                    while(true){
                        try {
                            Thread.sleep(100);
                            String message = input.readLine();
                            if(message.startsWith("/chat;")){
                                String pesan = message.split(";")[1];
                                tarPublicChat.append(pesan+"\n");
                            }
                            else if(message.startsWith("/combobox;")){
                                String namaLobby = message.split(";")[1];
                                cboLobby.addItem(namaLobby);
                            }else if(message.startsWith("/lobbyIsActive")){
                                JOptionPane.showMessageDialog(null,"Lobby sedang aktif");
                            }
                            else if(message.startsWith("/fullLobby")){
                                JOptionPane.showMessageDialog(null,"Lobby penuh");
                            }
                            else if(message.startsWith("/enterLobbyFailed")){
                                JOptionPane.showMessageDialog(null,"Tidak bisa masuk lobby");
                            }
                            else if(message.startsWith("/lobbyBaruTerbuat")){
                                cboLobby.removeAllItems();
                                JOptionPane.showMessageDialog(null,"Lobby baru terbuat");
                                output.println("/nama lobby");
                            }
                            else if(message.startsWith("/gagalBuatLobby")){
                                JOptionPane.showMessageDialog(null,"Gagal membuat lobby");
                            }
                            else if(message.startsWith("/enterLobbySuccesed")){
                                RoomGame gameRoom = new RoomGame();
                                gameRoom.setSocket(socket);
                                gameRoom.setUsername(username);
                                gameRoom.setIdLobby(cboLobby.getSelectedIndex()+1);
                                lagu.stop();
                                close();
                                gameRoom.setVisible(true);
                                break;
                            }
                            else if(message.startsWith("/enterScore")){
                                Score score = new Score();
                                score.setUsername(username);
                                score.setSocket(socket);
                                score.setVisible(true);
                                close();
                                break;
                            }
                            else if(message.startsWith("/enterMenuSoal")){
                                TambahSoal soal = new TambahSoal();
                                soal.setUsername(username);
                                soal.setSocket(socket);
                                soal.setVisible(true);
                                close();
                                break;
                            }
                            else if(message.startsWith("/keluar")){
                                Login login = new Login();
                                login.setVisible(true);
                                close();
                                break;
                            }
                        } catch (InterruptedException | IOException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }).start();
        } catch (IOException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_formWindowOpened
    private void close()
    {   
        lagu.stop();
        this.dispose();
    }
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        try {
            output = new PrintStream(socket.getOutputStream());
            output.println("/keluar");
        } catch (IOException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        try {
            output = new PrintStream(socket.getOutputStream());
            output.println("/MenuScore");
        } catch (IOException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnTambahSoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahSoalActionPerformed
        try {
            output = new PrintStream(socket.getOutputStream());
            output.println("/MenuTambahSoal");
        } catch (IOException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahSoalActionPerformed

    private void btnTambahLobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahLobbyActionPerformed
        if(!txtNamaLobby.getText().trim().isEmpty()){
            try {
                output = new PrintStream(socket.getOutputStream());
                output.println("/buatLobbyBaru;"+txtNamaLobby.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
            btnCreateLobby.setVisible(true);
            cboLobby.setVisible(true);
            lblNamaPilih.setText("Pilih Lobby :");
            txtNamaLobby.setVisible(false);
            txtNamaLobby.setText("");
            btnTambahLobby.setVisible(false);
        }
        else{
            btnCreateLobby.setVisible(true);
            cboLobby.setVisible(true);
            lblNamaPilih.setText("Pilih Lobby :");
            txtNamaLobby.setVisible(false);
            txtNamaLobby.setText("");
            btnTambahLobby.setVisible(false);
        }
            
    }//GEN-LAST:event_btnTambahLobbyActionPerformed

    private void btnCreateLobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLobbyActionPerformed
        btnCreateLobby.setVisible(false);
        cboLobby.setVisible(false);
        lblNamaPilih.setText("Nama Lobby :");
        txtNamaLobby.setVisible(true);
        txtNamaLobby.setText("");
        btnTambahLobby.setVisible(true);
    }//GEN-LAST:event_btnCreateLobbyActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateLobby;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKirimPesan;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnTambahLobby;
    private javax.swing.JButton btnTambahSoal;
    private javax.swing.JComboBox<String> cboLobby;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNamaPilih;
    private javax.swing.JLabel lblPilih;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel profil;
    private javax.swing.JTextArea tarPublicChat;
    private javax.swing.JTextField txtNamaLobby;
    private javax.swing.JTextField txtPesan;
    // End of variables declaration//GEN-END:variables
}
