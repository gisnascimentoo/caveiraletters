/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.AtorJogador;
import model.Jogador;

/**
 *
 * @author rodolfolottin
 */
public class JMesa extends javax.swing.JFrame {

    AtorJogador atorJogador;
    protected static final int START = 1;
    protected static final int CONECTADO = 2;
    
    public JMesa() {
        initComponents();
        this.setResizable(false);
        this.atualizarVisibilidadeTela(START);
        atorJogador = new AtorJogador(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMesa = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemConectar = new javax.swing.JMenuItem();
        jMenuItemIniciarPartida = new javax.swing.JMenuItem();
        jMenuItemDesconectar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMesa.setForeground(new java.awt.Color(219, 21, 255));

        javax.swing.GroupLayout jPanelMesaLayout = new javax.swing.GroupLayout(jPanelMesa);
        jPanelMesa.setLayout(jPanelMesaLayout);
        jPanelMesaLayout.setHorizontalGroup(
            jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanelMesaLayout.setVerticalGroup(
            jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        jMenuItemConectar.setText("Conectar");
        jMenuItemConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConectarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemConectar);

        jMenuItemIniciarPartida.setText("Iniciar partida");
        jMenuItemIniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarPartidaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemIniciarPartida);

        jMenuItemDesconectar.setText("Desconectar");
        jMenuItemDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDesconectarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDesconectar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConectarActionPerformed
        this.conectar();
    }//GEN-LAST:event_jMenuItemConectarActionPerformed

     public String getNomeJogador() {
        return JOptionPane.showInputDialog(this, "Digite seu nome: ", "jogador");
    }

    public String getNomeServidor() {
        return JOptionPane.showInputDialog(this, "Digite o servidor: ", "localhost");
    }

    public void conectar() {
                
        String nomeAtual =  this.getNomeJogador();
        String servidor = this.getNomeServidor();

        boolean conectou = atorJogador.conectar(servidor, nomeAtual);
        //atorJogador.setJogadorAtual(new Jogador(nomeAtual));

        if (conectou) {
            this.adicionarTitulo(nomeAtual);
            this.atualizarVisibilidadeTela(CONECTADO);
            this.exibeMensagem("Conectado com sucesso!");
        } else {
            this.exibeMensagem("Não foi possível se conectar!");
        }
    }

    private void adicionarTitulo(String nome) {
        this.setTitle(nome);
    }
    
    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
    
    public void atualizarVisibilidadeTela(int mode) {
        
        if (mode == START) {
            jMenuItemConectar.setEnabled(true);
            jMenuItemDesconectar.setEnabled(false);
            jMenuItemIniciarPartida.setEnabled(false);
        } else if (mode == CONECTADO) {
            jMenuItemDesconectar.setEnabled(true);
            jMenuItemIniciarPartida.setEnabled(true);
            jMenuItemConectar.setEnabled(false);
        }
    }
    
    public void limpaTodosCampos() {
        //FUNÇÃO UTILIZADA PARA LIMPAR TODOS OS CAMPOS DA MESA
    }
    
    private void jMenuItemIniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarPartidaActionPerformed
        //atorJogador.iniciarPartida();
    }//GEN-LAST:event_jMenuItemIniciarPartidaActionPerformed

    private void jMenuItemDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDesconectarActionPerformed
        atorJogador.desconectar();
    }//GEN-LAST:event_jMenuItemDesconectarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemConectar;
    private javax.swing.JMenuItem jMenuItemDesconectar;
    private javax.swing.JMenuItem jMenuItemIniciarPartida;
    private javax.swing.JPanel jPanelMesa;
    // End of variables declaration//GEN-END:variables
}
