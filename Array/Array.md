# Creating an array
## Initializing
int[] array;
## With given length
int[] array = new Array[x];
## With specified value
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

array.length //length of the array as an integer, do not mix up with String's length()

for(i=0; i<x; i++){ //print the array
	System.out.print(array[i]);
}

for(i=0; i<x; i++){ //define the elements in the array based on i
	array[i] = i;
}

for (int i = 0; i < array.length; i++){//traversing an array
    .....//action
}

for (int i = array.length; i > 0; i--){//back to front
    .....//action
}
# Sequential Search
for (int i=0; i < array.length; i++)//sequential search through an array, return the index of the target
        {
            if (elements[i] == target)
            {
                return i;
            }
        }
        return -1;

	//binary search(for sorted arrays only)
	int left = 0;
        int right = array.length - 1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (target < array[middle])
            {
                right = middle - 1;//throw away the second half
            }
            else if (target > array[middle])
            {
                left = middle + 1;//throw away the first half
            }
            else
            {
                return middle;
            }
        }
        return -1;

	
int[][] array; //Creating a 2D array

int[][] array = new Array[x][y]; //x is the number of rows and y is the number of columns

int[][] array = {
		{"1", "2"},
            	{"3", "4"},
            	{"5", "6"}
        }; //create the 2D array with the values specified

for(i=0; i<x; i++){ //print the 2D array
	for(j=0; j<y; j++){
		System.out.print(array[i][j]);
	}
}
			  
for(i=0; i<x; i++){ //define the elements in the array based on i and j
	for(j=0; j<y; j++){
		array[i][j] = i+j;
	}
}

	

	
