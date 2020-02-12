package linkedlist;

public class TownD implements Comparable<TownD>{
	private String name;
	private int noKm;
	
	public TownD(String name, int noKm) {
		this.name = name;
		this.noKm = noKm;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noKm;
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
		TownD other = (TownD) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noKm != other.noKm)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.noKm;
	}


	@Override
	public int compareTo(TownD o) {
		if(this.noKm < o.noKm) {
			return -1;
		}
		if(this.noKm > o.noKm) {
			return 1;
		}
		return 0;
	}
}
