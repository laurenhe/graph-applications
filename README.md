# graph-applications

This is an implementation of a graph interface using an adjacency list representation.
It is designed to represent various graph types (e.g., directed/undirected, weighted/unweighted, cyclic/acyclic, etc). 

This graph data structure uses an interface to decouple the abstraction from the implementation. An adjacency list class is used here to implement the graph interface but an adjacency matrix could very well also be used. The AdjacencyList class has two attributes: an adj map to store the adjacency list and an isDirected boolean to indicate whether the adjacency list represents a directed or undirected graph. The map has Vertex objects as keys and a List of Edge objects as values. The list is implemented through a linked list. Adj is declared as a HashMap in the constructor of the class. The constructor takes a boolean parameter to set the graph to be either directed or undirected. 

The AdjacencyList class consists of various methods used to perform basic graph operations, the most important of which being the addEdge() method. The addEdge() method is used to build the edges between source and destination vertices. Source and destination vertices are added to adj as keys. A new Edge object with the corresponding destination vertex is added to the value list of the source vertex. For undirected graphs, the source vertex is also added to the value list of the destination vertex. The AdjacencyList class is composed of the Vertex and Edge class. The Edge class in turn is composed of the Vertex class. These classes are defined with generic type. Type parameters allow for code reusability when working with different inputs. 

The GraphAlgorithms class makes use of static methods and is dependent on the AdjacencyList, Vertex, and Edge classes.  

To use the graph data structure, create a graph object of the class AdjacencyList that implements the Graph interface. Construct either a directed or undirected graph by passing in a boolean value to the constructor. Passing in true gives a directed graph while passing in false gives an undirected graph. After the graph is constructed, generate new Vertex objects with your type of choice. Once the vertices are created, clients can use the addEdge() method to add corresponding edges to their graph by passing in a source and destination vertex for each method call.
