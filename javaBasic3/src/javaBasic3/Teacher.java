package javaBasic3;

public class Teacher {
	
	//��� �ʵ�, �ʵ�
	String �ڵ�;
	String �̸�;
	String ����;
	int �޿�;
	String ����;
	int �ü�;
	
	public Teacher(String �����ڵ�, String ����, String ������, int �޿�, String ����, int �ü�) {
		this.�ڵ� = �����ڵ�;
		this.�̸� = ����;
		this.���� = ������;
		this.�޿� = �޿�; // �ʵ忡 �ִ� �޿� ������ �������ְ�ʹ�. this �ʵ��� ��� ����
		this.���� = ����;
		this.�ü� = �ü�;

	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public String get�ڵ�() {
		return �ڵ�;
	}

	public void set�ڵ�(String �ڵ�) {
		this.�ڵ� = �ڵ�;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public int get�޿�() {
		return �޿�;
	}

	public void set�޿�(int �޿�) {
		this.�޿� = �޿�;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public int get�ü�() {
		return �ü�;
	}

	public void set�ü�(int �ü�) {
		this.�ü� = �ü�;
	}

	int[] ����ó��() {
		return null;
	}
	
	String[] ����Ʈ�˻��ϱ�() {
		return null;
	}
	
	void �����ϱ�() {
		
	}
	
	void �ް��ϱ�() {
		
	}

}
