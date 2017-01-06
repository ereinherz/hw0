package uchidb;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ContainerImp<T,S> implements Containers<T,S> {
	public Map<S,T> map;

	public Set<T> initSet(T[] tArray) {
		return new HashSet<T>(Arrays.asList(tArray));
	}

	public List<T> initList(T[] tArray) {
		return Arrays.asList(tArray);
	}

	public Map<S,T> initEmptyMap() {
		return new HashMap<S,T>();
	} 

	public void storeMap(Map<S,T> mapToStoreInClass) {
		map = mapToStoreInClass;
	}

	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		if (overwriteExistingKey || !map.containsKey(key)) {
			map.put(key,value);
			return true;
		} else {
			return false;
		}
	}

	public T getValueFromMap(S key) {
		return map.get(key);
	}

	public T getValueFromMap(S key, T defaultValue) {
		if (map.containsKey(key)) {
			return map.get(key);
		} else {
			return defaultValue;
		}
	}
}
