/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import TestResource.inputexel;
import TestResource.tambah;
import Employee.EmployeeProfilePanel;
import HumanResource.EmployeeConfirmation;
import Employee.ChangePassword;
import HumanResource.AddJobVacancy;
import HumanResource.AllocationAnnouncement;
import HumanResource.AplicationRehabilitation;
import HumanResource.ApplicationResignation;
import HumanResource.CandidateProfile;
import HumanResource.CandidateList;
import HumanResource.CandidateApplication;
import HumanResource.CandidateApplicationAcademic;
import HumanResource.CandidateApplicationCareer;
import HumanResource.CandidateApplicationCertificates;
import HumanResource.CandidateApplicationFamily;
import HumanResource.CandidateApplicationIntroduction;
import HumanResource.CandidateApplicationPersonal;
import HumanResource.CandidateApplicationSKCK;
import HumanResource.ConfirmationHandingOverTakingOver;
import HumanResource.DisciplnaryResolution;
import HumanResource.EmployeeClearanceStatus;
import HumanResource.EmployeeEvaluation;
import HumanResource.LeaveOfAbsense;
import HumanResource.NotificationToNewEmployee;
import HumanResource.RequestEmployeeAllocation;
import HumanResource.SummaryStatusCandidatEmployee;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author lutfi
 */
public class main extends javax.swing.JFrame {
    
    
    
    CandidateApplication ca;
            CandidateApplicationPersonal candidateApplicationPersonal;
            CandidateApplicationAcademic candidateApplicationAcademic;
            CandidateApplicationFamily candidateApplicationFamily;
            CandidateApplicationCertificates candidateApplicationCertificates;
            CandidateApplicationCareer candidateApplicationCareer;
            CandidateApplicationIntroduction candidateApplicationIntroduction;
            CandidateApplicationSKCK candidateApplicationSKCK;
        CandidateList candidateListPanel;
        CandidateProfile candidateProfile;
    EmployeeConfirmation employeeConfirmation;
    NotificationToNewEmployee notificationToNewEmployee;
    AllocationAnnouncement allocationAnnouncement;
    SummaryStatusCandidatEmployee summaryStatusCandidatEmployee;
    RequestEmployeeAllocation requestEmployeeAllocation;
    LeaveOfAbsense leaveOfAbsense;
    AplicationRehabilitation aplicationRehabilitation;
    ApplicationResignation applicationResignation;
    EmployeeClearanceStatus employeeClearanceStatus;
    ConfirmationHandingOverTakingOver confirmationHandingOverTakingOver;
    DisciplnaryResolution disciplnaryResolution;
    EmployeeEvaluation employeeEvaluation;
    AddJobVacancy addJobVacancy;
    
    EmployeeProfilePanel employeeProfilePanel;
    ChangePassword changePasswordPanel;
    
    public main() {
        super("Operation System");
        initComponents();
        
        ca = new CandidateApplication();
                candidateApplicationPersonal = new CandidateApplicationPersonal();
                candidateApplicationAcademic = new CandidateApplicationAcademic();
                candidateApplicationFamily = new CandidateApplicationFamily();
                candidateApplicationCertificates = new CandidateApplicationCertificates();
                candidateApplicationCareer = new CandidateApplicationCareer();
                candidateApplicationIntroduction = new CandidateApplicationIntroduction();
                candidateApplicationSKCK = new CandidateApplicationSKCK();
            candidateListPanel = new CandidateList();
            candidateProfile = new CandidateProfile();
        employeeConfirmation = new EmployeeConfirmation();
        notificationToNewEmployee = new NotificationToNewEmployee();
        allocationAnnouncement = new AllocationAnnouncement();
        summaryStatusCandidatEmployee = new SummaryStatusCandidatEmployee();
        requestEmployeeAllocation = new RequestEmployeeAllocation();
        leaveOfAbsense = new LeaveOfAbsense();
        aplicationRehabilitation = new AplicationRehabilitation();
        applicationResignation = new ApplicationResignation();
        employeeClearanceStatus = new EmployeeClearanceStatus();
        confirmationHandingOverTakingOver = new ConfirmationHandingOverTakingOver();
        disciplnaryResolution = new DisciplnaryResolution();
        employeeEvaluation = new EmployeeEvaluation();
        addJobVacancy = new AddJobVacancy();
        
        employeeProfilePanel = new EmployeeProfilePanel();
        changePasswordPanel = new ChangePassword();
        
        BoxPanel.add(ca);
                BoxPanel.add(candidateApplicationPersonal);
                BoxPanel.add(candidateApplicationAcademic);
                BoxPanel.add(candidateApplicationFamily);
                BoxPanel.add(candidateApplicationCertificates);
                BoxPanel.add(candidateApplicationCareer);
                BoxPanel.add(candidateApplicationIntroduction);
                BoxPanel.add(candidateApplicationSKCK);
            BoxPanel.add(candidateListPanel);
            BoxPanel.add(candidateProfile);
        BoxPanel.add(employeeConfirmation);
        BoxPanel.add(notificationToNewEmployee);
        BoxPanel.add(allocationAnnouncement);
        BoxPanel.add(summaryStatusCandidatEmployee);
        BoxPanel.add(requestEmployeeAllocation);
        BoxPanel.add(leaveOfAbsense);
        BoxPanel.add(aplicationRehabilitation);
        BoxPanel.add(applicationResignation);
        BoxPanel.add(employeeClearanceStatus);
        BoxPanel.add(confirmationHandingOverTakingOver);
        BoxPanel.add(disciplnaryResolution);
        BoxPanel.add(employeeEvaluation);
        BoxPanel.add(addJobVacancy);
        
        BoxPanel.add(employeeProfilePanel);
        BoxPanel.add(changePasswordPanel);
        
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        
        MyWindow();
        ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource(".//Pictures//Logo.png"));
        this.setIconImage(logo.getImage());
        
        String nama_log = CustomResource.MySession.get_nama();
        
        if (nama_log == null) {
            HumanResourceSystem.setEnabled(true);
            POSystem.setEnabled(false);
            WarehouseSystem.setEnabled(false);
            AcountingSystem.setEnabled(false);
            myProfile.setVisible(false);
            SMLogout.setVisible(false);
            ToolBar.setVisible(true);
        } else {
            myProfile.setText(nama_log);
            ToolBar.add(Box.createHorizontalGlue());
            ToolBar.add(myProfile);
            buttonLogin.setVisible(false);
            jLabel3.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
        }
    }
    inputexel inputxl = new inputexel();
    tambah tambah = new tambah();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        BoxPanel = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buttonLogin1 = new javax.swing.JButton();
        ToolBar = new javax.swing.JMenuBar();
        homeBar = new javax.swing.JMenu();
        undoBar = new javax.swing.JMenu();
        redoBar = new javax.swing.JMenu();
        HumanResourceSystem = new javax.swing.JMenu();
        candidateApplication = new javax.swing.JMenu();
        candidateList = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        applicationForm = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        employingConfirmation = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        NotificationtoNewEmployee = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        EmployeeStatus = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Checklist = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        AllocationAnouncement = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        RequestEmployeeAllocation = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        ApplicationLeaveofAbsence = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        ApplicationRehabilitation = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        ApplicationResignation = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        EmployeeClearanceStatus = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        ConfirmationHandoverTakeover = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        DiciplinaryRevolution = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        EmployeeEvaluation = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        AddJobVacancy = new javax.swing.JMenuItem();
        POSystem = new javax.swing.JMenu();
        WarehouseSystem = new javax.swing.JMenu();
        AcountingSystem = new javax.swing.JMenu();
        myProfile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        SMLogout = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BoxPanel.setLayout(new javax.swing.BoxLayout(BoxPanel, javax.swing.BoxLayout.LINE_AXIS));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 160, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("PT. Achivon Prestasi Abadi");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 220, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ingin bekerja dengan kami?");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 310, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Welcome to");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 110, 40));

        buttonLogin.setBackground(new java.awt.Color(0, 51, 255));
        buttonLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        MainPanel.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 150, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("please click Login below");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 310, 40));

        buttonLogin1.setBackground(new java.awt.Color(255, 0, 0));
        buttonLogin1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonLogin1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin1.setText("Register");
        buttonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogin1ActionPerformed(evt);
            }
        });
        MainPanel.add(buttonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 150, 40));

        homeBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IconHome.png"))); // NOI18N
        homeBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBarMouseClicked(evt);
            }
        });
        homeBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBarActionPerformed(evt);
            }
        });
        ToolBar.add(homeBar);

        undoBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/undo.png"))); // NOI18N
        ToolBar.add(undoBar);

        redoBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/redo.png"))); // NOI18N
        ToolBar.add(redoBar);

        HumanResourceSystem.setText("Human Resource System  |");
        HumanResourceSystem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        HumanResourceSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HumanResourceSystemMouseClicked(evt);
            }
        });

        candidateApplication.setText("Candidate Application");
        candidateApplication.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        candidateList.setText("Candidate List");
        candidateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateListActionPerformed(evt);
            }
        });
        candidateApplication.add(candidateList);
        candidateApplication.add(jSeparator15);

        applicationForm.setText("Application Form");
        applicationForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationFormActionPerformed(evt);
            }
        });
        candidateApplication.add(applicationForm);
        candidateApplication.add(jSeparator16);

        HumanResourceSystem.add(candidateApplication);
        HumanResourceSystem.add(jSeparator1);

        employingConfirmation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        employingConfirmation.setText("Employing Confirmation");
        employingConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employingConfirmationActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(employingConfirmation);
        HumanResourceSystem.add(jSeparator2);

        NotificationtoNewEmployee.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        NotificationtoNewEmployee.setText("Notification to New Employee");
        NotificationtoNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationtoNewEmployeeActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(NotificationtoNewEmployee);
        HumanResourceSystem.add(jSeparator3);

        EmployeeStatus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        EmployeeStatus.setText("Employee Status");
        EmployeeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeStatusActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(EmployeeStatus);
        HumanResourceSystem.add(jSeparator4);

        Checklist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Checklist.setText("Checklist");
        Checklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecklistActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(Checklist);
        HumanResourceSystem.add(jSeparator5);

        AllocationAnouncement.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AllocationAnouncement.setText("Allocation Anouncement");
        AllocationAnouncement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllocationAnouncementActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(AllocationAnouncement);
        HumanResourceSystem.add(jSeparator6);

        RequestEmployeeAllocation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        RequestEmployeeAllocation.setText("Request - Employee Allocation ");
        RequestEmployeeAllocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestEmployeeAllocationActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(RequestEmployeeAllocation);
        HumanResourceSystem.add(jSeparator7);

        ApplicationLeaveofAbsence.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ApplicationLeaveofAbsence.setText("Application - Leave of Absence");
        ApplicationLeaveofAbsence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationLeaveofAbsenceActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(ApplicationLeaveofAbsence);
        HumanResourceSystem.add(jSeparator8);

        ApplicationRehabilitation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ApplicationRehabilitation.setText("Application - Rehabilitation");
        ApplicationRehabilitation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationRehabilitationActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(ApplicationRehabilitation);
        HumanResourceSystem.add(jSeparator9);

        ApplicationResignation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ApplicationResignation.setText("Application - Resignation");
        ApplicationResignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationResignationActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(ApplicationResignation);
        HumanResourceSystem.add(jSeparator10);

        EmployeeClearanceStatus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        EmployeeClearanceStatus.setText("Employee Clearance Status");
        EmployeeClearanceStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeClearanceStatusActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(EmployeeClearanceStatus);
        HumanResourceSystem.add(jSeparator11);

        ConfirmationHandoverTakeover.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ConfirmationHandoverTakeover.setText("Confirmation - Handover & Takeover");
        ConfirmationHandoverTakeover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmationHandoverTakeoverActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(ConfirmationHandoverTakeover);
        HumanResourceSystem.add(jSeparator12);

        DiciplinaryRevolution.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        DiciplinaryRevolution.setText("Diciplinary Revolution");
        DiciplinaryRevolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiciplinaryRevolutionActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(DiciplinaryRevolution);
        HumanResourceSystem.add(jSeparator13);

        EmployeeEvaluation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        EmployeeEvaluation.setText("Employee Evaluation");
        EmployeeEvaluation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeEvaluationActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(EmployeeEvaluation);
        HumanResourceSystem.add(jSeparator14);

        AddJobVacancy.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AddJobVacancy.setText("Add Job Vacancy");
        AddJobVacancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddJobVacancyActionPerformed(evt);
            }
        });
        HumanResourceSystem.add(AddJobVacancy);

        ToolBar.add(HumanResourceSystem);

        POSystem.setText("PO System  |");
        POSystem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ToolBar.add(POSystem);

        WarehouseSystem.setText("Warehouse System  |");
        WarehouseSystem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ToolBar.add(WarehouseSystem);

        AcountingSystem.setText("Accounting System  |");
        AcountingSystem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ToolBar.add(AcountingSystem);

        myProfile.setText("Profile");
        myProfile.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem1.setText("Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        myProfile.add(jMenuItem1);
        myProfile.add(jSeparator17);

        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem2.setText("Change Password");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        myProfile.add(jMenuItem2);
        myProfile.add(jSeparator18);

        SMLogout.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SMLogout.setForeground(new java.awt.Color(255, 0, 0));
        SMLogout.setText("Logout");
        SMLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SMLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMLogoutActionPerformed(evt);
            }
        });
        myProfile.add(SMLogout);
        myProfile.add(jSeparator19);

        ToolBar.add(myProfile);

        setJMenuBar(ToolBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 639, Short.MAX_VALUE)
                    .addComponent(BoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 640, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 277, Short.MAX_VALUE)
                    .addComponent(BoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 277, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarMouseClicked
        MainPanel.setVisible(true);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_homeBarMouseClicked

    private void homeBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBarActionPerformed

    }//GEN-LAST:event_homeBarActionPerformed

    private void candidateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateListActionPerformed
        MainPanel.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            ca.setVisible(false);
            candidateListPanel.setVisible(true);
        candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_candidateListActionPerformed

    private void applicationFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationFormActionPerformed
        MainPanel.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            ca.setVisible(true);
            candidateListPanel.setVisible(false);
        candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_applicationFormActionPerformed

    private void employingConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employingConfirmationActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(true);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_employingConfirmationActionPerformed

    private void EmployeeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeStatusActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(true);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_EmployeeStatusActionPerformed

    private void HumanResourceSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HumanResourceSystemMouseClicked
        //masukdata_karyawan.setVisible(true);
    }//GEN-LAST:event_HumanResourceSystemMouseClicked

    private void SMLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMLogoutActionPerformed
        myLogout();
    }//GEN-LAST:event_SMLogoutActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
         new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(true);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AllocationAnouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllocationAnouncementActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(true);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_AllocationAnouncementActionPerformed

    private void NotificationtoNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationtoNewEmployeeActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(true);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_NotificationtoNewEmployeeActionPerformed

    private void ChecklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecklistActionPerformed
//        MainPanel.setVisible(false);
//        ca.setVisible(false);
//                candidateApplicationPersonal.setVisible(false);
//                candidateApplicationAcademic.setVisible(false);
//                candidateApplicationFamily.setVisible(false);
//                candidateApplicationCertificates.setVisible(false);
//                candidateApplicationCareer.setVisible(false);
//                candidateApplicationIntroduction.setVisible(false);
//                candidateApplicationSKCK.setVisible(false);
//            candidateListPanel.setVisible(false);
//            candidateProfile.setVisible(false);
//        employeeConfirmation.setVisible(false);
//        notificationToNewEmployee.setVisible(false);
//        summaryStatusCandidatEmployee.setVisible(false);
//        allocationAnnouncement.setVisible(false);
//        requestEmployeeAllocation.setVisible(false);
//        leaveOfAbsense.setVisible(false);
//        aplicationRehabilitation.setVisible(false);
//        applicationResignation.setVisible(false);
//        employeeClearanceStatus.setVisible(false);
//        confirmationHandingOverTakingOver.setVisible(false);
//        disciplnaryResolution.setVisible(false);
//        employeeEvaluation.setVisible(false);
//        addJobVacancy.setVisible(false);
//        
//        employeeProfilePanel.setVisible(false);
//        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_ChecklistActionPerformed

    private void RequestEmployeeAllocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestEmployeeAllocationActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(true);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_RequestEmployeeAllocationActionPerformed

    private void ApplicationLeaveofAbsenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationLeaveofAbsenceActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(true);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_ApplicationLeaveofAbsenceActionPerformed

    private void ApplicationRehabilitationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationRehabilitationActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(true);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_ApplicationRehabilitationActionPerformed

    private void ApplicationResignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationResignationActionPerformed
        MainPanel.setVisible(false);
            ca.setVisible(false);
            candidateListPanel.setVisible(false);
        candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(true);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_ApplicationResignationActionPerformed

    private void EmployeeClearanceStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeClearanceStatusActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(true);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_EmployeeClearanceStatusActionPerformed

    private void ConfirmationHandoverTakeoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmationHandoverTakeoverActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(true);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_ConfirmationHandoverTakeoverActionPerformed

    private void DiciplinaryRevolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiciplinaryRevolutionActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(true);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_DiciplinaryRevolutionActionPerformed

    private void EmployeeEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeEvaluationActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(true);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_EmployeeEvaluationActionPerformed

    private void AddJobVacancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJobVacancyActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(false);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(true);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_AddJobVacancyActionPerformed

    private void buttonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogin1ActionPerformed
        MainPanel.setVisible(false);
        ca.setVisible(false);
                candidateApplicationPersonal.setVisible(true);
                candidateApplicationAcademic.setVisible(false);
                candidateApplicationFamily.setVisible(false);
                candidateApplicationCertificates.setVisible(false);
                candidateApplicationCareer.setVisible(false);
                candidateApplicationIntroduction.setVisible(false);
                candidateApplicationSKCK.setVisible(false);
            candidateListPanel.setVisible(false);
            candidateProfile.setVisible(false);
        employeeConfirmation.setVisible(false);
        notificationToNewEmployee.setVisible(false);
        summaryStatusCandidatEmployee.setVisible(false);
        allocationAnnouncement.setVisible(false);
        requestEmployeeAllocation.setVisible(false);
        leaveOfAbsense.setVisible(false);
        aplicationRehabilitation.setVisible(false);
        applicationResignation.setVisible(false);
        employeeClearanceStatus.setVisible(false);
        confirmationHandingOverTakingOver.setVisible(false);
        disciplnaryResolution.setVisible(false);
        employeeEvaluation.setVisible(false);
        addJobVacancy.setVisible(false);
        
        employeeProfilePanel.setVisible(false);
        changePasswordPanel.setVisible(false);
    }//GEN-LAST:event_buttonLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AcountingSystem;
    private javax.swing.JMenuItem AddJobVacancy;
    private javax.swing.JMenuItem AllocationAnouncement;
    private javax.swing.JMenuItem ApplicationLeaveofAbsence;
    private javax.swing.JMenuItem ApplicationRehabilitation;
    private javax.swing.JMenuItem ApplicationResignation;
    private javax.swing.JPanel BoxPanel;
    private javax.swing.JMenuItem Checklist;
    private javax.swing.JMenuItem ConfirmationHandoverTakeover;
    private javax.swing.JMenuItem DiciplinaryRevolution;
    private javax.swing.JMenuItem EmployeeClearanceStatus;
    private javax.swing.JMenuItem EmployeeEvaluation;
    private javax.swing.JMenuItem EmployeeStatus;
    private javax.swing.JMenu HumanResourceSystem;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem NotificationtoNewEmployee;
    private javax.swing.JMenu POSystem;
    private javax.swing.JMenuItem RequestEmployeeAllocation;
    private javax.swing.JMenuItem SMLogout;
    private javax.swing.JMenuBar ToolBar;
    private javax.swing.JMenu WarehouseSystem;
    private javax.swing.JMenuItem applicationForm;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonLogin1;
    private javax.swing.JMenu candidateApplication;
    private javax.swing.JMenuItem candidateList;
    private javax.swing.JMenuItem employingConfirmation;
    private javax.swing.JMenu homeBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu myProfile;
    private javax.swing.JMenu redoBar;
    private javax.swing.JMenu undoBar;
    // End of variables declaration//GEN-END:variables
 private void myLogout() {
       CustomResource.MySession.set_ktp("");
        CustomResource.MySession.set_nama("");
        new Main.LoginFrame().setVisible(true);
        this.dispose();
        
    }
    
    private void MyWindow(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height - 45);
        MainPanel.setPreferredSize(screen);
//        MainPanel.setPreferredSize(screen);
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = (screen.width/2) - (this.getSize().width/2);
//        int y = (screen.height/2) - (this.getSize().height/2);
//        this.setLocation(x,y);
    }
}


