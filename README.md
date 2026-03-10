## UC3: Track Unique Bogie IDs (Set – HashSet)

### Goal
Ensure duplicate bogie IDs are not added.

### Concepts
- `Set` interface
- `HashSet`
- Automatic deduplication
- Unordered storage

### Implementation Summary
- Add IDs with duplicates (e.g., BG101 twice)
- Print final unique set
- Verify duplicate removal

### Sample Output
```text
Bogie IDs added (including duplicates): BG101, BG102, BG103, BG101, BG102, BG104
Final Unique Bogie IDs (HashSet): [BG101, BG102, BG103, BG104]
Total unique bogie IDs count: 4
```

> Note: `HashSet` does not guarantee print order.

---
