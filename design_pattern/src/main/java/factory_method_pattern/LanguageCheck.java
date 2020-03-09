package factory_method_pattern;

public class LanguageCheck {

	public ProgrammingLanguage getInstance(String s)
	{
		if(s.equals("1")) {
			return (ProgrammingLanguage) new C();
		}
		else if(s.equals("2")) {
			return (ProgrammingLanguage) new Java();
		}
		else {
			return (ProgrammingLanguage) new Python();
		}
	}

}
