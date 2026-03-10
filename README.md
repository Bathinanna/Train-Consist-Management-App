## UC4: Maintain Ordered Bogie Consist (LinkedList)

### Goal
Model train chaining with efficient insertion/deletion while preserving order.

### Concepts
- `LinkedList`
- `add(index, element)`
- `removeFirst()`, `removeLast()`
- Ordered node-based sequence

### Implementation Summary
- Initial consist: Engine, Sleeper, AC, Cargo, Guard
- Insert Pantry Car at position 2
- Remove first and last bogies
- Print final ordered consist

### Sample Output
```text
Initial Train Consist:
[Engine, Sleeper, AC, Cargo, Guard]

After Inserting 'Pantry Car' at position 2:
[Engine, Sleeper, Pantry Car, AC, Cargo, Guard]

After Removing First and Last Bogie:
[Sleeper, Pantry Car, AC, Cargo]
```

---
