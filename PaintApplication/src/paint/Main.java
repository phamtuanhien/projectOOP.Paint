/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tuan Hien
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private PaintPanel paintPanel;
    private JPanel backgroundPanel = new JPanel();
    private BufferedImage buff_img;
    public Main() {
        initComponents();
        paintPanel = new PaintPanel(800, 400);
        backgroundPanel.setLayout(null);
        backgroundPanel.setBackground(new Color(219, 228, 241));
        backgroundPanel.setPreferredSize(new Dimension(paintPanel.getWidth()+10,paintPanel.getHeight()+10));
        backgroundPanel.add(paintPanel);
        jScrollPane.setViewportView(backgroundPanel);
    }
    
    
    //che do ve
    public static enum DrawMode {PENCIL, ERASER, FILL, COLORPICKER, TEXT, MAGNIFIER}
    private DrawMode drawMode = DrawMode.PENCIL;
    public DrawMode getDrawMode() {
        return drawMode;
    }
    public void setDrawMode(DrawMode newDrawMode) {
        this.drawMode = newDrawMode;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelOption = new javax.swing.JPanel();
        bPaste = new javax.swing.JButton();
        bCopy = new javax.swing.JButton();
        bCut = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        bSelect = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        cbRotate = new javax.swing.JComboBox<>();
        bUndo = new javax.swing.JButton();
        bRedo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bPencil = new javax.swing.JToggleButton();
        bEraser = new javax.swing.JToggleButton();
        bFill = new javax.swing.JToggleButton();
        bColorPicker = new javax.swing.JToggleButton();
        bText = new javax.swing.JToggleButton();
        bMagnifier = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanelView = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jNew = new javax.swing.JMenuItem();
        jOpen = new javax.swing.JMenuItem();
        jSave = new javax.swing.JMenuItem();
        jSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        setName("MainFrame"); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanelOption.setBackground(new java.awt.Color(245, 245, 245));

        bPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/paste.png"))); // NOI18N
        bPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPasteActionPerformed(evt);
            }
        });

        bCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/copy.png"))); // NOI18N
        bCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCopyActionPerformed(evt);
            }
        });

        bCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/cut.png"))); // NOI18N
        bCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCutActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(1, 0));

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ClipBoard");

        bSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/selection.png"))); // NOI18N
        bSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(245, 245, 245));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select");

        cbRotate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rotate", "Rotate right 90º", "Rotate left 90º", "Flip vertical", "Flip horizontal" }));
        cbRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRotateActionPerformed(evt);
            }
        });

        bUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/undo.png"))); // NOI18N
        bUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUndoActionPerformed(evt);
            }
        });

        bRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/redo.png"))); // NOI18N
        bRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRedoActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setPreferredSize(new java.awt.Dimension(1, 0));

        jLabel3.setBackground(new java.awt.Color(245, 245, 245));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Image");

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Undo");

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Redo");

        bPencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/pencil.png"))); // NOI18N
        bPencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPencilActionPerformed(evt);
            }
        });

        bEraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/eraser.png"))); // NOI18N
        bEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEraserActionPerformed(evt);
            }
        });

        bFill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/fill.png"))); // NOI18N
        bFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFillActionPerformed(evt);
            }
        });

        bColorPicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/color-picker.png"))); // NOI18N
        bColorPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColorPickerActionPerformed(evt);
            }
        });

        bText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/A.png"))); // NOI18N
        bText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTextActionPerformed(evt);
            }
        });

        bMagnifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/search.png"))); // NOI18N
        bMagnifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMagnifierActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tools");

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setPreferredSize(new java.awt.Dimension(1, 0));

        javax.swing.GroupLayout jPanelOptionLayout = new javax.swing.GroupLayout(jPanelOption);
        jPanelOption.setLayout(jPanelOptionLayout);
        jPanelOptionLayout.setHorizontalGroup(
            jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionLayout.createSequentialGroup()
                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbRotate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOptionLayout.createSequentialGroup()
                            .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                        .addComponent(bPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                        .addComponent(bColorPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bText, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(10, 10, 10)
                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bFill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMagnifier, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        jPanelOptionLayout.setVerticalGroup(
            jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOptionLayout.createSequentialGroup()
                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelOptionLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelOptionLayout.createSequentialGroup()
                                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                                        .addComponent(cbRotate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelOptionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelOptionLayout.createSequentialGroup()
                                .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(bPaste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelOptionLayout.createSequentialGroup()
                                                .addComponent(bCopy)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bCut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanelOptionLayout.createSequentialGroup()
                                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bPencil)
                                            .addComponent(bEraser)
                                            .addComponent(bFill))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bColorPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bText)
                                            .addComponent(bMagnifier))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Option", jPanelOption);

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View", jPanelView);

        jScrollPane.setAlignmentX(0.0F);
        jScrollPane.setAlignmentY(0.0F);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(100, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(100, 30));

        jMenu1.setText("File");
        jMenu1.setMaximumSize(new java.awt.Dimension(40, 32767));
        jMenu1.setPreferredSize(new java.awt.Dimension(30, 24));

        jNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/new.png"))); // NOI18N
        jNew.setText("New");
        jNew.setPreferredSize(new java.awt.Dimension(250, 45));
        jNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewActionPerformed(evt);
            }
        });
        jMenu1.add(jNew);

        jOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jOpen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/open.png"))); // NOI18N
        jOpen.setText("Open");
        jOpen.setPreferredSize(new java.awt.Dimension(250, 45));
        jOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jOpen);

        jSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/save.png"))); // NOI18N
        jSave.setText("Save");
        jSave.setPreferredSize(new java.awt.Dimension(250, 45));
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jSave);

        jSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jSaveAs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/saveas.png"))); // NOI18N
        jSaveAs.setText("Save As");
        jSaveAs.setPreferredSize(new java.awt.Dimension(250, 45));
        jSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jSaveAs);
        jMenu1.add(jSeparator1);

        jExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagebutton/exit.png"))); // NOI18N
        jExit.setText("Exit");
        jExit.setPreferredSize(new java.awt.Dimension(250, 45));
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenu1.add(jExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNewActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        // TODO add your handling code here:
        saveImage();
    }//GEN-LAST:event_jSaveActionPerformed

    private void saveImage() {
        buff_img = paintPanel.getImage();
        JFileChooser fileChoose = new JFileChooser();
        fileChoose.setDialogTitle("Save Image");
        int userSelection = fileChoose.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File f = fileChoose.getSelectedFile();
            String path = f.getAbsolutePath();
            try {
                ImageIO.write(buff_img, "png", new File(path+"."+"png"));
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    private void jSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSaveAsActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jExitActionPerformed

    private void bPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPasteActionPerformed

    private void jOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter png = new FileNameExtensionFilter("PNG (*.png)", "png");
        fileChooser.setFileFilter(png);
        FileNameExtensionFilter jpg = new FileNameExtensionFilter("JPEG (*.jpeg, *.jpg, *.jpe, *.jfif)", "jpg", "jpeg", "jpe", "jfif");
        fileChooser.setFileFilter(jpg);
        FileNameExtensionFilter all = new FileNameExtensionFilter("All Picture Files", "bmp", "dib", "jpg", "jpeg", "jpe", "jfif", "gif", "tif", "tiff", "png", "ico");
        fileChooser.setFileFilter(all);
        fileChooser.setDialogTitle("Open a new image");
        int check = fileChooser.showSaveDialog(null);
        BufferedImage img = null;
        if (check == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                img = ImageIO.read(file);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (img != null) {
            paintPanel.setImage(img);
            backgroundPanel.setPreferredSize(new Dimension(paintPanel.getWidth()+5,paintPanel.getHeight()+5));
        }  
    }//GEN-LAST:event_jOpenActionPerformed

    private void bSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSelectActionPerformed

    private void bCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCopyActionPerformed

    private void bCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCutActionPerformed

    private void cbRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRotateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRotateActionPerformed

    private void bUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUndoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUndoActionPerformed

    private void bRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRedoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRedoActionPerformed

    private void bPencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPencilActionPerformed
        // TODO add your handling code here:
        setDrawMode(drawMode.PENCIL);
    }//GEN-LAST:event_bPencilActionPerformed

    private void bColorPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColorPickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bColorPickerActionPerformed

    private void bEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEraserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEraserActionPerformed

    private void bTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bTextActionPerformed

    private void bFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFillActionPerformed

    private void bMagnifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMagnifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMagnifierActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bColorPicker;
    private javax.swing.JButton bCopy;
    private javax.swing.JButton bCut;
    private javax.swing.JToggleButton bEraser;
    private javax.swing.JToggleButton bFill;
    private javax.swing.JToggleButton bMagnifier;
    private javax.swing.JButton bPaste;
    private javax.swing.JToggleButton bPencil;
    private javax.swing.JButton bRedo;
    private javax.swing.JToggleButton bSelect;
    private javax.swing.JToggleButton bText;
    private javax.swing.JButton bUndo;
    private javax.swing.JComboBox<String> cbRotate;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jNew;
    private javax.swing.JMenuItem jOpen;
    private javax.swing.JPanel jPanelOption;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JMenuItem jSave;
    private javax.swing.JMenuItem jSaveAs;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
