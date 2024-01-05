package com.cbfacademy.restapiexercise.ious;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ListIOURepository implements IOURepository {
    private final List<IOU> ious = new ArrayList<>();
}




// ### Implement the Repository

// A repository interface, `IOURepository` has been provided for you. Create a class that implements this interface using a `List` instance as the backing store and name it something sensible, e.g. `ListIOURepository`, with the following members:

// - `final List<IOU> ious = new ArrayList<>()` - list of IOUs stored in the API

// Set the appropriate accessibility modifiers for all members and annotate the class as a [Repository][2]. Pay attention to the exceptions defined on the interfaces and ensure your concrete class throws as appropriate.