Scarab is a superior NodeComponent System framework, merging
the concepts of nodes and components.


Some terminology -

NodeComponent (Also goes by node, or component): a unique branching structure
that can have child nodes, and is composed of an aspect and a facet, as well as children (the child nodes)

Child Node: A node that is linked to by another node, and is ""lower"" in the hierarchy than it's parent.

Aspect: a unique set of data specific to the node that describes the requirements of a node that are unique to it and it alone. It cannot be
accessed or modified by any child node .

Facet: A set of data inherited from a parent node which describes the requirements in terms 
of data that is unique to it or it's parent(s). It can freely insert new data requirements
and expect all of it's child components to require the same 