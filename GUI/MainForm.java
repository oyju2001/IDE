import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.MutableComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class MainForm extends javax.swing.JFrame {
	
	static MainForm myForm;

	public MainForm() {
        initComponents();
    }

	@SuppressWarnings("unchecked")
                   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new JList(new DefaultListModel<String>());
        jScrollPane3 = new javax.swing.JScrollPane();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(1400, 750));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("굴림", 1, 28)); // NOI18N
        jLabel1.setText("파이");

        jComboBox3.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "파이1", "파이2", "파이3", "파이4" }));
        
        jComboBox4.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("굴림", 1, 28)); // NOI18N
        jLabel2.setText("센서");
        
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 81, Short.MAX_VALUE))
        );

        jButton1.setText("설정");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("확인");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
        tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
      
        jScrollPane1.setViewportView(jList1);
        
         
        
        
        jTabbedPane1.addTab("tab1", jScrollPane1);
        jTabbedPane1.addTab("tab2", jScrollPane3);

        jButton3.setFont(new java.awt.Font("굴림", 1, 36)); // NOI18N
        jButton3.setText("구동");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("굴림", 0, 20)); // NOI18N
        jLabel3.setText("2017-08-04 22:22:22");

        jLabel4.setFont(new java.awt.Font("굴림", 1, 28)); // NOI18N
        jLabel4.setText("침입 없음");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setText("180722");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("180730");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton4.setText("검색");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("침입만 보기");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("~");

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane2.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "날짜", "시간", "침입여부"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
        jTable1.getColumn("날짜").setPreferredWidth(80);
        jTable1.getColumn("날짜").setCellRenderer(tScheduleCellRenderer);
        jTable1.getColumn("시간").setPreferredWidth(80);
        jTable1.getColumn("시간").setCellRenderer(tScheduleCellRenderer);
        jTable1.getColumn("침입여부").setPreferredWidth(80);
        jTable1.getColumn("침입여부").setCellRenderer(tScheduleCellRenderer);
        
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 82, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField2)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                     
	
	public static String timeStamp2Date(String seconds,String format) {
		if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
			return "";
		}
		if(format == null || format.isEmpty()) format = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(seconds+"000")));
	} //이용 형식 : String date = timeStamp2Date(timeStamp, "yyyy-MM-dd HH:mm:ss");

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	
		JDialog optionDialog = new JDialog();
		JComboBox<String> njComboBox1 = new javax.swing.JComboBox<>();
		JComboBox<String> njComboBox2 = new javax.swing.JComboBox<>();
		javax.swing.JTextField njTextField3 = new javax.swing.JTextField();
		javax.swing.JLabel njLabel6 = new javax.swing.JLabel();
		javax.swing.JLabel njLabel7 = new javax.swing.JLabel();
		javax.swing.JButton njButton5 = new javax.swing.JButton();
		javax.swing.JLabel njLabel8 = new javax.swing.JLabel();
		javax.swing.JLabel njLabel9 = new javax.swing.JLabel();
		javax.swing.JLabel njLabel10 = new javax.swing.JLabel();
		
		
		njComboBox1.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        njComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "파이1", "파이2", "파이3", "파이4" }));

        njComboBox2.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        
        njComboBox1.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		njComboBox1ActionPerformed(evt);
        	}

			private void njComboBox1ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				njComboBox2.removeAll();
				njLabel8.setText(njComboBox1.getSelectedItem() + " null 현재 주기 : ");
				njLabel9.setText("null");
		    	
		    	DefaultComboBoxModel<String> first = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});	
				DefaultComboBoxModel<String> second = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});
				DefaultComboBoxModel<String> third = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});
				DefaultComboBoxModel<String> fourth = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});

				if(njComboBox1.getSelectedItem().equals("파이1")){
					njComboBox2.setModel(first);
				}else if(njComboBox1.getSelectedItem().equals("파이2")){
					njComboBox2.setModel(second);
				}else if(njComboBox1.getSelectedItem().equals("파이3")){
					njComboBox2.setModel(third);
				}else if(njComboBox1.getSelectedItem().equals("파이4")){
					njComboBox2.setModel(fourth);
				}
			}
        });
        
        String[] timedata = {"3","3","3","3","3","3","3","3"};
        
        njComboBox2.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		njComboBox2ActionPerformed(evt);
        	}

			private void njComboBox2ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
		        njLabel8.setText(njComboBox1.getSelectedItem() +" "+njComboBox2.getSelectedItem() +" 현재 주기 : ");
		        
		        int pi = returnPieSensor((String) njComboBox1.getSelectedItem());
				int se = returnSensor((String) njComboBox2.getSelectedItem());
				for(int i=0; i<8; i++){
					if(useStringArr(pi,se).equals(arr[i])){
						njLabel9.setText(timedata[i]);
						break;
					}	
				}
			}
			
        });
        	
        njTextField3.setText("");
        njTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                njTextField3ActionPerformed(evt);
            }

			private void njTextField3ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        njLabel6.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        njLabel6.setText("주기 설정");

        njLabel7.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        njLabel7.setText("분");

        njButton5.setText("확인");
        njButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                njButton5ActionPerformed(evt);
            }

			private void njButton5ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				String n = njTextField3.getText();
				int flag = 3;
	    		int pi = returnPieSensor((String) njComboBox1.getSelectedItem());
	    		int se = returnSensor((String) njComboBox2.getSelectedItem());
	    		String data = n;
	    		
	    		Packet p = new Packet(flag, pi, se, 0, data);
	    		ContainerClient client =  new ContainerClient(server, port, containerPort, p);
	    		client.start();			
			}
        });

        njLabel8.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        njLabel8.setText("X파이 X센서 현재 주기 : ");

        njLabel9.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        njLabel9.setText("0");
        
        njLabel10.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        njLabel10.setText("분");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(optionDialog.getContentPane());
        optionDialog.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(njLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(njTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(njLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(njButton5))
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addComponent(njComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(njComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addComponent(njLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(njLabel9)
                            .addGap(28, 28, 28)
                            .addComponent(njLabel10)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(njComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(njComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(njLabel8)
                    .addComponent(njLabel9)
                    .addComponent(njLabel10))
                .addGap(28, 28, 28)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(njTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(njLabel6)
                    .addComponent(njLabel7)
                    .addComponent(njButton5))
                .addGap(65, 65, 65))
        );
		
		
		optionDialog.setTitle("IDE option");
		//optionDialog.add(closeButton, "South");
		
		optionDialog.setBounds(10, 10, 500, 300);
		optionDialog.setVisible(true);
		optionDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
    	
    	
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	
    	int pi = returnPieSensor((String) jComboBox3.getSelectedItem());
		int se = returnSensor((String) jComboBox4.getSelectedItem());
		for(int i=0; i<8; i++){
			if(useStringArr(pi,se).equals(arr[i])){
				jButton3.setText(arr2[i]);
				break;
			}	
		}
		
    	
    }        
    
    private String useStringArr(int a, int b){
    	if(a==1 && b==4){
    		return arr[0];
    	}else if(a==1 && b==5){
    		return arr[1];
    	}else if(a==2 && b==4){
    		return arr[2];
    	}else if(a==2 && b==5){
    		return arr[3];
    	}else if(a==3 && b==4){
    		return arr[4];
    	}else if(a==3 && b==5){
    		return arr[5];
    	}else if(a==4 && b==4){
    		return arr[6];
    	}else if(a==4 && b==5){
    		return arr[7];
    	}
    	return "0";
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	
    	JButton b = (JButton)evt.getSource();
    	
    	if(b.getText().equals("구동")){	
    		b.setText("중지");
    		
    		int flag = 2;
    		int pi = returnPieSensor((String) jComboBox3.getSelectedItem());
    		int se = returnSensor((String) jComboBox4.getSelectedItem());
    		String data = "ON";
    		
    		for(int i=0; i<8; i++){
    			if(useStringArr(pi,se).equals(arr[i])){
    				arr2[i] = "중지";
    				break;
    			}	
    		}
    		
    		
    		Packet p = new Packet(flag, pi, se, 0, data);
    		ContainerClient client =  new ContainerClient(server, port, containerPort, p);
    		client.start();
    		
    	}else{
    		b.setText("구동");
    		
    		int flag = 2;
    		int pi = returnPieSensor((String) jComboBox3.getSelectedItem());
    		int se = returnSensor((String) jComboBox4.getSelectedItem());
    		String data = "OFF";
    		
    		for(int i=0; i<8; i++){
    			if(useStringArr(pi,se).equals(arr[i])){
    				arr2[i] = "구동";
    				break;
    			}	
    		}
    		
    		Packet p = new Packet(flag, pi, se, 0, data);
    		ContainerClient client =  new ContainerClient(server, port, containerPort, p);
    		client.start();
    		
    	}
    	
    	
    }                                        
    

    public void setList(Packet packet){
    	StringBuffer arr = new StringBuffer();
    	arr.append("파이 : ");
    	arr.append(packet.sys_id);
    	arr.append("  , 센서 : ");
    	arr.append(packet.sen_id);
    	arr.append("  , 시간 : ");
    	arr.append(timeStamp2Date(String.valueOf(packet.timestamp), "yyyy-MM-dd HH:mm:ss"));
    	arr.append("  , 데이터 : ");
    	arr.append(packet.data);
    	String acv = arr.toString();
    	
   	 	DefaultListModel model = (DefaultListModel) jList1.getModel();
   	 	model.addElement(acv);
   	 	
   	 	arr = null;
    }
    
    private int returnPieSensor(String tex){
    	if(tex.equals("파이1")){
    		return 1;
    	}else if(tex.equals("파이2")){
    		return 2;
    	}else if(tex.equals("파이3")){
    		return 3;
    	}else if(tex.equals("파이4")){
    		return 4;
    	}
    	return 0;
    }
    
    private int returnSensor(String tex){
    	if(tex.equals("센서1")){
    		return 4;
    	}else if(tex.equals("센서2")){
    		return 5;
    	}
    	return 0;
    }
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	
    	jComboBox4.removeAllItems();
    	
    	DefaultComboBoxModel<String> first = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});	
		DefaultComboBoxModel<String> second = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});
		DefaultComboBoxModel<String> third = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});
		DefaultComboBoxModel<String> fourth = new DefaultComboBoxModel<String>(new String[]{"센서1","센서2"});

		if(jComboBox3.getSelectedItem().equals("파이1")){
			jComboBox4.setModel(first);
		}else if(jComboBox3.getSelectedItem().equals("파이2")){
			jComboBox4.setModel(second);
		}else if(jComboBox3.getSelectedItem().equals("파이3")){
			jComboBox4.setModel(third);
		}else if(jComboBox3.getSelectedItem().equals("파이4")){
			jComboBox4.setModel(fourth);
		}
    	
    }                                          

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args ) {
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       
       
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	myForm = new MainForm();
                myForm.setVisible(true);
                
            }
        });
        
        UDPServer UDP = new UDPServer();
        UDP.start();
        
       while(true){
                	if(UDP.IsExist() == true){
                			Packet p = UDP.getPacket();
                				myForm.setList(p);
                	}
                	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
        
    } 
    public String server = "192.168.137.129";  //localhost
    public int port = 2559;
    public int containerPort = 8094;

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private String[] arr = {"1-1","1-2","2-1","2-2","3-1","3-2","4-1","4-2" };
    private String[] arr2 = {"구동","구동","구동","구동","구동","구동","구동","구동"};
              
}
