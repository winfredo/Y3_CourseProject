package wan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Home extends JFrame{
    //������
    JPanel JPMain;
    //״̬��
    private JMenuBar JMB;
    //�����˵�
    private JMenu JManage;
    private JMenuItem JMStudent;//ѧ������
    private JMenuItem JMTeacher;//��ʦ����
    private JMenuItem JMCourse;//�γ̹���
    //ǩ��
    private JMenu JSign;
    private JMenuItem JMSign;//ǩ��
    private JMenuItem JMUsign;//δǩ��
    //����
    private JMenu JFinace;
    private JMenuItem Check;//�鿴
    private JMenuItem JMAdd;//����
    //�ſ�
    private JMenu JFArr;
    private JMenuItem JMArr;//�ſ�
    private JMenuItem JMCheck;//�鿴�ſ�

    //���췽��
    public Home(String title){
        super(title);
        initGui();
    }

    //�û�����
    private void initGui(){
        JPMain = new JPanel();
        JMB = new JMenuBar();
        //����
        JManage = new JMenu("����");
        JMStudent = new JMenuItem("����ѧ��");
        JMTeacher = new JMenuItem("������ʦ");
        JMCourse = new JMenuItem("�����γ�");
        //ǩ��
        JSign = new JMenu("ǩ��");
        JMSign = new JMenuItem("ǩ������");
        JMUsign = new JMenuItem("δǩ����Ա����");
        //����
        JFinace = new JMenu("����");
        Check = new JMenuItem("�鿴");
        JMAdd = new JMenuItem("����");
        //�ſ�
        JFArr = new JMenu("�ſ�");
        JMArr = new JMenuItem("�ſι���");
        JMCheck = new JMenuItem("�鿴");

        setJMenuBar(JMB);

        JMB.add(JManage);
        JManage.add(JMStudent);
        JManage.add(JMTeacher);
        JManage.add(JMCourse);

        JMB.add(JSign);
        JSign.add(JMSign);
        JSign.add(JMUsign);

        JMB.add(JFinace);
        JFinace.add(Check);
        JFinace.add(JMAdd);

        JMB.add(JFArr);
        JFArr.add(JMArr);
        JFArr.add(JMCheck);

        JPanel jPanel = new JPanel();
        CardLayout card = new CardLayout();
        jPanel.setLayout(card);
        setSize(900,700);
        setVisible(true);
        setLocationRelativeTo(null);
        add(jPanel);
        //�������н���
        JPanel jjjj = new JPanel();//////////////�Ժ������ͼƬ����
        jPanel.add(jjjj);
        jPanel.add(new SInformation(),"1");
        jPanel.add(new ArrangeClass(),"2");
        jPanel.add(new FinanceAdd(),"3");
        jPanel.add(new NotSign(),"4");
        jPanel.add(new TInformation(),"6");
        jPanel.add(new CInformation(),"5");
        jPanel.add(new DailySignOnWindows(),"7");
        jPanel.add(new DailySignOnWindows_check(),"8");
        jPanel.add(new FinanceWindows(),"9");
        jPanel.add(new ScheduleWindows(),"10");

        //�رմ����¼�
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitSystem();
            }
        });
        //����ʹ�ù����¼�����
        JMCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"2");
            }
        });
        JMStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"1");
            }
        });
        JMAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"3");
            }
        });
        JMUsign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"4");
            }
        });
        JMTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"6");
            }
        });
        JMCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"5");
            }
        });
        JMSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"7");
            }
        });
        JMUsign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"8");
            }
        });
        Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"9");
            }
        });
        JMArr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(jPanel,"10");
            }
        });




    }

    void exitSystem(){
        int ask = JOptionPane.showConfirmDialog(null,"ȷ���˳�ϵͳ","�˳�",JOptionPane.YES_NO_OPTION);
        if(ask == JOptionPane.YES_OPTION){
            System.exit(0);
        }else {
            dispose();
            App.home = new Home("ѧУ����ϵͳ");
        }
    }
}