package java_20191125;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("여창혁");
		m.setZipcode("13744");
		m.setAddress1("천안");
		m.setAddress2("두정동");
		m.setEmail("howking327@gmail.com");
		m.setSsn("950420-1111111");
		m.setAge(25);
		m.setPassword("1234");
		m.setHeight(179.6);
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddress1());
		System.out.println(m.getAddress2());
		System.out.println(m.getEmail());
		System.out.println(m.getSsn());
		System.out.println(m.getAge());
		System.out.println(m.getPassword());
		System.out.println(m.getHeight());
	}
}
