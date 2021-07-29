class MyHashSet {

    /** Initialize your data structure here. */
    List<List<Integer>> parentList;
    int buckets=100;
    List<Integer> childList;
    
    public MyHashSet() {
        parentList= new ArrayList<>(buckets);
        for(int i=0;i<buckets;i++){
            parentList.add(null);
        }
    }
    
    public void add(int key) {
        int idx= key%buckets;
        childList = parentList.get(idx);
        if(childList==null){
            LinkedList<Integer> list = new LinkedList<>();
             list.add(key);
            parentList.set(idx,list);
        }else{
            if(!childList.contains(key))
                childList.add(key);
        }
        

    }
    
    public void remove(int key) {
        int idx = key%buckets;
        childList = parentList.get(idx);
        if(childList!=null)
            childList.remove(Integer.valueOf(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int idx = key%buckets;
        childList = parentList.get(idx);
        if(childList!=null && childList.contains(key))
            return true;
        return false;
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */