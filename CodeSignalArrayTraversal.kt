/* You're assisting in the creation of an algorithm for a novel game where a character hops between two arrays following certain rules. The game starts at position 1 of arrayA (which corresponds to array index 0 in Kotlin).

The value at the character's current position in arrayA determines the index it jumps to on the second array, arrayB. Upon landing on arrayB, it does the same thing: the value at the current position specifies the index it jumps to in arrayA. This iteration continues until the character lands on an index in arrayA that it has already visited, at which point the game concludes.

Your task is to develop a Kotlin function simulating this gameplay. The function receives two equal-length arrays of integers, arrayA and arrayB, each containing n elements (1 ≤ n ≤ 100). It should return a list of the 1-based indices on arrayB that the character visited before a position on arrayA was repeated.

Each element in the input arrays ranges from 1 to n, indicating the next 1-based index that the character will jump to in the other array. The function guarantees that each jump always results in a valid position within the same-length arrays, and a position in arrayA will inevitably be revisited.

Important Notes:

Kotlin arrays use 0-based indexing (arrayA[0], arrayA[1], etc.)
The values stored in the arrays represent 1-based position numbers (1, 2, 3, etc.)
To jump to a position, convert the 1-based value to a 0-based array index by subtracting 1
The result should contain the 1-based position numbers you jumped to in arrayB
Can you devise a function that proficiently simulates this gameplay?

Example

For arrayA = intArrayOf(1, 3, 2, 5, 4) and arrayB = intArrayOf(5, 4, 3, 2, 1) the output should be listOf(1, 4, 3, 2, 5) since it first lands at the first position in arrayB (the resulting list is listOf(1)), then goes to the fifth position in arrayA, then returns to the fourth position in arrayB (the resulting list becomes listOf(1, 4)), etc. */
