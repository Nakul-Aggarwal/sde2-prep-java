# Joins

## Types of Joins

### Inner Join
- Returns rows with matching values in both tables
```sql
SELECT * FROM table1 INNER JOIN table2 ON table1.id = table2.id;
```

### Left Join (Left Outer Join)
- Returns all rows from left table, matching rows from right
- NULL for non-matching right rows
```sql
SELECT * FROM table1 LEFT JOIN table2 ON table1.id = table2.id;
```

### Right Join (Right Outer Join)
- Returns all rows from right table, matching rows from left
- NULL for non-matching left rows

### Full Outer Join
- Returns all rows from both tables
- NULL for non-matching rows

### Cross Join
- Cartesian product of both tables

## Join Performance
- Use indexes on join columns
- Avoid unnecessary joins
- Consider denormalization for read-heavy systems