#include <stdio.h>
#include <stdlib.h>

void main()
{
    int maxsize = 0;
    int option = 0, top = -1;
    printf("*********ARRAY IMPLEMENTATION OF STACK*********");
    printf("\nEnter The Size of the Array : ");
    scanf("%d", &maxsize);
    printf("------------------------------------------------");
    int astack[maxsize];
    while (option != 4)
    {
        printf("\nChoose one of the following options");
        printf("\n1.Push Element\n2.Pop Element\n3.Show the Stack\n4.Exit");
        printf("\n------------------------------------------------");
        printf("\nEnter Your Choice: ");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            if (top == maxsize - 1)
                printf("Overflow !! of elements please increase size of Stack");
            else
            {
                printf("Enter Value to be Pushed : ");
                int val;
                scanf("%d", &val);
                top++;
                astack[top] = val;
                printf("\nItem Pushed on Top: ");
                printf("\n------------------------------------------------");
            }
            break;
        case 2:
            if (top == -1)
                printf("Underflow !! No Elements Left to Pop");
            else
            {
                top--;
                printf("Items Popped from Top");
                printf("\n------------------------------------------------");
            }
            break;
        case 3:
            printf("\nPrinting Stack Elements......");
            printf("\nThe Size of the Stack is : %d", maxsize);
            for (int i = top; i >= 0; i--){
                printf("\n%d . Element is %d", i, astack[i]);
            }
            printf("\n------------------------------------------------");
            break;
        case 4:
            printf("Exiting....");
            exit(0);
            break;
        default:
            printf("Please Enter a Valid Choice");
        }
    }
}