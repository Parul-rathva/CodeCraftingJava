## Variables
A variable is a container (storage area) used to hold data.
Each variable should be given a unique name (identifier).  

## Data Types
Data types are declarations for variables. This determines the type and size of  data associated with variables which is essential to know since different data  types occupy different sizes of memory.

There are 2 types of Data Types :
    Primitive Data types : to store simple values
    Non-Primitive Data types : to store complex values

	    Primitive Data Types
	        These are the data types of fixed size.
	
                Data Type - Meaning - Size (in Bytes) ---> Range

                byte - 2’s complement integer - 1 ---> -128 to 127
                short - 2’s complement integer - 2 ---> -32K to 32K
                int - Integer numbers - 4 ---> -2B to 2B
                long - 2’s complement integer (larger values) - 8 ---> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                float - Floating-point - 4 ---> Upto 7 decimal digits
                double - Double Floating-point - 8 ---> Upto 16 decimal digits
                char - Character - 2 ---> a, b, c ..
                                    ---> A, B, C ..
                                    ---> @, #, $ ..
                bool - Boolean - 1 - True, false

        Non-Primitive Data Types
            These are of variable size & are usually declared with a ‘new’ keyword.

                Eg : String, Arrays

                String name = new String("Aman");
                    int[] marks = new int[3];
                    marks[0] = 97;
                    marks[1] = 98;
                    marks[2] = 95;

## Constants
A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.
    Eg: 
        final float PI = 3.14F;