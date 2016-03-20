package assignment7.firm;

public abstract class Info {

	protected int id;
	
	public String getInfo(int id) {
		if (this.id == id)
			return generateInfo();
		
		return "Id does not match";
	}
	
	protected abstract String generateInfo();
}