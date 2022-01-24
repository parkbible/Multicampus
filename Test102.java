abstract class Temp{
	abstract public void print();
}

class Temp2 extends Temp {
	public void print(){
		System.out.println("HelloWorld");
	}
}

public class Test102{
	public static void main(String[] args){
		// Temp t = new Temp(); ����.
		Temp t = new Temp2();    // ���������� �����ؼ� �������̵��� �Լ��� ȣ���ϴ� ��찡 ����!
		t.print();
	}
}

/*
	abstract : �ν��Ͻ��� ���� �� ���� Ŭ����
	(Ŭ������ �ϴ� �� : ������ ��������, �ν��Ͻ� ����, ��ӹ޾� Ŭ���� ����)
	���� �ν��Ͻ����� ���� �������� �� �ȴ�.
	
	abstract method : ����Ǿ����� ���ǵ��� ���� �޼ҵ�.(�ڿ� �����ݷ�)
	���� Ŭ���� �ȿ� abstract method�� �ϳ��� ���ԵǾ��ִٸ� �� Ŭ������ abstract method�� �Ǿ�� �Ѵ�.
	���� abstract Ŭ������ ��ӹ��� Ŭ������ abstract�� �Ǿ�� �Ѵ�.
	������! ���� �ڼ� Ŭ�������� �������̵��ߴٸ� abstract�� ������ ������. �׷� �ڼ� Ŭ���� ��ü�� abstract�� �� �� �ִ�.
	
	abstract class�� Ȱ���� �� [A t = new B()]�� ����ϴ� ��찡 ����!
	
	�ڹ��� ��� ���� ���������� �Լ������͸� �̿��� ȣ���� ����ϰ� �ִµ�
	abstract method�� �Լ������Ϳ� null���� ����ִ� �Լ��� �ش��Ѵ�. �׷��� �ν��Ͻ��� ���� ����.
	null�� ����ִµ� �Լ������ͷ� �Լ� ȣ���ϸ� ������ ������ abstract�� �ν��Ͻ� �ƿ� �������ϰ� ���Ƴ���.
	
	�������̵��� ��ü�� ? ���󿡼� ����� �Լ������Ͱ� �ڼտ��� ������ �Լ� ��ü�� ����Ű�� ��.
	abstract method�� �������̵� �ϸ�, null���� �� �Լ������Ͱ� ���ο� ��ü�� ����Ű�� �ȴ�.
	null���� ���ư��� -> �׷� abstract�� ������ ��������. ���� �ν��Ͻ� ������ ����������.
*/