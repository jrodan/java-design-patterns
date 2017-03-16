
# Java Design Patterns
## MVC

- MVC = Model-View-Controller 
- Used to separate application's concerns
- Hides the data access layer from the users
- Provides a lighter complexity in each layer
- Model
	- JAVA POJO
	- holds data
	- can update the Controller
- View
	- Visualization of the Model
- Controller
	- Aggregates Model and View 
	- Controls data flow
	- Updates View if data were changed
- Implementation Details
	- https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm

## Iterator

- Access the elements of a collection object in sequential manner without any need to know its underlying representation.
- Consists of Iterator, Controller and Repository
- ![](https://www.tutorialspoint.com/design_pattern/images/iterator_pattern_uml_diagram.jpg)
- Samples
	- Access to elements in a set without access to the entire representation
- Implementation Details
	- https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm

## Proxy

- A class represents functionality of another class. 
- Allows for object level access control by acting as a pass through entity or a placeholder object.  
- Create object having original object to interface its functionality to outer world.
- ![](http://java.dzone.com/sites/all/files/proxy_seq.png)
- Samples
	- Used to save memory and load the original Object just when the data are needed
- Implementation Details
	- https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm

# Task

- Generate a Java tool which implements the Patterns 
	- Iterator
	- MVC
	- Proxy 
- The tool should provide some details about images in his view.
- The view should update once at least.
- The following attributes should be displayed:
	- File name
	- File path
	- File size
- Optional: A graphic UI provides an update button to refresh the UI
