package pack;

public class TestBank {

	public static void main(String[] args) {
		
		AbstractClassBank b=new SBIBank();
		System.out.println(b.generateInterest());
		
		AbstractClassBank c=new FederalBank();
		System.out.println(c.generateInterest());

		System.out.println("NewMavenProject Pull Request Successfully Done");

	} }
