package behavorial.iterator.iterators;

import behavorial.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
