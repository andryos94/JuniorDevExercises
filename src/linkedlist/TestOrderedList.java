package linkedlist;

public class TestOrderedList {

	public static void main(String[] args) {
		OrderedList<TownD> orderedTownsList = new OrderedList<>();
		
		orderedTownsList.addInOrderedList(new TownD("Timisoara", 100));
		orderedTownsList.addInOrderedList(new TownD("Arad", 150));
		orderedTownsList.addInOrderedList(new TownD("Bucuresti", 0));
		orderedTownsList.addInOrderedList(new TownD("Ploiesti", 30));
		
		System.out.println(orderedTownsList);

	}

}
