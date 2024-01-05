package com.cbfacademy.restapiexercise.ious;

import java.util.ArrayList;
import java.util.List;


public class ListIOUService implements IOUService {

    public final List<IOU> ious = new ArrayList<>();

    public ListIOUService (IOURepository iouRepository) {

    }
    

    
}



// ### Implement the Service

// A service interface, `IOUService` has been provided for you. Create a class that implements this interface using a `List` instance as the backing store and name it something sensible, e.g. `ListIOUService`, with the following members:

// - `final List<IOU> ious = new ArrayList<>()` - 
// - `public ListIOUService (IOURepository iouRepository)`

// Set the appropriate accessibility modifiers for all members and annotate the class as a [Service][3]. Ensure your code appropriately handles any exceptions thrown by the repository class.