
public class HasCodeExampl1 {
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public static void main(String[] args) {

		HasCodeExampl1 codeExampl1 = new HasCodeExampl1();
		
		String s1 = "test";
		String s2 = "test";

		HasCodeExampl1 codeExampl2 = codeExampl1;
		
		System.out.println(codeExampl2);

		HasCodeExampl1 codeExampl3 = new HasCodeExampl1();

		System.out.println("codeExampl1.hashCode()==" + codeExampl1.hashCode());
		System.out.println("codeExampl2.hashCode()==" + codeExampl2.hashCode());
		System.out.println("codeExampl3.hashCode()==" + codeExampl3.hashCode());
		System.out.println("s1.hashCode()==" + s1.hashCode());
		System.out.println("s2.hashCode()==" + s2.hashCode());

	}
}
