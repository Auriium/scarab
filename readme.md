Scarab is a retarded ECS that is slightly better than artemis

The walkStrategy determines how nodes are read and behaviors are fired.

TODO: eventsystem: EventIdentifier / EventRule that can determine whether a system is fired based on

if we have an aspect of type y and...

a. if an aspect of type x is found on the same node
b. if an aspect of type x is found on the same node or any child nodes
c. if an aspect of type x is not found on the same node
d. if an aspect of type x is not found on the same node or any child nodes

This needs to also be usable for a BasicSystem implementation as well.