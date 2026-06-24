### Theory
- Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order.

### Pseudo Code
```text
void bubble_sort( int A[ ], int n ) {
    int temp;
    for(int k = 0; k< n-1; k++) {
        // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations

        for(int i = 0; i < n-k-1; i++) {
            if(A[ i ] > A[ i+1] ) {
                // here swapping of positions is being done.
                temp = A[ i ];
                A[ i ] = A[ i+1 ];
                A[ i + 1] = temp;
            }
        }
    }
}

```
Lets try to understand the pseudo code with an example: A [ ] = { 7, 4, 5, 2}

<img width="1160" height="548" alt="Bubble sort" src="https://github.com/user-attachments/assets/91236a0b-8c08-46fc-b58b-ba665c9f1a0a" />


### Complexity:
The complexity of bubble sort is = O(N^2)
in both worst and average cases, because the entire array needs to be iterated for every element.
