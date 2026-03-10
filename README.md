## UC6: Map Bogie to Capacity (HashMap)

### Goal
Associate each bogie with capacity using key–value mapping.

### Concepts
- `Map` interface
- `HashMap`
- `put()`
- `entrySet()` iteration
- Key-based lookup

### Implementation Summary
- Map bogie names to capacities:
  - First Class -> 24
  - Cargo -> 120
  - Sleeper -> 72
  - AC Chair -> 56
- Iterate and print mapping

### Sample Output
```text
Bogie Capacity Details:
First Class -> 24
Cargo -> 120
Sleeper -> 72
AC Chair -> 56
```

> Note: `HashMap` iteration order is not guaranteed. Use `LinkedHashMap` if strict output order is required.

---
