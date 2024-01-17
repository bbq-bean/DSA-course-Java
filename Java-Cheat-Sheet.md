## HashSet
```
import java.util.HashSet;

HashSet<Integer> seent = new HashSet<>();

seent.contains(item);
seent.add(item);
seent.remove(item);
```
Java HashSet is similar to Python set().

## HashMap
```
import java.util.HashMap;

HashMap<Character, Integer> s_map = new HashMap<>();

s_map.containsKey(key);
s_map.put(key, value);
s_map.remove(key);
s_map.get(key);
s_map.getOrDefault(key, default value);
```

Java HashMap is like a Python dictionary. It looks like this:
{a=3, r=1, g=1, m=1, n=1}