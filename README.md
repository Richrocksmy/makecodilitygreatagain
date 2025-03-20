
Making Codility Great Again
---

Benchmarking agains the following Codility tasks -

## Task 1 - SQL

### SQL Tested [here](https://sqltest.net)

Data:

```sql
CREATE TABLE invoice_items ( 
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
inv_num integer NOT NULL, 
item varchar(10) NOT NULL,
price integer NOT NULL
); 


INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('1', '1', 'apples', 100);
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('2', '2', 'oranges', 1); 
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('3', '3', 'pears', 40);
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('4', '4', 'bananas', 25); 
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('5', '5', 'mangos', 10);
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('6', '6', 'pineapples', 50);
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('7', '3', 'soup', 5);
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('8', '4', 'melons', 20);
INSERT INTO `invoice_items` (`id`, `inv_num`, `item`, `price`) VALUES ('9', '5', 'bread', 35);

-- 1 --> 100
-- 2 --> 1
-- 3 --> 45
-- 4 --> 45
-- 5 --> 45
-- 6 --> 50
```

Answer:

```sql
SELECT 
inv_num,
SUM(price) price
FROM invoice_items 
GROUP BY inv_num
ORDER BY inv_num DESC
```

## Task 2

