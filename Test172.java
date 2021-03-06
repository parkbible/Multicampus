import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class XCanvas extends Canvas {
	private String tf2 = null;
	
	public XCanvas() {
		setSize( 500, 200 );
		setBackground( Color.YELLOW );
		
	}
	
	// 처음 그리고 크기 변경시.
	// app이 캔버스에 그려지는 그림을 다시 그릴 필요가 있다고 판단되는 시점에서 호출된다.
	public void paint(Graphics g){
		System.out.println("paint");
		//바둑판
		Graphics2D g2 = (Graphics2D)g;
		for(int i=0; i<10; i++){
			for(int j=0; j<4; j++){
				if((i+j)%2 == 0){
					g2.setColor(Color.WHITE);
				}
				else{
					g2.setColor(Color.BLACK);
				}
				g2.fillRect(i*50, j*50, 50, 50);
			}
		}
		update(g);
	}
	
	/*
		사용자에 의해서 그림이 다시 그려질 필요가 있을 때 호출되는 함수이다.
		기존 그림은 바둑판 -> 버튼 눌렀다 -> repaint -> update 호출 -> 바둑판 그리고 그 위에 점 찍음.
		
		버튼 누르거나 클릭이 일어났을 때 그림이 다시 그려져야 할 필요가 있을 때는
		update에서 그림을 그리게 만들고 paint에서는 update를 호출하는 형태로 오버라이딩 해 준다.
		모든 그림은 update에서 그리게 한다.
	*/
	
	public void update(Graphics g){
		System.out.println("update");
		if(tf2 == "0 0"){
			System.out.println("dd");
		}
	}
}


class XFrame extends Frame implements ActionListener {
	public XFrame() {    // 생성자
		Panel p1 = new Panel();
		final XCanvas xc = new XCanvas();
		p1.add( xc );
			
		Button btn = new Button("Click");
		
		/*
			anonymous 클래스를 이용한 버튼의 동작에 따른 코드.
			객체지향적이지는 않지만 코드가 깔끔해진다.
			
			GUI 관련 이벤트처리, 즉 XXX 상황이 벌어졌을 때 동작하는 코드에 대해서는
			관찰자 패턴 + 어나니머스 클래스 의 조합은 거의 피할 수 없다.
			
		*/
		TextField tf = new TextField( 24 );
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){    // 밑에있는 actionPerformed을 오버라이딩함
				tf2 = tf.getText();
				System.out.println(tf2);    // 텍스트박스에 타이핑한게 출력됨
				xc.repaint();
			}
		});
		
		Panel p2 = new Panel();
		p2.add( tf );
		p2.add( btn );
		
		add( p1 , BorderLayout.CENTER );
		add( p2 , BorderLayout.SOUTH );
		
		setSize( 600, 360 );
		setVisible( true );
	}
	

}

public class Test172 {
	public static void main( String[] args ) {
		Frame f = new XFrame();
	}
}
/*
public void addActionListener(ActionListener l)

java.awt.event
Interface ActionListener
	void actionPerformed(ActionEvent e)
	
	앞서 배운 관찰자 패턴이 그대로 적용되는 케이스다.
	Button : 관찰대상
	Apple : 관찰자 
	이 둘사이는 ActionListener 라는 인터페이스로 느슨하게 연결되어 있고 
	
	Button 의 Action 상황이 벌어지면 addActionListener 로 등록된 관찰자가 오버라이딩하는 
		actionPerformed 가 호출되게 되는 설계.
*/