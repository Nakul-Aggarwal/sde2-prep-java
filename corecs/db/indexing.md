# Indexing

## What is an Index?
- Data structure to improve query performance
- Speeds up data retrieval

## Types of Indexes
- **B-tree**: Balanced tree, good for range queries
- **Hash**: Fast lookups, not for ranges
- **Bitmap**: For low-cardinality columns
- **Full-text**: For text search

## Pros
- Faster SELECT queries
- Can enforce uniqueness

## Cons
- Slower INSERT/UPDATE/DELETE
- Uses additional storage space
- Needs maintenance

## When to Use
- Columns frequently used in WHERE clauses
- JOIN conditions
- ORDER BY clauses