package com.cbfacademy.restapiexercise.ious;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IOUController {
    String IOUService iouService;

   

    // constructor
    public IOUController(IOUService iouService) {

     @getMapping("/")

     public String getAllIOUs() {
        
     }




    }
}





// <!-- ### Implement the Controller

// Create an `IOUController` class with the following members:

// - `IOUService iouService` - in instance of the service interface
// - `IOUController(IOUService iouService)` - constructor that accepts an instance of the service interface

// Add additional methods that defines endpoints for the following operations:

// | Method   | URL              | Description          |
// | -------- | ---------------- | -------------------- |
// | `GET`    | `/api/ious`      | Get all IOUs         |
// | `GET`    | `/api/ious/{id}` | Get an IOU by id     |
// | `POST`   | `/api/ious`      | Add an IOU           |
// | `PUT`    | `/api/ious/{id}` | Replace an IOU by Id |
// | `DELETE` | `/api/ious/{id}` | Delete an IOU by id  |

// Set the appropriate accessibility modifiers for all members and annotate the class as a [RestController][4]. -->