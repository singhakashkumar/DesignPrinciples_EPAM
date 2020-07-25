package com.epam.presentationlayer;

import javax.swing.SwingConstants;

import com.epam.logiclayer.ArithmeticOperation;

public class MainWindow extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
    
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {

        tfNumber1 = new javax.swing.JTextField();
        tfNumber2 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel("", SwingConstants.CENTER);
        btnSub = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfNumber1.setText("");

        tfNumber2.setText("");

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblResult.setText(" ");

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnMul.setText("*");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        Title.setText("Arithmetic Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDiv))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfNumber2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(tfNumber1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(8, 8, 8)
                        .addComponent(btnSub)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tfNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tfNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSub))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMul)
                    .addComponent(btnDiv))
                .addGap(78, 78, 78))
        );

        tfNumber2.getAccessibleContext().setAccessibleName("");

        pack();
    }                      

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    	
		try {
			number1 = Integer.parseInt(tfNumber1.getText().trim());
			number2 = Integer.parseInt(tfNumber2.getText().trim());
			ArithmeticOperation ao = new ArithmeticOperation();
			ao.getNumbers(number1, number2);
			lblResult.setText("Result = " + ao.addition());
		}
		catch(NumberFormatException e) {
			lblResult.setText("Enter Valid Integers Only");
		}
    }                                      

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			number1 = Integer.parseInt(tfNumber1.getText().trim());
			number2 = Integer.parseInt(tfNumber2.getText().trim());
			ArithmeticOperation ao = new ArithmeticOperation();
			ao.getNumbers(number1, number2);
			lblResult.setText("Result = " + ao.subtraction());
			
		}
		catch(NumberFormatException e) {
			lblResult.setText("Enter Valid Integers Only");
		}
    }                                      

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	try {
			number1 = Integer.parseInt(tfNumber1.getText().trim());
			number2 = Integer.parseInt(tfNumber2.getText().trim());
			ArithmeticOperation ao = new ArithmeticOperation();
			ao.getNumbers(number1, number2);
			lblResult.setText("Result = " + ao.multiplication());
		}
		catch(NumberFormatException e) {
			lblResult.setText("Enter Valid Integers Only");
		}
    }                                      
    
    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	try {
			number1 = Integer.parseInt(tfNumber1.getText().trim());
			number2 = Integer.parseInt(tfNumber2.getText().trim());
			if(number2 == 0) {
				lblResult.setText("Divide By Zero Error");
				return ;
			}
			ArithmeticOperation ao = new ArithmeticOperation();
			ao.getNumbers(number1, number2);
			lblResult.setText("Result = " + ao.division());
			
		}
		catch(NumberFormatException e) {
			lblResult.setText("Enter Valid Integers Only");
		}
    }

    // Variables declaration                     
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField tfNumber1;
    private javax.swing.JTextField tfNumber2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel Title;
    private int number1;
    private int number2;
    // End of variables declaration                   
}
