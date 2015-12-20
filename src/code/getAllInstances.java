@Override
public Set<EObject> getAllInstances(EClass type) {
    Set<EObject> retSet = new HashSet<EObject>(); (*@\label{line:newset}@*)
    Object typeKey = toKey(type);
    Set<Object> subTypes = contentAdapter.getSubTypeMap().get(typeKey);  (*@\label{line:subtypes}@*)
    if (subTypes != null) { (*@\label{line:subtypes-begin}@*)
        for (Object subTypeKey : subTypes) {
            final Set<EObject> instances = contentAdapter.getInstanceSet(subTypeKey);
            if (instances != null) {
                retSet.addAll(instances); 
            }
        }
    } (*@\label{line:subtypes-end}@*)
    final Set<EObject> instances = contentAdapter.getInstanceSet(typeKey);
    if (instances != null) {
        retSet.addAll(instances); (*@\label{line:instances}@*)
    }
    return retSet; (*@\label{line:return}@*)
}