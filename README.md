# huffman
## A Huffman Trie implementation based on the Huffman Encoding discussed in CMSC420: Advanced Data Structures.

Huffman encoding is a method of string encoding favoring characters with more occurrences. Long bit representation is used for less frequently used characters. 

A binary trie is built bottom-up during this greedy algorithm. <Character, Frequency> tuples are inserted into a priority queue and are dequeued into larger elements in pairs until the queue is empty. New nodes are created every two dequeues. By class convention, the first element to be dequeued is the left child, while the second element to be dequeued is the right child.

[More on Huffman Encoding](https://en.wikipedia.org/wiki/Huffman_coding)
