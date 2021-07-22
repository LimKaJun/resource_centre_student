
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += String.format("%-10s %-30s %-10s %-10s %-20s\n", this.getAssetTag(),
				this.getDescription(), 
				ResourceCentre.showAvailability(this.getIsAvailable()),
				this.getDueDate(),this.getOs());
		return output;
	}
}


