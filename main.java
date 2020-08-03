
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			okno nf = new okno();
		}

	}
	class okno extends JFrame{
		private JTextArea text;
		private double p1=0,p2=0;
		private int oper=0;
		
		
		private void btnClick(JButton btn) {}
		
		public okno() {
		     JPanel pan = new JPanel();
		     Container con=getContentPane();
		     pan.setLayout(null);
		     
		     Font btnFont=new Font("serif", 0, 20);
		     Font labFont=new Font("arial", 1, 20);
		     Font textFont=new Font("arial", 2, 20);
		     
		     JButton btn[]=new JButton[17];
		     for(int i=0;i<17;i++) {
		    	 btn[i]=new JButton();
		    	 btn[i].addActionListener(new ActionListener() {
		    		 public void actionPerformed(ActionEvent e) {
		    			 btnClick((JButton)e.getSource());
		    		 }
		    	 });
		    	 btn[i].setSize(100,25);
		    	 btn[i].setFont(btnFont);
		    	 btn[i].setLocation(30,50+i*30);
		    	 btn[i].setBackground(Color.GREEN);
		    	 pan.add(btn[i]);
		     }
		     for(int i=0;i<10;i++) btn[i].setText(""+i);
		     btn[10].setText("+");
		     btn[11].setText("-");
		     btn[12].setText("/");
		     btn[13].setText("*");
		     btn[14].setText("=");
		     btn[15].setText("C");
		     btn[16].setText("Exit");
		     
		     JLabel lab= new JLabel("result");
		     lab.setFont(labFont);
		     lab.setBounds(130,0,300,50);
		     pan.add(lab);
		     
		     text=new JTextArea();
		     text.setFont(labFont);
		     text.setBounds(300,10,300,35);
		     text.setForeground(new Color(0,0,100));
		     text.setBackground(Color.WHITE);
		     pan.add(text);
		     con.add(pan);
		     pan.setBackground(Color.RED);
		     
		     setBounds(200,75,800,600);
		     setTitle("Calculator");
		     setVisible(true);
		}	     	
	}


