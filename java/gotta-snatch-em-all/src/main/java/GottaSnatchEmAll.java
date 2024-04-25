import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !(myCollection.containsAll(theirCollection) || myCollection.isEmpty());
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        var common = new HashSet<>(collections.get(0));
        for (int i=1; i<collections.size(); i++) {
            common.retainAll(collections.get(i));
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        var all = new HashSet<String>();
        for (var cards : collections) { all.addAll(cards); }
        return all;
    }
}
