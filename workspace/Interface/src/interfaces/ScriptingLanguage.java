package interfaces;

public interface ScriptingLanguage {

	public static final boolean FLEXIBLE = true;

	// boolean flexible=true;
	public abstract void code();

	public abstract void compile();

	public abstract void execute();

}
