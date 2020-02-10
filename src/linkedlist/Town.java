package linkedlist;

public class Town {
	private String name;
	private int noCitizens;

	public Town(String name, int noCitizens) {
		this.name = name;
		this.noCitizens = noCitizens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noCitizens;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noCitizens != other.noCitizens)
			return false;
		return true;
	}
	
}
