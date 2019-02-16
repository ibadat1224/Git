package interfaces;

public class Ruby extends ProgrammingLanguage implements ScriptingLanguage, OOPLanguage {

	@Override
	public void code() {
		System.out.println("Coding Ruby using to binary");

	}

	@Override
	public void compile() {
		System.out.println("excuting Ruby");
	}

	@Override
	public void execute() {
		System.out.println("Translating Ruby to binary");
	}

	@Override
	public void design() {
		// TODO Auto-generated method stub

	}

}
