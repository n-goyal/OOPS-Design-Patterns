### Adapter Pattern

_Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces_

- Client is implemented against the target interface.
- Adapter implements the target and holds the instance of the Adaptee.

1. Client makes request() to Adapter
2. Adapter transforms the request and make transformedRequest() to Adaptee

In our example - We converted our duck interface to turkey interface
