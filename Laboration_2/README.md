# Laboration 2

## Environments & Tools

## Purpose
The aim of this lab is to demonstrate the application of the **Decorator** Design Pattern in a secure message transmission 
scenario, where messages need to be encrypted and decrypted while being transferred between spy handlers through field 
agents. The provided design needs to be implemented, ensuring that the encryption and decryption processes work as 
intended, and the solution adheres to the **Decorator** Design Pattern principles.

### Concrete Goals
- Implement the **``Content``** class as the abstract base component, in compliance to its specification, and implement\
the **``Operative``** class as the abstract base decorator, from which concrete decorators will derive.
- Implement the **``Container``** class as the concrete component, responsible for the base storage of the encrypted\
message content and initial encryption.
- Implement the **``Spy``** class as a concrete decorator, responsible for increasing the encryption level each time a\
new **``Spy``** is added to the decoration chain.
- Implement the **``SpyMaster``** class as a concrete decorator, responsible for decrypting the encrypted message and\
applying the decryption key based on the actual encryption depth.
- Ensuring that the solution complies with design specifications, the provided client code, and passes the provided\
unit tests.

## Procedures

## Discussion