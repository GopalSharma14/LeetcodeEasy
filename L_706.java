class MyHashMap {
    
    private List<Entry>[] list;
    private int buckets =769;

    /** Initialize your data structure here. */
    public MyHashMap() {
        list = new LinkedList[buckets];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = key%buckets;
        if(list[index]==null)
            list[index]= new LinkedList<Entry>();
        for(Entry entry : list[index]){
            if(entry.key==key){
                entry.value= value;
                return;
            }                
        }
        list[index].add(new Entry(key,value));           
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = key%buckets;
        if(list[index]==null) return -1;
        for(Entry entry : list[index]){
            if(entry.key==key)
                return entry.value;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        Entry toRemove=null;
        int index=key%buckets;
        if(list[index]==null) return;
        for(Entry entry : list[index]){
            if(entry.key==key)
                toRemove=entry;
        }
        if(toRemove==null) return;
        list[index].remove(toRemove);
    }
    
    class Entry{
        int key;
        int value;
        
        public Entry(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */