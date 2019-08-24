
package javaass1;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author prutu
 */
public class home extends javax.swing.JFrame {

    private String choice;
    private String ride;
    private String fclass;
    private String size;
    private String item;
    private PreparedStatement pst;
   
  
    public home() {
        initComponents();
        show_user();
        this.setLocationRelativeTo(null);
        
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        
        jPanel7.add(HomePanel);
        jPanel7.repaint();
        jPanel7.revalidate();
    }
    //find the data from the table
       public ArrayList<SheSearch> userList(String ValToSearch){
       ArrayList<SheSearch> userList = new ArrayList<>();
           
       try{
       
        String query = "SELECT * FROM `flightinfo` WHERE `From` LIKE '%" +ValToSearch+"%';";  
        PreparedStatement ps;
        ResultSet rs;
        ps =  sqlconnection.getConnection().prepareStatement(query);
        rs= ps.executeQuery(query);
        SheSearch user;
      
          while(rs.next()){
              user = new SheSearch(
                      rs.getString("FlightNo"),
                      rs.getString("From"),
                      rs.getString("To"),
                      rs.getDate("DeptDate"),
                      rs.getDate("ArrDate"),
                      rs.getString("Time")
              );
                userList.add(user);
          }
           JOptionPane.showMessageDialog(null, " Submitted");         
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Not Submitted");
       } 
          return userList;
       }
          private void show_user(){
           
           
       ArrayList<SheSearch> list = userList(tsfrom.getText());
       DefaultTableModel model = new DefaultTableModel();
       model.setColumnIdentifiers(new Object[]{"FlightInfo","From","To","DepDate","ArrDate","Time"});
       Object[] row = new Object[6];
       
       for(int i = 0;i<list.size();i++){
       
           row[0] = list.get(i).getFlightno();
           row[1] = list.get(i).getFrom();
           row[2] = list.get(i).getTo();
           row[3] = list.get(i).getDepdate();
           row[4] = list.get(i).getArrdate();
           row[5] = list.get(i).getTime();
           model.addRow(row);
       }
           jTable1.setModel(model);
           tbtable.setModel(model);
       }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TimeSchedule = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TicketBooking = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CargoService = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PrivateJets = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TBPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tbfrom = new javax.swing.JTextField();
        ardate = new javax.swing.JTextField();
        business = new javax.swing.JRadioButton();
        first = new javax.swing.JRadioButton();
        economy = new javax.swing.JRadioButton();
        dedate = new javax.swing.JTextField();
        adults = new javax.swing.JTextField();
        children = new javax.swing.JTextField();
        infants = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        tbto = new javax.swing.JTextField();
        submit = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        CargoPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cfrom = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        rname = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cto = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        liquid = new javax.swing.JRadioButton();
        metel = new javax.swing.JRadioButton();
        glass = new javax.swing.JRadioButton();
        stationary = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        rdate = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        sdate = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        PJPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Heli = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        MJet = new javax.swing.JCheckBox();
        Ljet = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Pfrom = new javax.swing.JTextField();
        Pto = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Ppass = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Pdate = new javax.swing.JTextField();
        Return = new javax.swing.JRadioButton();
        Single = new javax.swing.JRadioButton();
        CargoSubmit = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        TSPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tsfrom = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel35 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TimeSchedule.setBackground(new java.awt.Color(42, 202, 153));
        TimeSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimeScheduleMouseClicked(evt);
            }
        });
        TimeSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Time Shedule");
        TimeSchedule.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/calendar-icon.png"))); // NOI18N
        TimeSchedule.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(TimeSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 80));

        TicketBooking.setBackground(new java.awt.Color(29, 159, 124));
        TicketBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketBookingMouseClicked(evt);
            }
        });
        TicketBooking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Ticket Booking");
        TicketBooking.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/money-icon.png"))); // NOI18N
        TicketBooking.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(TicketBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 80));

        Home.setBackground(new java.awt.Color(3, 124, 84));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Home");
        Home.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/globe-icon.png"))); // NOI18N
        Home.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 80));

        CargoService.setBackground(new java.awt.Color(90, 199, 163));
        CargoService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargoServiceMouseClicked(evt);
            }
        });
        CargoService.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Cargo Service");
        CargoService.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/dolly-icon.png"))); // NOI18N
        CargoService.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(CargoService, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 80));

        PrivateJets.setBackground(new java.awt.Color(175, 217, 207));
        PrivateJets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrivateJetsMouseClicked(evt);
            }
        });
        PrivateJets.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Private Jets");
        PrivateJets.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/plane-icon.png"))); // NOI18N
        PrivateJets.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(PrivateJets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 220, 80));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/Autodesk-Smoke-icon (2).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("JETAIR");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 150));

        jPanel7.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(3, 124, 84));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setForeground(new java.awt.Color(240, 240, 240));
        jLabel38.setText("Who we are");
        HomePanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel49.setForeground(new java.awt.Color(240, 240, 240));
        jLabel49.setText("what we are offer");
        HomePanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel51.setForeground(new java.awt.Color(240, 240, 240));
        jLabel51.setText("jLabel38");
        HomePanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(240, 240, 240));
        jLabel52.setText("WELCOME TO JET AIR");
        HomePanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 190, -1));

        jLabel53.setForeground(new java.awt.Color(240, 240, 240));
        jLabel53.setText("jLabel38");
        HomePanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        HomePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 30, 360));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        HomePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 30, 360));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        HomePanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 30, 360));

        jPanel7.add(HomePanel, "card2");

        TBPanel.setBackground(new java.awt.Color(29, 159, 124));
        TBPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Book your tiket to flly worldwide");
        TBPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setText("Class");
        TBPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setText("Arrival Date");
        TBPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel40.setForeground(new java.awt.Color(240, 240, 240));
        jLabel40.setText("From");
        TBPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        tbfrom.setBackground(new java.awt.Color(29, 159, 124));
        tbfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbfrom.setBorder(null);
        tbfrom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tbfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbfromActionPerformed(evt);
            }
        });
        TBPanel.add(tbfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, -1));

        ardate.setBackground(new java.awt.Color(29, 159, 124));
        ardate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ardate.setBorder(null);
        TBPanel.add(ardate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 200, -1));

        business.setBackground(new java.awt.Color(29, 159, 124));
        buttonGroup4.add(business);
        business.setForeground(new java.awt.Color(240, 240, 240));
        business.setText("Business Class");
        business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessActionPerformed(evt);
            }
        });
        TBPanel.add(business, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        first.setBackground(new java.awt.Color(29, 159, 124));
        buttonGroup4.add(first);
        first.setForeground(new java.awt.Color(240, 240, 240));
        first.setText("First Class");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });
        TBPanel.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        economy.setBackground(new java.awt.Color(29, 159, 124));
        buttonGroup4.add(economy);
        economy.setForeground(new java.awt.Color(240, 240, 240));
        economy.setText("Economy Class");
        economy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economyActionPerformed(evt);
            }
        });
        TBPanel.add(economy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        dedate.setBackground(new java.awt.Color(29, 159, 124));
        dedate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dedate.setBorder(null);
        TBPanel.add(dedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, -1));

        adults.setBackground(new java.awt.Color(29, 159, 124));
        adults.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adults.setBorder(null);
        adults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultsActionPerformed(evt);
            }
        });
        TBPanel.add(adults, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 70, -1));

        children.setBackground(new java.awt.Color(29, 159, 124));
        children.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        children.setBorder(null);
        TBPanel.add(children, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 70, -1));

        infants.setBackground(new java.awt.Color(29, 159, 124));
        infants.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        infants.setBorder(null);
        TBPanel.add(infants, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 70, -1));

        jLabel42.setForeground(new java.awt.Color(240, 240, 240));
        jLabel42.setText("Children");
        TBPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 70, -1));

        jLabel43.setForeground(new java.awt.Color(240, 240, 240));
        jLabel43.setText("Infants");
        TBPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 60, -1));

        jLabel44.setForeground(new java.awt.Color(240, 240, 240));
        jLabel44.setText("To");
        TBPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 20, -1));

        jLabel46.setForeground(new java.awt.Color(240, 240, 240));
        jLabel46.setText("Depature Date");
        TBPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 10));

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "From", "To", "Depature Date", "Arrival Date", "Time"
            }
        ));
        jScrollPane2.setViewportView(tbtable);

        TBPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 630, 150));

        jLabel48.setForeground(new java.awt.Color(240, 240, 240));
        jLabel48.setText("Adults");
        TBPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 60, -1));

        tbto.setBackground(new java.awt.Color(29, 159, 124));
        tbto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbto.setBorder(null);
        TBPanel.add(tbto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 200, -1));

        submit.setBackground(new java.awt.Color(51, 255, 204));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setText("Submit");
        submit.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 50, 20));

        TBPanel.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 120, 40));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TBPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TBPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TBPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TBPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TBPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 70, 2));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TBPanel.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TBPanel.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jPanel7.add(TBPanel, "card2");

        CargoPanel.setBackground(new java.awt.Color(90, 199, 163));
        CargoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setText("We Safely Carrying Your Cargo");
        CargoPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel32.setText("From");
        CargoPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        cfrom.setBackground(new java.awt.Color(90, 199, 163));
        cfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cfrom.setBorder(null);
        CargoPanel.add(cfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 250, -1));

        jLabel33.setText("To");
        CargoPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        rname.setBackground(new java.awt.Color(90, 199, 163));
        rname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rname.setBorder(null);
        rname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnameActionPerformed(evt);
            }
        });
        CargoPanel.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, -1));

        jLabel34.setText("Reciever Name");
        CargoPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        cto.setBackground(new java.awt.Color(90, 199, 163));
        cto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cto.setBorder(null);
        CargoPanel.add(cto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 250, -1));

        jLabel35.setText("Size Category");
        CargoPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jRadioButton5.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup5.add(jRadioButton5);
        jRadioButton5.setText("< 5 Kg");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        CargoPanel.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jRadioButton6.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup5.add(jRadioButton6);
        jRadioButton6.setText("5 -10 Kg");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        CargoPanel.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jRadioButton7.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup5.add(jRadioButton7);
        jRadioButton7.setText("10 -20 Kg");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        CargoPanel.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jRadioButton8.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup5.add(jRadioButton8);
        jRadioButton8.setText("> 20 Kg ");
        jRadioButton8.setActionCommand("20 Kg <");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        CargoPanel.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        jLabel36.setText("Item Category");
        CargoPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        liquid.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup6.add(liquid);
        liquid.setText("Liquid");
        liquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liquidActionPerformed(evt);
            }
        });
        CargoPanel.add(liquid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        metel.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup6.add(metel);
        metel.setText("Metal");
        metel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metelActionPerformed(evt);
            }
        });
        CargoPanel.add(metel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        glass.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup6.add(glass);
        glass.setText("Glass");
        glass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassActionPerformed(evt);
            }
        });
        CargoPanel.add(glass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        stationary.setBackground(new java.awt.Color(90, 199, 163));
        buttonGroup6.add(stationary);
        stationary.setText("Stationary");
        stationary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationaryActionPerformed(evt);
            }
        });
        CargoPanel.add(stationary, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        jLabel56.setText("Recieve Before");
        CargoPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        rdate.setBackground(new java.awt.Color(90, 199, 163));
        rdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rdate.setBorder(null);
        CargoPanel.add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 250, -1));

        jLabel57.setText("Sending Date");
        CargoPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        sdate.setBackground(new java.awt.Color(90, 199, 163));
        sdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sdate.setBorder(null);
        CargoPanel.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 250, -1));

        jPanel6.setBackground(new java.awt.Color(0, 204, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Submit");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 20));

        CargoPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 90, 40));

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        CargoPanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        CargoPanel.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        CargoPanel.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        CargoPanel.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        CargoPanel.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jPanel7.add(CargoPanel, "card2");

        PJPanel.setBackground(new java.awt.Color(175, 217, 207));
        PJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Take Your Private Jet");
        PJPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        Heli.setBackground(new java.awt.Color(175, 217, 207));
        buttonGroup2.add(Heli);
        Heli.setText("Helicopter");
        Heli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeliActionPerformed(evt);
            }
        });
        PJPanel.add(Heli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, 20));

        jLabel21.setText("What is Your Choice");
        PJPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        MJet.setBackground(new java.awt.Color(175, 217, 207));
        buttonGroup2.add(MJet);
        MJet.setText("Mini Jet");
        MJet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJetActionPerformed(evt);
            }
        });
        PJPanel.add(MJet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 100, 20));

        Ljet.setBackground(new java.awt.Color(175, 217, 207));
        buttonGroup2.add(Ljet);
        Ljet.setText("Large Jet");
        Ljet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LjetActionPerformed(evt);
            }
        });
        PJPanel.add(Ljet, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 100, 20));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/helicopter-icon.png"))); // NOI18N
        PJPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 110));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/plane-icon (1).png"))); // NOI18N
        jLabel23.setText("jLabel23");
        PJPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 110));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/takeoff-icon.png"))); // NOI18N
        jLabel24.setText("jLabel24");
        PJPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 100, 110));

        jLabel25.setText("Date");
        PJPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel26.setText("From");
        PJPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        Pfrom.setBackground(new java.awt.Color(175, 217, 207));
        Pfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pfrom.setBorder(null);
        PJPanel.add(Pfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 250, -1));

        Pto.setBackground(new java.awt.Color(175, 217, 207));
        Pto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pto.setBorder(null);
        PJPanel.add(Pto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 250, -1));

        jLabel27.setText("To");
        PJPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        Ppass.setBackground(new java.awt.Color(175, 217, 207));
        Ppass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ppass.setBorder(null);
        PJPanel.add(Ppass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 250, -1));

        jLabel28.setText("Passengers");
        PJPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        Pdate.setBackground(new java.awt.Color(175, 217, 207));
        Pdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pdate.setBorder(null);
        PJPanel.add(Pdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 250, -1));

        Return.setBackground(new java.awt.Color(175, 217, 207));
        buttonGroup3.add(Return);
        Return.setText("Return Ride");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        PJPanel.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        Single.setBackground(new java.awt.Color(175, 217, 207));
        buttonGroup3.add(Single);
        Single.setText("Single Ride");
        Single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleActionPerformed(evt);
            }
        });
        PJPanel.add(Single, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        CargoSubmit.setBackground(new java.awt.Color(0, 204, 51));
        CargoSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargoSubmitMouseClicked(evt);
            }
        });
        CargoSubmit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(0, 204, 51));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Submit");
        CargoSubmit.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 20));

        PJPanel.add(CargoSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 80, 40));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        PJPanel.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        PJPanel.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        PJPanel.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        PJPanel.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jPanel7.add(PJPanel, "card2");

        TSPanel.setBackground(new java.awt.Color(42, 202, 153));
        TSPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Find theTime Schedule");
        TSPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jLabel16.setText("From");
        TSPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel17.setText("To");
        TSPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        tsfrom.setBackground(new java.awt.Color(42, 202, 153));
        tsfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tsfrom.setBorder(null);
        tsfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsfromActionPerformed(evt);
            }
        });
        tsfrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsfromKeyReleased(evt);
            }
        });
        TSPanel.add(tsfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 250, -1));

        jTextField2.setBackground(new java.awt.Color(42, 202, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        TSPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 250, -1));

        jLabel18.setText("From Date");
        TSPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel19.setText("To Date");
        TSPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 20));

        jTextField3.setBackground(new java.awt.Color(42, 202, 153));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        TSPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 250, -1));

        jTextField4.setBackground(new java.awt.Color(42, 202, 153));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        TSPanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 250, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "flightno", "from", "to", "depdate", "arrdate", "time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        TSPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 780, 220));

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TSPanel.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TSPanel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TSPanel.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        TSPanel.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jPanel7.add(TSPanel, "card2");

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 840, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TicketBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketBookingMouseClicked
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
       
        jPanel7.add(TBPanel);
        jPanel7.repaint();
        jPanel7.revalidate();
       
    }//GEN-LAST:event_TicketBookingMouseClicked

    private void TimeScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeScheduleMouseClicked
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        
        jPanel7.add(TSPanel);
        jPanel7.repaint();
        jPanel7.revalidate();
        
       
    }//GEN-LAST:event_TimeScheduleMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        
        jPanel7.add(HomePanel);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_HomeMouseClicked

    private void CargoServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargoServiceMouseClicked
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        
        jPanel7.add(CargoPanel);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_CargoServiceMouseClicked

    private void PrivateJetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrivateJetsMouseClicked
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        
        jPanel7.add(PJPanel);
        jPanel7.repaint();
        jPanel7.revalidate();
    }//GEN-LAST:event_PrivateJetsMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void tbfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbfromActionPerformed
       
    }//GEN-LAST:event_tbfromActionPerformed

    private void businessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessActionPerformed
      fclass ="business";
    }//GEN-LAST:event_businessActionPerformed

    private void rnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnameActionPerformed
        
    }//GEN-LAST:event_rnameActionPerformed

    private void tsfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsfromActionPerformed
        
    }//GEN-LAST:event_tsfromActionPerformed

    private void CargoSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargoSubmitMouseClicked
        
        
        String from = Pfrom.getText();
        String to = Pto.getText();
        String date = Pdate.getText();
        String passengers = Ppass.getText();
        
        PreparedStatement ps;
        String query ="INSERT INTO `PrivateJet`(`choice`, `from`, `to`, `date`, `passengers`, `ride`) VALUES (?,?,?,?,?,?)";
        
        try
        {
        ps = sqlconnection.getConnection().prepareStatement(query);
        ps.setString(1,choice );
        ps.setString(2, from);
        ps.setString(3, to);
        ps.setString(4, date);
        ps.setString(5, passengers);
        ps.setString(6,ride );
        
        
        if(ps.executeUpdate() > 0);
        {
            JOptionPane.showMessageDialog(null, "Submited");
        }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Not Submitted");
        
        }
        
    }//GEN-LAST:event_CargoSubmitMouseClicked

    private void HeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeliActionPerformed
       choice = "Helicopter";
    }//GEN-LAST:event_HeliActionPerformed

    private void MJetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJetActionPerformed
        choice = "Mini Jet";
    }//GEN-LAST:event_MJetActionPerformed

    private void LjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LjetActionPerformed
        choice = "Large Jet";
    }//GEN-LAST:event_LjetActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
       ride ="Return";
    }//GEN-LAST:event_ReturnActionPerformed

    private void SingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleActionPerformed
        ride ="Single";
    }//GEN-LAST:event_SingleActionPerformed

    private void economyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economyActionPerformed
        fclass = "economy";
    }//GEN-LAST:event_economyActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
       fclass = "first";
    }//GEN-LAST:event_firstActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        
        String from = tbfrom.getText();
        String to = tbto.getText();
        String ddate = dedate.getText();
        String adate = ardate.getText();
        String adul = adults.getText();
        String childre = children.getText();
        String infents = infants.getText();//get the data from text boxes
        
        
        
        PreparedStatement ps;
        String query ="INSERT INTO `booking`(`from`, `to`, `depdate`, `arrdate`, `class`, `adults`, `children`, `infants`) VALUES (?,?,?,?,?,?,?,?)";
        
        try
        {
        ps = sqlconnection.getConnection().prepareStatement(query);
        ps.setString(1, from);
        ps.setString(2, to);
        ps.setString(3, ddate);
        ps.setString(4, adate);
        ps.setString(5, fclass);
        ps.setString(6, adul);
        ps.setString(7, childre);
        ps.setString(8, infents);
        
        
        
        if(ps.executeUpdate() > 0);
        {
            JOptionPane.showMessageDialog(null, "New User Add");
        }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Not Added");
        
        }
        
        
        
        
    }//GEN-LAST:event_submitMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
      
        
        String from = cfrom.getText();
        String to = cto.getText();
        String sedate = sdate.getText();
        String redate = rdate.getText();
        String rename = rname.getText();
       //get the data from text boxes
        
        
        
        PreparedStatement ps;
        String query ="INSERT INTO `cargo`(`from`, `to`, `sdate`, `rbefore`, `rname`, `size`, `item`) VALUES (?,?,?,?,?,?,?)";
        
        try
        {
        ps = sqlconnection.getConnection().prepareStatement(query);
        ps.setString(1, sedate);
        ps.setString(2, to);
        ps.setString(3, sedate);
        ps.setString(4, redate);
        ps.setString(5, rename);
        ps.setString(6, size);
        ps.setString(7, item);
      
         if(ps.executeUpdate() > 0);
        {
            JOptionPane.showMessageDialog(null, "New User Add");
        }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Not Added");
        
        }
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        size = "5>";
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
       size = "5-10";
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        size = "10-20";
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        size = "20<";
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void liquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liquidActionPerformed
        item = "liquid";
    }//GEN-LAST:event_liquidActionPerformed

    private void metelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metelActionPerformed
        item =  "metel";
    }//GEN-LAST:event_metelActionPerformed

    private void glassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassActionPerformed
        item = "glass";
    }//GEN-LAST:event_glassActionPerformed

    private void stationaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationaryActionPerformed
        item = "stationary";
    }//GEN-LAST:event_stationaryActionPerformed

    private void tsfromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsfromKeyReleased
        show_user();
    }//GEN-LAST:event_tsfromKeyReleased

    private void adultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adultsActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CargoPanel;
    private javax.swing.JPanel CargoService;
    private javax.swing.JPanel CargoSubmit;
    private javax.swing.JCheckBox Heli;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JCheckBox Ljet;
    private javax.swing.JCheckBox MJet;
    private javax.swing.JPanel PJPanel;
    private javax.swing.JTextField Pdate;
    private javax.swing.JTextField Pfrom;
    private javax.swing.JTextField Ppass;
    private javax.swing.JPanel PrivateJets;
    private javax.swing.JTextField Pto;
    private javax.swing.JRadioButton Return;
    private javax.swing.JRadioButton Single;
    private javax.swing.JPanel TBPanel;
    private javax.swing.JPanel TSPanel;
    private javax.swing.JPanel TicketBooking;
    private javax.swing.JPanel TimeSchedule;
    private javax.swing.JTextField adults;
    private javax.swing.JTextField ardate;
    private javax.swing.JRadioButton business;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField cfrom;
    private javax.swing.JTextField children;
    private javax.swing.JTextField cto;
    private javax.swing.JTextField dedate;
    private javax.swing.JRadioButton economy;
    private javax.swing.JRadioButton first;
    private javax.swing.JRadioButton glass;
    private javax.swing.JTextField infants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton liquid;
    private javax.swing.JRadioButton metel;
    private javax.swing.JTextField rdate;
    private javax.swing.JTextField rname;
    private javax.swing.JTextField sdate;
    private javax.swing.JRadioButton stationary;
    private javax.swing.JPanel submit;
    private javax.swing.JTextField tbfrom;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField tbto;
    private javax.swing.JTextField tsfrom;
    // End of variables declaration//GEN-END:variables
}
